
package Coding100day;

import java.util.Scanner;


public class Day52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =  in.nextInt();
        if (a <=100 && a >=0) {
            System.out.println("Termasuk dalam Rentang Angka Yang ditentukan");
        }
        String maka =(a <= 100 || a >= 70) ? "Besar":(a < 70 && a > 40 ) ? "Tengah tengah": "Kecil";
        System.out.println("jadi gimana bang ? "+maka);
        
    }
}
