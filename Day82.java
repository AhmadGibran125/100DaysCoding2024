package Coding100day;

import java.util.Scanner;

public class Day82 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double bilangan = in.nextDouble();
        System.out.print("Membulatkan ke atas ");
        System.out.println(Math.ceil(bilangan));
        System.out.print("Membulatkan ke bawah ");
        System.out.println(Math.floor(bilangan));
        System.out.print("Membulatkan ke bilangan bulat terdekat ");
        System.out.println(Math.round(bilangan));         
    }
}
