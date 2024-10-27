
package Coding100day;

import java.util.Scanner;

public class Day56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Soal 1
        int a = in.nextInt();
        if (a > 100) {
            System.out.println("Air Mendidih");
        }else if (a > 0 && a <= 100){
            System.out.println("Air dalam keadaan cair");
        }else if (a <= 0){
            System.out.println("Air Membeku");
        }

    }
}
