
package Coding100day;

import java.util.Scanner;

public class Day93 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        for (int i = angka; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("O");
            for (int j = (angka - i)*2-1; j > 0; j--) {
                System.out.print(" ");
            }
            if (i != angka) {
                System.out.print("O");
            }
        System.out.println(); 
        }
        
    }
    
}
