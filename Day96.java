package Coding100day;

import java.util.Scanner;

public class Day96 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        for (int i = angka; i > 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            System.out.print("0");
            for (int j = (angka - i) * 2; j > 1; j--) {
                System.out.print(" ");
            }
            if (i != angka) {
                System.out.print("0");
            }
            System.out.println();
        }

        for (int i = 0; i < angka; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("0");
            for (int j = 0; j < (angka - i - 1) * 2 - 1; j++) {
                System.out.print(" ");
            }
            if (i != angka - 1) {
                System.out.print("0");
            }
            System.out.println();

        }
    }
}
