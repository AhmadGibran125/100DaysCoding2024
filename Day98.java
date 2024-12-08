package Coding100day;

import java.util.Scanner;

public class Day98 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x : ");
        int x = in.nextInt();
        System.out.print("y : ");
        int y = in.nextInt();

        int hasil = 0;

        for (int i = x; i <= y; i++) {
            if (x % 2 == 1) {
                System.out.println("Program dihentikan ");
                break;
            } else if (x % 2 == 0) {
                if (i % 2 == 0) {
                    System.out.print(i);
                    hasil += i;

                } else {
                    System.out.print(" + ");
                }
            }

        }
        System.out.print(" = " + hasil);
        System.out.println();
    }
}
