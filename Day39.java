package Coding100day;

import java.util.Scanner;

public class Day39 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("nilai :");
        int sisba = in.nextInt();

        System.out.print("nilai :");
        int mod = in.nextInt();

        sisba %= mod;

        System.out.println("sisa bagi nya adalah : " + sisba);

    }
}
