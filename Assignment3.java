/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment3;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author nehiroguz
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // Create a Scanner object to read inputs from the user console
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        // Get the file name from the user
        String fileName = input.nextLine();
        
        // This variable will store the total number of lines in the CSV file
        int lineCount =0;
        
        // First try-catch: We open the file for the first time just to count the lines
        try{
        // Open the file to count how many rows it has
        Scanner counter = new Scanner(new File(fileName));
        // Loop through every line until the end of the file
        while(counter.hasNextLine()){
            counter.nextLine();
            lineCount++; // Increment the counter for each line found
        }
        counter.close(); // Close the counter scanner to free resources
        
        }catch(FileNotFoundException e){ // If the file does not exist, print an error message
            System.out.println("Error: File not found." + fileName);
        }
        // Create arrays for male and female names using the correct size we just counted
        PopularName[] maleNames = new PopularName[lineCount];
        PopularName[] femaleNames = new PopularName[lineCount];
        
        // Variables to keep track of the grand total of baby numbers
        int totalMale=0;
        int totalFemale=0;
        
        // Second try-catch: Open the file again to read the actual data and fill our arrays
        try{
        Scanner fileReader = new Scanner(new File(fileName));
        int i =0; // Index variable to place objects into the arrays step by step
        while(fileReader.hasNextLine()){ // Read the file line by line
            String line = fileReader.nextLine();
            String[] parts = line.split(","); // Split the line by comma to get each piece of information
            
            // Parse the string values into correct data types
            int rank = Integer.parseInt(parts[0]);
            String maleName=parts[1];
            int maleNumber = Integer.parseInt(parts[2]);
            String femaleName=parts[3];
            int femaleNumber=Integer.parseInt(parts[4]);
            
            // Create new PopularName objects and store them in the arrays
            maleNames[i]= new PopularName(maleName,rank,maleNumber,0.0);
            femaleNames[i]=new PopularName(femaleName,rank,femaleNumber,0.0);
            
            // Add the current baby counts to the total sums
            totalMale +=maleNumber;
            totalFemale+=femaleNumber;
            i++; // Move to the next index for the next loop iteration
        }
        fileReader.close(); // Close the file reader scanner
     
        }catch(FileNotFoundException e){ // Catch error if file is missing in the second step
          System.out.println("Error: File not found. " + fileName);  
        }catch(NumberFormatException e){ // Catch error if a text cannot be converted into an integer
            System.out.println("Error: File format is invalid.");
        } catch (ArrayIndexOutOfBoundsException e){ // Catch error if a row does not have enough columns or fields
            System.out.println("Error: A line in the file is missing fields.");
        }
        System.out.println("File is uploaded."); // Print success message after successfully loading the file data
       
        // Sort both arrays alphabetically by name using the bubble sort method below
        bubbleSort(maleNames);
        bubbleSort(femaleNames);
        
        // Start the user search loop
        String answer = "y";
        while (answer.equalsIgnoreCase("y")){
            
            // Ask the user if they want to perform a search
            System.out.print("Do you want to search for a name and see its statistics (y/n)?");
            answer = input.nextLine();
 
            // If the user types anything other than 'y' or 'Y', exit the loop
            if (!answer.equalsIgnoreCase("y")){
                break;
            }
            
            // Get gender input from the user
            System.out.print("Enter a gender: ");
            String gender = input.nextLine();
 
            // Get the name to search from the user
            System.out.print("Enter a name: ");
            String searchName = input.nextLine();
 
            // Define references to select which array and total count to use
            PopularName[] targetArray;
            int total;
 
            // Choose the correct array and total sum based on the gender input
            if (gender.equalsIgnoreCase("male")){
                targetArray = maleNames;
                total = totalMale;
            } else if (gender.equalsIgnoreCase("female")){
                targetArray = femaleNames;
                total = totalFemale;
            } else { // If gender is not male or female, print error and ask again
                System.out.println("Invalid gender. Please enter male or female.");
                continue;
            }
  
            // Call the linearSearch method to find the index of the name
            int i = linearSearch(targetArray, searchName);
 
            if (i == -1) { // If the method returns -1, it means the name does not exist in the array
                System.out.println("Name not found: " + searchName);
            } else {
                PopularName found = targetArray[i]; // If found, get the object from the array using the index
                // Calculate the percentage of this name relative to the total babies of that gender
                double percentage = (found.getCount() / (double) total) * 100;
 
                // Print all the required statistics to the console
                System.out.println(found.getName() + ":");
                System.out.println("Index in sorted list: "+i);
                System.out.println("Rank in popularity: "+found.getRank());
                System.out.println("Number of babies: " +found.getCount());
                System.out.printf("Percentage of babies: %.2f%%%n",percentage);
            }
        }
        input.close(); // Close the console input scanner at the very end of the program
    }
    //Sorts the PopularName array alphabetically
    public static void bubbleSort(PopularName[] names){
        for (int i=0; i<names.length-1; i++){ // Outer loop runs for all elements in the array
            for(int j=0; j<names.length-1-i; j++){ // Inner loop compares adjacent elements
               if (names[j].getName().compareTo(names[j + 1].getName()) > 0){ // Compare names alphabetically using compareTo method
                   // Swap elements if they are in the wrong order
                   PopularName temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
               }
            }
        }
    }
    
    //Searches for a specific name in the array
    public static int linearSearch(PopularName[] names, String name) {
        for (int i = 0; i < names.length; i++) { // Look through every single element in the array one by one
            if (names[i].getName().equalsIgnoreCase(name)) { // Check if the current object's name matches the searched name
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if the loop finishes and the name is not found
    }
    
}
