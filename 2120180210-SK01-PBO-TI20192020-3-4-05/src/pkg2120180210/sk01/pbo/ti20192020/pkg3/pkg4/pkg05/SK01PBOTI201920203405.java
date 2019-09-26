
package pkg2120180210.sk01.pbo.ti20192020.pkg3.pkg4.pkg05;

import java.util.Scanner;


public class SK01PBOTI201920203405 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
         System.out.println("Masukan tinggi segitiga = ");
             int tinggi = input.nextInt();
                
         for (int i = 1; i <= tinggi; i++) {
             for (int j = 1; j < i; j++) {
                 System.out.print(" ");
             }
             for (int j = tinggi; j >= (2*i - tinggi); j--) {
                 System.out.print("5");
                 
             }
             System.out.println("");
        }
       
    }
}
 
