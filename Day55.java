
package Coding100day;

import java.util.Scanner;

public class Day55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Rentang angka ");
        int angka = in.nextInt();
        for (int rentang = angka; rentang > 0; rentang--) {
            System.out.println(rentang);
        }
            System.out.println("GENAP/GANJIL");
            for (int jika = angka ; jika > 0; jika-=2) {
                System.out.println(jika);
                
                if (jika %2 == 0 ) {
                    System.out.println("itu GENAP");
                }else{
                    System.out.println("itu GANJIL");
                }
            }
            { System.out.println("================");}
            
                System.out.println("GANJIL/GENAP");
                for (int maka = angka-1; maka > 0; maka-=2) {
                    System.out.println(maka);
                    
                    if (maka %2 == 1 ) {
                        System.out.println("itu GANJIL");
                    }else{
                        System.out.println("itu GENAP");
                        
                    }
                    
                }
        
        
              
    }
}
