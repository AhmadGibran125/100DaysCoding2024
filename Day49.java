package Coding100day;

import java.util.Scanner;

public class Day49 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int angka = in.nextInt();
        
        if (angka > target || angka == target) {
            System.out.println("Sukses");
        }else if (angka < target){
            System.out.println("Nice try");
            
        }
        
    }
}
