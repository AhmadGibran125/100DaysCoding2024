package Coding100day;

import java.util.Scanner;

public class Day62 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        int angka = 0;
        while (angka < 10) {
            if (angka == 5) {
                break;  
            }
            System.out.println(angka);
            angka++;
        }
        
        Scanner in = new Scanner(System.in);
        int nilai = in.nextInt();
        do {
            System.out.println(nilai);
            if (nilai %2 == 0) {
                System.out.println("program dijalankan");
            }else if (nilai %2 == 1){
                System.out.println("program dihentikan");
                break;
            }
            nilai++;
        }while (true);
        
        
    }
}
