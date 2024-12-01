
package Coding100day;

import java.util.Scanner;

public class Day91 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka ");
        int angka ;
        
        for (int i = 0; i < 10;) {
            angka = in.nextInt();
            if (angka %2 == 0) {
                System.out.println("Genap");
                System.out.println("Masukkan Kembali angka");
            }else{
                System.out.println("You and I, End");
                break;
            }
        }
        
    }
}
