package Coding100day;

import java.util.Scanner;

public class Day92 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.print("O");
            for (int j = 0; j < (a - i - 1) * 2 - 1; j++) {
                System.out.print(" ");
            }
            if (i != a - 1) {
                System.out.print("O");
            }
            System.out.println();
        }
    }
}
