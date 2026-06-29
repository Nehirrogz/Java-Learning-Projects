/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;
import java.util.*;

/** This class is a possible user interface for the Place Database
 *   that uses the console to display the menu of command choices.
 */

/**
 *
 * @author nehiroguz
 */
public class PDConsoleIO {
     /** A reference to the PlaceDB object to be processed.
      Globally available to the command-processing methods.
   */
  private PlaceDB theDatabase = null;

  /** Scanner to read from input console. */
  private Scanner scIn = null;

  // Constructor
  /** Default constructor. */
  public PDConsoleIO() {
    scIn = new Scanner(System.in);
  }

  // Methods
  /** Method to display the command choices and process user
      commands.
      @param thePlaceDatabase A reference to the PlaceDB
             to be processed
   */
  public void processCommands(PlaceDB thePlaceDatabase) {
    String[] commands = {
        "Add Place",
        "Look Up by Zipcode",
	"List All Places by Zipcode Prefix",
	"Distance Between Zipcodes",
        "Exit"};

    theDatabase = thePlaceDatabase;
    int choice;
    do {
      for (int i = 0; i < commands.length; i++) {
        System.out.println("Select " + i + ": "
                           + commands[i]);
      }
      
        choice = scIn.nextInt(); // Read the next choice.
        scIn.nextLine(); // Skip trailing newline.
        switch (choice) {
          case 0:
            doAddPlace();
            break;
          case 1:
            doLookupByZipcode();
            break;
	  case 2:
	    doListAllPlaces();
            break;
	  case 3:
	    doDistance();
            break;
          case 4:
            break;  
          default:
            System.out.println("*** Invalid choice "  + choice  + " - try again!");                        
        }
    }
       while (choice != commands.length - 1);
       System.exit(0);
  }

  /** Method to add a place.
      pre:  The database exists. 
      post: A new place is added.
   */
  private void doAddPlace() {
      // Getting basic information from the user
          System.out.println("Enter zipcode: ");
          String zipcode = scIn.nextLine();
          
          System.out.println("Enter town: ");
          String town = scIn.nextLine();
          
          System.out.println("Enter state: ");
          String state = scIn.nextLine();
          
          System.out.println("Enter latitude and longitude: ");
          String latInput = scIn.nextLine();
          String lonInput = scIn.nextLine();
          
          System.out.println("Enter population: ");
          String popInput = scIn.nextLine();
          
          //If there is no location data
          if(latInput.equals("None") || lonInput.equals("None")){
              //If location is none but population has a value, show error
              if(!popInput.equals("None")){
                  System.out.println("Error: There should not be a place with population but without location.");
              return;
          }
          
          // create a standard place and add to array    
          Place p = new Place (zipcode,town,state);
          theDatabase.addPlace(p);
          System.out.println("Place added successfully.");
          
          }else{
              // While researching the parse methods to do this conversion, 
              // I got some help from the internet
              double lat= Double.parseDouble(latInput);
              double lon = Double.parseDouble(lonInput);
              
              //Check if population is none
              if(popInput.equals("None")){
                  LocatedPlace lp = new LocatedPlace(lat,lon,zipcode,town,state);
                  theDatabase.addPlace(lp);
                  System.out.println("Located Place added successfully");
              }else{
                  //If population also has a number, convert to int and create populated place
                  int population=Integer.parseInt(popInput);
                  PopulatedPlace pp = new PopulatedPlace(population,lat,lon,zipcode,town,state);
                  theDatabase.addPlace(pp);
                  System.out.println("Populated place added successfully.");
              }
          }
  }

  /** Method to lookup a place by zipcode.
      pre:  The database exists.
      post: No changes made to the database.
   */
  private void doLookupByZipcode() {
    // Request the zipcode.
    System.out.println("Enter zipcode");
    String theZip = scIn.nextLine();
    if (theZip.equals("")) {
      return; // Dialog was cancelled.
    }
    // Look up the zipcode.
    Place p = theDatabase.lookupByZipcode(theZip);
    if (p != null) { // Zipcode was found.
    	System.out.println(p.toString());
    }
    else { // not found.
      // Display the result.
      System.out.println("No such zipcode");

    }
  }

  /** Method to list all places whose zipcodes start with entered prefix.
      pre:  The database exists.
      post: No changes made to the database.
   */
  private void doListAllPlaces() {
    System.out.println("Enter zipcode prefix");
    String prefix = scIn.nextLine();
    if (prefix.equals("")) {
          return; // Dialog was cancelled.
    }
   
    theDatabase.listAllPlaces(prefix);
    
  }

   /** Method to compute the distance between two zipcodes.
      pre:  The database exists.
      post: No changes made to the database.
   */
  private void doDistance() {
      //Get two zipcodes from user
    System.out.println("Enter two zipcodes");
    String zip1 = scIn.nextLine();
    String zip2 = scIn.nextLine();
    
    //Get distance from the database
    double dist = theDatabase.distance(zip1, zip2);
    
    //Print result or show error if it returns -1
    if(dist==-1){
        System.out.println("Distance could not be calculated");
    }else{
        System.out.println("The Euclidean distance between " + zip1 + " and " + zip2 + " is: " + dist);
    }
    
  }
    
  public static void main(String args[]) {
	  PDConsoleIO ui = new PDConsoleIO();
	  PlaceDB pd = new MyPlaceDatabase();
	  ui.processCommands(pd);
  }
}