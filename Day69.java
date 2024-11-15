package Coding100day;

import java.util.Scanner;

public class Day69 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int a = in.nextInt();
            if (a != 9) {
                System.out.println("Masukkan Lagi Angka ");
            } else if (a == 9) {
                System.out.println("Program Dihentikan ");
                break;
            }
        }

        int b;
        do {
            System.out.println("masukkan angka");
            b = in.nextInt();
        } while (b != 9);
        System.out.println("program di hentikan");
    }
}
