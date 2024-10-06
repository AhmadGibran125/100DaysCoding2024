
package Coding100day;
import java.util.Scanner;
public class Day35 {
    public static void main(String[] args) {
        Scanner gibran = new Scanner(System.in);
        
        System.out.print("NilaiA :");
        int A = gibran.nextInt();
        System.out.print("NilaiB :");
        int B = gibran.nextInt();
        
        int c = A+B;
        int d = B-A;
        System.out.println("Jika Hasil c kurang d ="+ (c-d));
        
    }
}
