package Coding100day;

import java.util.Scanner;

public class Day94 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        for (int i = angka; i > 1; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print(" ");
            }
            System.out.print("G");
            for (int j = (angka - i )*2; j > 1; j--) {
                System.out.print(" ");
            }
            if (i != angka) {
                System.out.print("G");
            }
            
            System.out.println();
        }
        for (int i = 0; i < angka * 2 - 1; i++) {
            System.out.print("G");
        }
        System.out.println();
    }
}
