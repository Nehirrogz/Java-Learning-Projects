/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

/**
 *
 * @author nehiroguz
 */
// This class is our database that keeps and manages all the locations
public class MyPlaceDatabase implements PlaceDB {
    private Place [] storage; // Array to store up to 100 locations
    private int size; // Keeps track of how many locations we actually added so far
    
    public MyPlaceDatabase(){
        this.storage= new Place[100];
        this.size=0;
    }
    
    // Adds a new place to the array but checks for duplicates first
    @Override
    public void addPlace(Place newPlace){
        // If this zipcode is already in the database, show error and stop
        if(lookupByZipcode(newPlace.getZipcode()) !=null){
            System.out.println("Error: Zipcode" +newPlace.getZipcode()+ "already exists.");
            return;
        }
        
        storage[size]= newPlace; // Put the new place into the current empty index, then increase the size
        size++;    
    }
    
    // Searches the array one by one to find the location with the matching zipcode
    @Override
    public Place lookupByZipcode(String zipcode){
        for(int i=0; i<size; i++){
            if(storage[i].getZipcode().equals(zipcode)){ // Checking if the current item's zipcode is equal to the searched one
                return storage[i];
            }
        }
        return null;
    }
    
    // Lists all the locations that start with the given numbers/letters
    @Override
    public void listAllPlaces(String prefix){
        boolean found= false;
        for(int i=0; i<size; i++){
            if(storage[i].getZipcode().startsWith(prefix)){ // If the zipcode starts with the prefix, print it
                System.out.println(storage[i].toString());
                found = true;
            }
        }
        if(!found){ // If the loop finished and we found nothing, print a message
            System.out.println("No places found starting with prefix: " + prefix);
        }
    }
    
    // Calculates the straight line distance between two zipcodes
    @Override
    public double distance (String zip1, String zip2){
        Place p1 = lookupByZipcode(zip1);
        Place p2 = lookupByZipcode(zip2);
        
        if(p1==null || p2==null){ // If one of the zipcodes doesn't exist, we cannot calculate distance
            return -1;
        }
        
        // We can only calculate distance if both places have coordinates
        if(p1 instanceof LocatedPlace && p2 instanceof LocatedPlace){
            // Convert them to LocatedPlace to reach getLatitude and getLongitude methods
           LocatedPlace lp1 = (LocatedPlace) p1;
           LocatedPlace lp2 = (LocatedPlace) p2;
           
           // Calculate the differences
           double latDiff = lp1.getLatitude()-lp2.getLatitude();
           double lonDiff = lp1.getLongitude()-lp2.getLongitude();
           
           // Use the formula
           return Math.sqrt((latDiff*latDiff)+(lonDiff*lonDiff));
                   
        }
        
        return -1; // If one of them is just a regular Place return -1
    }
}
