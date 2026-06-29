/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

/**
 *
 * @author nehiroguz
 */
public class Test {
    public static void main(String[] args) {
        // Creating the database
        MyPlaceDatabase db = new MyPlaceDatabase();

        // Creating places
        Place ankara = new Place("06000", "Ankara", "TR");
        LocatedPlace istanbul = new LocatedPlace(23.45, 112.89, "34000", "Istanbul", "TR");
        PopulatedPlace izmir = new PopulatedPlace(15000, -12.34, 45.67, "35000", "Izmir", "TR");

        // Testing addPlace method
        db.addPlace(ankara);
        db.addPlace(istanbul);
        db.addPlace(izmir);

        // Testing lookupByZipcode method
        System.out.println(db.lookupByZipcode("34000"));

        // Testing distance method
        System.out.println(db.distance("34000", "35000"));

        // Testing listAllPlaces method
        db.listAllPlaces("06");
    }
    
}
