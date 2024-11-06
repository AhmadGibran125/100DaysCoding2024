package Coding100day;

import java.util.Scanner;

public class Day66 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Untuk Pola Persegi");
        System.out.print("Baris : ");
        int baris = in.nextInt();
        System.out.print("Kolom : ");
        int kolom = in.nextInt();
 
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("o  ");
            }
            System.out.println();
        }
        System.out.println("=====================================");
        System.out.println("Untuk Pola Persegi Panjang");
        System.out.print("Baris : ");
        int Baris = in.nextInt();
        System.out.print("Kolom : ");
        int Kolom = in.nextInt();
        for (int a = 1; a <= Baris; a++) {
            for (int g = 1; g <= Kolom; g++) {
                System.out.print("o  ");
            }
            System.out.println();
        }
        System.out.println("=====================================");
        System.out.print("Tinggi Segitiga ");
        int tinggi = in.nextInt();
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("o");
            }
            System.out.println();
        }
    }
}
