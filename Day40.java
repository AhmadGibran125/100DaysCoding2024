package Coding100day;

import java.util.Scanner;

public class Day40 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("nilai a :");
        int a = in.nextInt();
        System.out.print("nilai b :");
        int b = in.nextInt();
        
        System.out.println("jika a lebih besar dari b :" + (a > b));
        boolean c = a < b, d = b > a , e = b < a;
        System.out.println("jika a lebih kecil dari b :" + c);
        System.out.println("Besar b dari pada a :" + d);
        System.out.println("Kecil b dari pada a :" + e);
        
        System.out.println("slebewww..............................................");
    }
}
