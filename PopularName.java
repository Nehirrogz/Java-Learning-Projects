/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment3;

/**
 *
 * @author nehiroguz
 */
public class PopularName {
    // Private variables to protect data from direct outside access
    private String name; // Stores the baby name
    private int rank; // Stores the popularity rank of the name
    private int count; // Stores the total number of babies born with this name
    private double percentage; // Stores the percentage of babies with this name

    public PopularName(String name, int rank, int count, double percentage) {
        // Assign the constructor parameters to the class instance variables
        this.name = name;
        this.rank = rank;
        this.count = count;
        this.percentage = percentage;
    }

    public String getName() { //Getter method to safely retrieve the baby name
        return name;
    }

    public int getRank() { //Getter method to safely retrieve the popularity rank
        return rank;
    }

    public int getCount() { //Getter method to safely retrieve the baby count
        return count;
    }

    public double getPercentage() { //Getter method to safely retrieve the percentage value
        return percentage;
    } 
}
