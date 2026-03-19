/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.pkg1;
import java.util.Scanner;
/**
 *
 * @author nehiroguz
 */
public class HotelReservation {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Number of hotel floor: ");
        int floor = input.nextInt();
        
        System.out.print("Number of hotel room: ");
        int room= input.nextInt();
        
        boolean[][] hotel = new boolean [floor][room];
        initRooms(hotel);
        
        int choice;
        do{
            System.out.println("1) Current Hotel Plan");
            System.out.println("2) Book a Room");
            System.out.println("3) Find First free Room");
            System.out.println("4) Free a room");
            System.out.println("5) Find three consecutive rooms");
            System.out.println("6) Total Occupied Rooms");
            System.out.println("0) Exit");
            System.out.print("Please choose an option: ");
            
            choice = input.nextInt();
            
            if (choice == 1) {
            print(hotel);
            }else if(choice ==2){
                System.out.print("Enter floor: ");
                int f = input.nextInt();
                System.out.print("Enter room: ");
                int r = input.nextInt();
                bookARoom(hotel, f, r);
            }else if(choice==3){
                System.out.print("Floor: ");
                int f = input.nextInt();
                System.out.print("Start room: ");
                int startRoom= input.nextInt();
                System.out.print("End room: ");
                int endRoom= input.nextInt();
                firstFree(hotel, f, startRoom, endRoom);
            }else if(choice==4){
                System.out.print("Floor: ");
                int f =input.nextInt();
                System.out.print("Room to free: ");
                int r = input.nextInt();
                hotel[f-1][r-1] = false;
                System.out.println("Room " + r + " on Floor " + f + " is now free.");
            }else if (choice == 5) {
            findThree(hotel);
            } else if (choice == 6) {
            System.out.println("Total Occupied: " + occupiedCount(hotel)); 
        }
            
                
            }while(choice !=0);
    }
    
    public static void initRooms(boolean[][] hotel){
        for(int i=0; i<hotel.length; i++){ 
            for(int j =0; j<hotel[i].length; j++){ 
                hotel[i][j]=false; 
            }
        }
    }
    
    public static void print(boolean[][] hotel){
        System.out.println("\nHotel's Current Floor Plan:");
        for (int i =0; i<hotel.length; i++){
            System.out.print("Floor " + (i + 1) + ": ");
            for (int j = 0; j < hotel[i].length; j++) {
                if(hotel[i][j]){
                    System.out.print("[X]");
                }else{
                    System.out.print("[O]");
            }
        }
        System.out.println();
    }
    }
    
    public static void bookARoom(boolean[][] hotel, int floor, int room){
       if(!hotel[floor-1][room-1]) {
           hotel[floor-1][room-1]=true;
           System.out.println("Room booked successfully.");
        } else {
            System.out.println("Room is already occupied!");
           
       }
    }
    
    public static void freeARoom(boolean[][] hotel, int floor, int room) {
        hotel[floor - 1][room - 1] = false;
        System.out.println("Room is free.");
        
    }
    
    public static void firstFree(boolean[][]hotel, int floor, int startRoom, int endRoom){
        int f = floor -1; //java 0 dan başladığı için yazdığımı anlasın diye
        for(int r = startRoom-1; r<=endRoom-1; r++){
            if(!hotel[f][r]){
                System.out.println("First free room is: Floor " +floor+ " room "+(r+1)); 
                return;
            }
        }
        System.out.println("No free room");
    }
    
    public static void findThree(boolean[][]hotel){
        for(int i=0; i<hotel.length; i++){
            for(int j=0; j<hotel[i].length -2; j++){
                if(!hotel[i][j]  && !hotel[i][j+1] && !hotel[i][j+2]){
                    System.out.println("Floor: " +(i+1)+ "rooms are: " +(j+1)+ ", " +(j+2)+ "and " +(j+3) );
                    return;
                }
            }
        }
        System.out.println("No block of three rooms found.");
    }
    
    public static int occupiedCount(boolean[][] hotel) {
        int count = 0;
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                if (hotel[i][j]) count++;
            }
        }
       
    return count;
    
}
}
