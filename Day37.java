
package Coding100day;

import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        Scanner gibran = new Scanner(System.in);
        
        //pengisian nilai
        System.out.print("nilai :");
        int nilai = gibran.nextInt();
            System.out.println("nilai :"+nilai);
        //pengisian dan penambahan
        System.out.print("angka Awal :");
        int angka = gibran.nextInt();
        angka += nilai;
            System.out.println("penambahan :"+angka);
            
        //pengisian dan pengurangan
        System.out.print("point :");
        int point = gibran.nextInt();
        point -= angka;
            System.out.println("pengurangan :"+point);
        
        
        
        
        
    }
    
}
