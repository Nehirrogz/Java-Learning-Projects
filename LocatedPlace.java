/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;

/**
 *
 * @author nehiroguz
 */
// A subclass that extends Place to add geographic coordinates
public class LocatedPlace extends Place {
    // Private variables to store geographic coordinates securely
    private double latitude;
    private double longitude;

    // Constructor that initializes basic location data via the parent class and adds coordinates
    public LocatedPlace(double latitude, double longitude, String zipcode, String town, String state) {
        super(zipcode, town, state);
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    // Appends the latitude and longitude details to the base location string format
    @Override
    public String toString() {
        return super.toString() + ", " + latitude + ", " + longitude;
    }    
}
