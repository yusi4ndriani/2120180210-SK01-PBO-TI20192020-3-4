
package pkg2120180210.sk01.pbo.ti20192020.pkg3.pkg4.pkg03;

import java.util.Scanner;

public class SK01PBOTI201920203403 {
   
    public static void main(String[] args) {
        System.out.print("Masukkan Banyak Baris: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        
        for(int i=1; i<=x; i++) {
            for(int j=i; j<=x; j++) {
                System.out.print("3");
            }
            System.out.println("");
        }
    }  
}
