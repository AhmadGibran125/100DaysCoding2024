package Coding100day;

import java.time.LocalTime;
import java.util.Scanner;

public class Day100 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = in.nextLine();
        
        LocalTime waktu = LocalTime.now();
        
        String salam = "";
        if (waktu.isBefore(LocalTime.NOON)) {
            salam = "Selamat Pagi";
        }else if (waktu.isBefore(LocalTime.of(17,00))){
            salam = "Selamat Siang";
        }else{
            salam = "Selamat Malam";
        }
        
       
        System.out.println("  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(":================================:");
        System.out.println("    "+salam +", "+nama);
        System.out.println("    Program Anda Telah Selesai");
        System.out.println(":================================:");
        System.out.println("  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
       
        
    }
}
