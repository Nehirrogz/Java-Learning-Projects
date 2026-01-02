/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caesarcipher;
// Student ID: 25242710
// Name Surname: Nehir Oğuz

import java.util.Scanner;

/**
 *
 * @author nehiroguz
 */
public class CaesarCipher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 1 to encrypt, 2 to decrypt the message:");
        int taskType =input.nextInt();
        
        input.nextLine();
        
        System.out.println("Enter the message:");
        String message = input.nextLine();
        
        System.out.println("Enter the key:");
        int key = input.nextInt();
        
        if(validateInput(taskType,message,key)){
            if(taskType ==1){
                String result = encrypt(message,key);
                System.out.println("Encrypted message: "+result);
            }else if (taskType==2){
                String result = decrypt(message,key);
                System.out.println("Decrypted message: "+result);
        }else{
                System.out.println("Invalid input! Please check your task type (1-2) or key (must be > 0).");
            }
    }
    }  
        public static boolean validateInput(int taskType, String message, int key){
            if(taskType!=1 && taskType!=2){
                return false;
            }
            if(key<=0){
                return false;
            }
            return true;
        }
        
        public static String encrypt(String message, int key){
            String result = "";
            
            for(int i =0; i<message.length(); i++){
                char currentChar = message.charAt(i);
                char encryptedChar = shiftChar(currentChar,key);
                result += encryptedChar;
            }
            return result;
        }
        
        public static String decrypt(String message, int key){
            String result = "";
            for(int i =0; i< message.length(); i++){
                char encryptedChar = message.charAt(i);
                char decryptedChar = shiftChar(encryptedChar,-key);
                result+= decryptedChar;
            }
            return result;
        }
        
        public static char shiftChar(char ch, int x){
            if(!Character.isLetter(ch)){
                return ch;
            }
            
            char base = Character.isLowerCase(ch) ? 'a' : 'A';
            
            int originalPosition = ch - base;
            int newPosition = (originalPosition + x)%26;
            
            if(newPosition < 0){
                newPosition +=26;
            }
            return (char) (base+newPosition);
        }
}

    

    
