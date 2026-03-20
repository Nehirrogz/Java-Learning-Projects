/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;
import java.util.Scanner;
import java.time.LocalTime;
/**
 *
 * @author nehiroguz
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String username= "nehirogz";
        String password = "nehir123";
        int attempt =0;
        
        boolean isGranted = false;
        String[] logs = new String[5];
        String[][] logTable = new String[3][3];
        
        while(attempt< 3 && !isGranted){
        System.out.print("Please enter your username: ");
        String myUsername = input.nextLine();
                 
        System.out.print("Please enter your password: ");
        String myPassword = input.nextLine();
                 
                 if(myUsername.equals(username) && myPassword.equals(password)){
                     System.out.println("Login successful!");
                     isGranted = true;
                 }else{
                logTable[attempt][0] = LocalTime.now().toString().substring(0, 8);
                logTable[attempt][1] = myUsername;
                logTable[attempt][2] = "192.168.1." + (10 + attempt);
                     logs[attempt] = "Failed attempt with username: " + myUsername;
                
                attempt++; 
                System.out.println("Incorrect entry! Remaining: " + (3 - attempt));
                 }
    }
        if(attempt==3){
            System.out.println("System locked.");
            
            System.out.println("\n--- SECURITY LOG REPORT ---");
            for (int i = 0; i < attempt; i++) {
                System.out.println("Log #" + (i + 1) + ": " + logs[i]);
        }
        
    
}
        
if(isGranted){
    System.out.println("\n--- [ADMIN PANEL] Access Granted ---");
    int choice=0;
    while(choice !=3){
        System.out.println("\n1- View Failed Login Logs");
        System.out.println("2- Run System Security Scan");
        System.out.println("3- Safe Logout");
        System.out.print("Selection: ");
        choice = input.nextInt();
        
        switch(choice){
            case 1:
                printTable(logTable, attempt);
                break;
                
            case 2:
                System.out.println("Scanning system for vulnerabilities...");
                System.out.println("[##########] 100% - No threats found.");
                break;
                
            case 3:
                System.out.println("Logging out... Stay safe, " + username);
                break;
                
            default:
                System.out.println("Invalid selection!");    
                
    }
}
    }
}
    public static void printTable(String[][] table, int attempt){
     if(attempt==0){
         System.out.println("No failed login attempts found in this session.");
            return;
     }
     System.out.println("\n--- DETAILED INCIDENT REPORT ---");
        System.out.println("ID\tTIME\t\tUSERNAME\tIP ADDRESS");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < attempt; i++) {
            System.out.print((i + 1) + "\t"); 
            for (int j = 0; j < 3; j++) {
                System.out.print(table[i][j] + "\t\t");
    }
            System.out.println();
}
    }
}
