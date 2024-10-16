
package Coding100day;

import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        boolean a = in.nextBoolean();
        boolean b = in.nextBoolean();
        
        boolean ab = a || b;
        System.out.println(ab);
        
        boolean aa = a || a;
        System.out.println(aa);
        
        boolean bb = b || b;
        System.out.println(bb);
        
    }
}
