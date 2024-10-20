
package Coding100day;

import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();

        if (a > 89 || a == 100) {
            System.out.println("Nilai A");
        } else if (a > 79 && a < 90) {
            System.out.println("Nilai B");
        } else if (a > 69 && a < 80) {
            System.out.println("Nilai C");
        } else if (a > 59 && a < 70) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai E");

        }
    }
}
