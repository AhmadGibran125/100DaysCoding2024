
package Coding100day;

import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner gibran = new Scanner(System.in);
        
        System.out.print("Nilai :");
        int a = gibran.nextInt();
        System.out.print("Nilai :");
        int b = gibran.nextInt();
        
        int abc = a*b;
        int cab = a/b;
        int bca = a%b;
        
        System.out.println("hasil perkalian :"+abc);
        System.out.println("hasil pemabgian :"+cab);
        System.out.println("hasil sisa bagi :"+bca);
        
    }
}
