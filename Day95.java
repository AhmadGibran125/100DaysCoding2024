
package Coding100day;

import java.util.Scanner;

public class Day95 {
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    int angka = in.nextInt();
    
        for (int i = 0; i < angka; i++) {
            for (int j = 0; j <= i; j++) {
            System.out.print("O"+" ");
                
            }
            
        System.out.println(); 
        }
        System.out.println("<<<< Gibran >>>> ");
        for (int i = angka; i > 0; i--) {
            for (int j = i; j > 0; j--) {
            System.out.print("O");
                System.out.print(" ");
            }

        System.out.println(); 
        }
           
        }
}
