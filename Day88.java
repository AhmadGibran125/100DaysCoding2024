package Coding100day;

import java.util.Scanner;

public class Day88 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Jumlah Mahasiswa : ");
        int jumlah = in.nextInt();
        in.nextLine();
        
        System.out.print("No. ");
        System.out.println("Nama Mahasiswa. ");
        String[] mahasiswa = new String[jumlah];
        for (int i = 0; i < jumlah; i++) {   
            System.out.print(i+1+" . ");
            mahasiswa[i] = in.nextLine();
        }
        
        System.out.println("Daftar Nama Mahasiswa : ");
        for (int ko = 0; ko < jumlah; ko++) {
            System.out.println((ko + 1)+ " . " + mahasiswa[ko]);
        }


    }
}
