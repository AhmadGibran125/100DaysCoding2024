
package Coding100day;

import java.util.Scanner;

public class Day84 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Teks ");
        String apa = in.nextLine();
        
        char kar = in.next().charAt(0);
        
        int jumlah = 0;
        
        for (int i = 0; i < apa.length(); i++) {
            if (apa.charAt(i) == kar) {
                jumlah++;
            }
        }
        System.out.println("Jumlah Kemunculan Karakter : "+kar+" dalam teks "+jumlah);
    }
}
