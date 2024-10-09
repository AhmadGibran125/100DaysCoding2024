package Coding100day;

import java.util.Scanner;

public class Day38 {

    public static void main(String[] args) {
        Scanner gibran = new Scanner(System.in);

        System.out.print("Nilai :");
        int as = gibran.nextInt();
        System.out.print("Nilai :");
        int sa = gibran.nextInt();
        as *= sa;
        System.out.println("Perkalian :" + as);

        System.out.print("Nilai :");
        int we = gibran.nextInt();
        System.out.print("Nilai :");
        int ew = gibran.nextInt();
        we /= ew;
        System.out.println("Pembagian :" + we);

    }
}
