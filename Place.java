/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;


/**
 *
 * @author nehiroguz
 */
// Base class that holds the fundamental properties of a geographic location
public class Place {
    // Declaring variables as private to restrict direct external access
    private String zipcode;
    private String town;
    private String state;

    // Constructor to initialize the object with basic location data
    public Place(String zipcode, String town, String state) {
        this.zipcode = zipcode;
        this.town = town;
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getTown() {
        return town;
    }

    public String getState() {
        return state;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setState(String state) {
        this.state = state;
    }

    // Returns the data in the exact string format required by the assignment
    @Override
    public String toString() {
        return zipcode + ": " + town + ", " + state;
    }  
}
