
package Coding100day;

import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        /**
         * Mencari Keliling dan Luas Persegi Panjang
         * Rumus Kliling Persegi panjang 2*(p+l)
         * Rumus Luas Persegi panjnag p*l
         */
        
        
        System.out.print("panjang ");
        int panjang = in.nextInt();
        System.out.print("lebar ");
        int lebar = in.nextInt();
        
        int keliling = 2*(panjang+lebar);
        System.out.println("Keliling nya "+keliling);
        
        int luas = panjang * lebar ;
        System.out.println("Luas nya "+luas);
        
        /**Keliling dan Luas Lingkaran
          *Dengan satu inputan yaitu jari jari lingkaran
          * Rumus Keliling Lingkaran pi*r*r
          * Rumus Luas Lingkaran 2*pi*r
          */
        System.out.print("jari jari linngkaran ");
        int jari = in.nextInt();
        
        double pi = Math.PI;
        System.out.println("Diketahui nilai mutlak pi "+pi);
        
        double Kel = pi*jari*jari;
        double Lu = 2*pi*jari;
        
        System.out.println("Keliling Lingkaran "+Kel);
        System.out.println("Luas Lingkaran "+Lu);
        
        
        
        
        
    }
}
