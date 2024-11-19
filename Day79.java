package Coding100Day;

public class Day_79 {

    String buah;   //untuk nama buah
    String warna;  // untuk warna buah

    public Day_79(String buah, String warna) {
        this.buah = buah;
        this.warna = warna;
    }

    // Override metode toString
    @Override
    public String toString() {
        return "Buah[ buah = " + buah + ", warna = " + warna + " ]";
    }

    public static void main(String[] args) {
        // Membuat objek mobil
        Day_79 buah1 = new Day_79(" Semangka ", " Hijau ");
        Day_79 buah2 = new Day_79(" Pisang ", " Kuning ");

        // Mencetak objek Buah
        System.out.println(buah1);
        System.out.println(buah2);
    }
}
