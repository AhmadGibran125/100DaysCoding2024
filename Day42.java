
package Coding100day;

import java.util.Scanner;

public class Day42 {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                
                System.out.print("Nilai a ");
                int a = in.nextInt();
                
                System.out.print("Nilai b ");
                int b = in.nextInt();
                
                boolean sama = a == b;
                    System.out.println(sama);
                    
                    String jika = (a != b) ? "tidak sama maka salah" : "sama maka benar";
                    System.out.println(jika);
                    
           
    }
}
