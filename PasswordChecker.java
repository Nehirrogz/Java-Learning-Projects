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
public class PasswordChecker {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        
        boolean isPassword = false;       
        
        while(!isPassword){
            
        System.out.print("Enter your password: ");
        String password = input.nextLine();
            
            boolean isAll = true;
            boolean isDigit = false;
            boolean isLetter = false;
           
            for(int i = 0; i<password.length(); i++){
                    char c = password.charAt(i);
                    
                    if(Character.isDigit(c)) isDigit = true;
                    if(Character.isLetter(c)) isLetter = true;
                    
                     if(isDigit && isLetter){
                     break;
            }
                }
            
            
            if(password.length() < 8){
                System.out.println("Your password must be at least 8 character.");
                isAll = false;
                
            }
            
                
                
            
            
           
            
            if(!isDigit){
                System.out.println("Your password must contains a digit.");
                isAll = false;
            }
            if(!isLetter){
                System.out.println("Your password must contains a letter.");
                isAll = false;
            }
            
            if(isAll){
                System.out.println("your password is successfull and strong!");
                isPassword = true;
            }else{
                System.out.println("!Please try a new password according to the rules:");
            }
        }
        
    }
    
}
