
package mingguke2_pertemuan2;

import java.util.Scanner;


public class mingguke2_pertemuan2_no2 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama;
        int menu;
         System.out.println("\t   CAFE CERIA");
         System.out.println("\tANEKA MINUMAN");
         System.out.println("------------------------------");
         System.out.println("\t SPECIAL MENU :");
         System.out.println("1.Soft drinks");
         System.out.println("2.Mix juice");
         System.out.println("3.Nescafe");
         System.out.println("4.Soda milk");
         System.out.println("5.Tea");
         System.out.println("------------------------------");
         System.out.print("Masukkan nama pembeli :");
         nama = scan.nextLine();
         
         System.out.print("Silahkan masukkan pilihan anda :");
         menu = scan.nextInt();
         
         switch(menu){
             case 1:
                 System.out.println("minuman yang anda pesan adalah Soft drinks");
                 break;
             case 2:
                 System.out.println("minuman yang anda pesan adalah Mix juice");
                 break;
             case 3:
                 System.out.println("minuman yang anda pesan adalah Nescafe");
                 break;
             case 4:
                 System.out.println("minuman yang anda pesan adalah Soda milk");
                 break;
             case 5:
                 System.out.println("minuman yang anda pesan adalah Tea");
                 break;
             default:
             System.out.println("");
         }
        
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima Kasih" + nama + "telah berkunjung diCafe Ceria");
                
    }
    
}
