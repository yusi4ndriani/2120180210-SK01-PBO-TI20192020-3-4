/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2120180210.sk01.pbo.ti20192020.pkg3.pkg4.pkg06;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SK01PBOTI201920203406 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
         System.out.println("Masukan tinggi segitiga = ");
             int tinggi = input.nextInt();
                
         for (int i = 1; i <= tinggi; i++) {
             for (int j = tinggi; j > i; j--) {
                 System.out.print(" ");
             }
             for (int j = 1; j <= (2*i - 1); j++) {
                 System.out.print("6");
                 
             }
             System.out.println("");
        }
         for (int i = 2; i <= tinggi; i++) {
             for (int j = 1; j < i; j++) {
                 System.out.print(" ");
             }
             for (int j = tinggi; j >= (2*i - tinggi); j--) {
                 System.out.print("6");
                 
             }
             System.out.println("");
        }
    }
}
