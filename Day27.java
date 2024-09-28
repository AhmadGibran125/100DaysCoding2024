
package Coding100day;

import java.util.Scanner;

public class Day27 {
    public static void main(String[] args){
        //pertama
        Scanner i = new Scanner(System.in);
        
        int a = i.nextInt();//10
        int b = i.nextInt();//5
        
        a =a+b;//15
        b =a-b;//10
        a =a-b;//5
        
        System.out.println(a);
        System.out.println(b);
        
        //kedua
        Scanner u = new Scanner(System.in);
        
        int p = u.nextInt();
        int m = u.nextInt();
        
        int c = p/m;
        int d = p%m;
        
        System.out.println("Jumlah Permen yang di bagi ke setiap murid:"+c);
        System.out.println("sisa permen :"+d);
        
        //ketiga
        Scanner y = new Scanner(System.in);
        
        int panjang = y.nextInt();
        int lebar = y.nextInt();
        int kotak = panjang*lebar;
        int kartu = 2;
        
        System.out.println(kotak/2);
        
        //keempat
        System.out.println("selamat datang");
        Integer jumlahKegiatan = 10;
        final String namaKegiatan = "Pernikahan";
        float durasiKegiatan = 3.5f;
        //update
        durasiKegiatan = 4.5f;
        
        System.out.printf("Kegaiatan %s memiliki durasi %.1f jam Jumlah Kegiatan yang direncanakan saat ini adalah %d",namaKegiatan,durasiKegiatan,jumlahKegiatan);
                
                
              
       
    }
}
