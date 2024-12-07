package Coding100day;

import java.util.Scanner;

public class Day_97 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Nilai n ");
        int n = in.nextInt();

        System.out.println("Bilangan prima dari 1 hingga " + n + " adalah ");

        for (int i = 2; i <= n; i++) {
            boolean prima = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prima = false;
                    break;
                }
            }
            if (prima) {
                System.out.print(i + " ");
            }
        }

    }
}
