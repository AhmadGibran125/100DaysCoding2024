
package Coding100day;

import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        // Operator Logika NOT
        System.out.print("Nilai A ");
        int a = in.nextInt();
        System.out.print("Nilai B ");
        int b = in.nextInt();
        
        a += b;
        b =a-b;
        a -= b;
       
        boolean ab = (a > b) && !(a < b);
        System.out.println("Nilai A lebih BESAR dari Nilai B "+ab);
        boolean ba = !(a > b) && (a < b);
        System.out.println("Nilai A lebih KECIL dari Nilai B "+ba);
        
        
        
        
            
        }
        
    }

