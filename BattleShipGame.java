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
public class BattleShipGame {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int totalLine =6;
        int totalColumn =6;
        
        char [][] sea = new char [totalLine] [totalColumn];
        int[][]ships = new int [totalLine][totalColumn];
        
        int sunkenShips =0;
        int totalShips =3;
        
        for(int i=0; i<totalLine; i++){
            for(int j=0; j<totalColumn; j++){
                sea[i][j]='~';
                ships[i][j]=0;
            }
        }
        int placedShips =0;
        
        while(placedShips<totalShips){
         int randomLine =(int)(Math.random()*totalLine);
         int randomColumn =(int)(Math.random()*totalColumn);
         
         if(ships[randomLine][randomColumn]==0){
             ships[randomLine][randomColumn]=1;
             placedShips++;
         }
        }
        System.out.println("-WELCOME TO THE BATTLESHİP GAME-");
        System.out.println("There are 6 secret ships at sea. Enter the coordinates: ");
        
        while(sunkenShips<totalShips){
            
            System.out.print("\n   "); 
             for (int j = 0; j < totalColumn; j++) {
               System.out.print(j + " ");
}
            System.out.println(); 

              for (int i = 0; i < totalLine; i++) {
                  System.out.print(i + "  "); 
                
                for (int j = 0; j < totalColumn; j++) {
                    System.out.print(sea[i][j] + " "); 
                }
                
                System.out.println();
              }
              System.out.print("enter a line:");
              int line =input.nextInt();
              System.out.print("Enter a column: ");
              int column = input.nextInt();
              
              if(line<0 || line>= totalLine || column<0 || column>= totalColumn){
                 System.out.println("Please enter a number between 0 and 4");
                 continue;
              }
              
              if(sea[line][column] != '~'){
                  System.out.println("Commander! We've fired at this spot before.");
                  continue;
              }
              if(ships[line][column] ==1){
                  System.out.println(">CONGRATULATİONS! You hit a ship.<");
                  sea[line][column] = 'X';
                  sunkenShips++;
              }else{
                  System.out.println("Unfortunately, you missed it...");
                  sea[line][column] ='0';
              }
        }
        System.out.println("CONGRATULATİONS COMMANDER! YOU SANK ALL THE SHİPS.");
          
        for(int i=0; i<totalLine; i++){
            for(int j=0; j<totalColumn; j++){
                System.out.print(sea[i][j] +" ");
            }
            System.out.println();
        }
        
    }
    
}
