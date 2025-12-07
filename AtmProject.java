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
public class AtmProject {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
       double bakiye = 1000;
       int secim;
       
       do{
           System.out.println("1- Bakiye sorgula");
           System.out.println("2- Para yatır");
           System.out.println("3- Para çek");
           System.out.println("4- Çıkış");
           secim = input.nextInt();
           
           switch(secim){
               case 1:
                   System.out.print("Bakiyeniz " +bakiye+ "TL");
                   break;
               case 2:
                   System.out.print("Yatırılacak miktar: ");
                   double miktar = input.nextDouble();
                   bakiye += miktar;
                   System.out.println("Bakiyeniz" +bakiye+ "TL");
                   break;
               case 3:
                   System.out.print("Çekilecek miktar: ");
                   double çekilen = input.nextDouble();
                   if(çekilen>bakiye){
                       System.out.println("Yetersiz bakiye");
                   }else{
                       bakiye-= çekilen;
                       System.out.println("Bakiyeniz" +bakiye+ "TL");
                   }
                   break;
               case 4:
                   System.out.println("Çıkış yapılıyor...");
                   break;
               default:
                   System.out.println("Geçersiz işlem. Yeniden deneyiniz.");
                   
           }
           
    }while (secim != 4);
    
}
}