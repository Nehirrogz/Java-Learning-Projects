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
public class GuessNumber {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int truenumber = (int) (Math.random()*101);
        int guess;
        int count =0;
        boolean isGuess = true;
        
        System.out.println("I kept a number in my mind");
      
        
        while(isGuess){
              System.out.println("Guess the number: ");
              guess = input.nextInt();
              count++;
              
              if(guess < truenumber){
                  System.out.println("Wrong answer! Increase the number.");
              }else if(guess > truenumber){
                   System.out.println("Wrong answer! Decrease the number.");
              }else{
                  System.out.println("CONGRATULATİONS! You found the number in " +count+ "tries.");
                  isGuess = false;
              }
        }
            
        }
    }
    

