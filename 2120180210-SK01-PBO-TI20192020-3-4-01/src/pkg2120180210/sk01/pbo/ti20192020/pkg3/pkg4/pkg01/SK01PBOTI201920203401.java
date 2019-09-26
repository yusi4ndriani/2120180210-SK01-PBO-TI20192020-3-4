
package pkg2120180210.sk01.pbo.ti20192020.pkg3.pkg4.pkg01;

import java.util.Scanner;

public class SK01PBOTI201920203401 {

    public static void main(String[] args) {
        System.out.print("Masukkan Banyak Baris: ");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
    
        for(int i=1; i<=x; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("1");
            }
            System.out.println("");
        }
    }  
}
