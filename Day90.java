package Coding100day;

import java.util.Scanner;

public class Day90 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ss = "Samsung";
        System.out.println("1 . "+ss);
        String r = "Realmi";
        System.out.println("2 . "+r);
        String xi = "Xiaomi";
        System.out.println("3 . "+xi);
        System.out.print("Pilih angka Mau Hp apa ");
        int ang = in.nextInt();
        if (ang < 1 || ang >3) {
            System.out.println("Tidak ada dalam Daftar ");
        }else if (ang == 1) {
            System.out.println(ss);
            double harga1 = 5000000;
//            System.out.println(har);
        }else if (ang == 2){
            System.out.println(r);
            double harga2 = 4000000;
//            System.out.println(harg);
        }else if (ang == 3){
            System.out.println(xi);
            double harga3 = 3000000;
//            System.out.println(harga);
        }
        System.out.println("Kode Diskon nya ada ? ");
        System.out.print("");// true = ada , false = tidak ada
        boolean apaada = in.nextBoolean();
        
        if (apaada == true ) {
            System.out.println("Ada Diskon");
        if (ang == 1) {
            System.out.println("Hp "+ss + " Harga 5000000 ");      
            double har = 5000000;
            double disk1 = (har*5 )/100;
            System.out.println("Diskon 5% "+ disk1);
            System.out.println("Total Harga Hp "+ss+ " : "+(har-disk1));
        }else if (ang == 2){
            System.out.println("Hp "+r + " Harga 4000000 ");
            double harg = 4000000;
            double disk2 = (harg*5 )/100;
            System.out.println("Diskon 5% "+ disk2);
            System.out.println("Total Harga Hp "+ss+ " : "+(harg-disk2));
        }else if (ang == 3){
            System.out.println("Hp "+xi + " Harga 3000000 ");
            double harga = 3000000;
            double disk3 = (harga*5 )/100;
            System.out.println("Diskon 5% "+ disk3);
            System.out.println("Total Harga Hp "+ss+ " : "+(harga-disk3));
        }
        
        }else{
            System.out.println("Tidak Ada Diskon");
        if (ang == 1) {
            System.out.println(ss);
            double hargass = 5000000;
            System.out.println(hargass);
        }else if (ang == 2){
            System.out.println(r);
            double hargar = 4000000;
            System.out.println(hargar);
        }else if (ang == 3){
            System.out.println(xi);
            double hargaxi = 3000000;
            System.out.println(hargaxi);
        }
        }
    }

    }

