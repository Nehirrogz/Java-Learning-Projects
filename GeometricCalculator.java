/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiniProjects;

import java.util.Scanner;

/**
 *
 * @author nehiroguz
 */
public class GeometricCalculator {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("--Welcome, please select one method.--");
        int select=0;
        
        while(select != 3){
        
            
            System.out.println("1-Calculate the hypotenuse");
            
            
            
                System.out.println("2-Filter odd numbers");
                
                
            
                System.out.println("3-Exit");
                
        
        select = input.nextInt();
        
        switch(select){
            
            case 1:
            System.out.print("Enter the length of the first side of the triangle: ");
            double firstSide = input.nextDouble();
            
            System.out.print("Enter the length of the second side of the triangle: ");
            double secondSide = input.nextDouble();
            
            double hypotenuse = Math.sqrt(Math.pow(firstSide, 2)+ (Math.pow(secondSide,2)));
            
            System.out.printf("Hypotenuse length is %.2f cm\n", hypotenuse);
            input.nextLine();
            break;
            
            case 2:
                System.out.print("Please enter an integer: ");
                int number = input.nextInt();
                
                System.out.println("Listing even numbers from " +number+ " to 1...");
                
                for(int i = number; i>=1; i--){
                    
                    if(i%2 !=0){
                        continue;
                    }
                        System.out.print(i+ " ");
                    }
                System.out.println();
                input.nextLine();
                break;
                
            case 3:
                System.out.println("The program is ending...");
                break;
                
            default:
                System.out.println("Invalid selection. Please enter 1 , 2 , and 3.");
                }
            
        }
        
    }
    
}
