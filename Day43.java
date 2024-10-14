
package Coding100day;

import java.util.Scanner;

public class Day43 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            
            //Operator Perbandingan Lebih besar sama dengan dan Lebih kecil sama dengan 
            
            System.out.print("nilai a ");
            int a =  in.nextInt();
            System.out.print("nilai b ");
            int b =  in.nextInt();
            
            boolean c = a >= b;
            boolean d = a <= b;
            
            System.out.println("a lebih besar atau sama dengan b " +c);
            System.out.println("a lebih kecil atau sama dengan b " +d);
            
            String aku = (a >= b ) ? "a besar atau sama dengan b":"a kecil atau sama dengan b";
            System.out.println(aku);
            
            
            
    }
}
