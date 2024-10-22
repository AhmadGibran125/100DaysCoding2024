package Coding100day;

import java.util.Scanner;

public class Day51 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Angka Genap dan Ganjil di rentang 1-10
        String huruf = in.nextLine();
        int angka = Integer.parseInt(huruf);

        if (angka <= 0 || angka >= 11) {
            System.out.println("Program Di Hentikan");
        }

        String Apa;
        switch (angka) {
            case 1:
                Apa = "Satu";
                break;
            case 2:
                Apa = "Dua";
                break;
            case 3:
                Apa = "Tiga";
                break;
            case 4:
                Apa = "Empat";
                break;
            case 5:
                Apa = "Lima";
                break;
            case 6:
                Apa = "Enam";
                break;
            case 7:
                Apa = "Tujuh";
                break;
            case 8:
                Apa = "Delapan";
                break;
            case 9:
                Apa = "Sembilan";
                break;
            case 10:
                Apa = "Sepuluh";
                break;
            default:
                Apa = "SALAH SILAHKAN MASUKKAN ANGKA DENGAN BENAR 1 - 10";
        }
        System.out.println(Apa);

        if (angka >= 1 && angka <= 10) {
            if (angka % 2 == 0) {
                System.out.println(Apa + " Adalah Angka Genap");
            } else {
                System.out.println(Apa + " Adalah Angka Ganjil");
            }
            // Pengelompokkan 
            if (angka >= 1 && angka <= 3) {
                System.out.println("Angka Tersebut Tergolong Kecil");
            } else if (angka >= 4 && angka <= 7) {
                System.out.println("Angka Tersebut Tergolong Sedang");
            } else if (angka >= 8 && angka <= 10) {
                System.out.println("Angka Tersebut Tergolong Besar");

            }

        }

    }
}
