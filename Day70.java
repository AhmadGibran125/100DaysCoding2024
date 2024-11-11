package Coding100day;

public class Day69 {
    // Method static dengan 1 parameter
         public static int tambah(int angka) {
            return angka+2;
         }
    // Method non static dengan 2 parameter
         public int kali(int a, int b) {
            return a * b;
    }
    public static void main(String[] args) {
        // sataic langsung panggil tanpa new
        int hasil1 = tambah(5);
        System.out.println("Hasil setelah penambahan "+hasil1);
        
        // non static perlu objek dulu pakai new
        Day69 apa = new Day69();
        int hasil2 = apa.kali(2,10);
        System.out.println("Hasil setelah diakli a dan b "+ hasil2);
    }
}
