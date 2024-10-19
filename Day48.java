package Coding100day;

import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("angka ini positif atau negatif ");
        int a = in.nextInt();
        if (a > 0) {
            System.out.println("Positif "+a);
        }else{
            System.out.println("Negatif "+a);
            
        }
    }
}
