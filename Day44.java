package Coding100day;

import java.util.Scanner;

public class Day44 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Logika AND

        System.out.print("nilai a ");
        int a = in.nextInt();
        System.out.print("nilai b ");
        int b = in.nextInt();
        System.out.print("nilai c ");
        int c = in.nextInt();

        boolean mana = (a > b) && (a > c);
        System.out.println("( Nilai A ) yang paling besar : " + mana);
        boolean manaa = (b > a) && (b > c);
        System.out.println("( Nilai B ) yang paling besar : " + manaa);
        boolean manaaa = (c > a) && (c > b);
        System.out.println("( Nilai C ) yang paling besar : " + manaaa);

    }
}
