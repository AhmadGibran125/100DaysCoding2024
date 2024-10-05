
package Coding100day;

import java.util.Scanner;
 
public class Day34 {
    public static void main(String[] args) {
        Scanner gibran = new Scanner(System.in);
        
        System.out.print("Nama saya ");
        String nama = gibran.nextLine();
        
        System.out.print("Umur saya ");
        int umur = gibran.nextInt();
        
        System.out.print("Tinggi badan saya ");
        double tinggi = gibran.nextDouble();
        
        System.out.print("Berat badan saya ");
        float berat = gibran.nextFloat();
        
        gibran.nextLine();
        System.out.print("Alamat ");
        String alamat = gibran.nextLine();
        
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        
        System.out.printf("perkenalkan saya %s sekarang saya berumur %d dengan tinggi badan %.2f dan berat bedan %.1f saya tinggal di %s",nama,umur,tinggi,berat,alamat);
        
        
    }
}
