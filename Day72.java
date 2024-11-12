package Coding100day;

import java.util.Scanner;

public class Day72 {
    public static int Faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }else {
            return n * Faktorial(n -1);
        }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        System.out.println("Faktorial Dari "+ angka + " adalah "+Faktorial(angka));
    }
}
