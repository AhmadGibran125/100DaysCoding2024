
package Coding100day;

public class Day63 {
    public static void main(String[] args) {
        int nilai = 10;
        while (nilai > 0){
            nilai--;
            if (nilai %2 != 1) {
                continue;    
            }
            System.out.println(nilai);  
        }
        System.out.println("=====");
        
        for (int angka = 1; angka <= 10; angka++) {
            if (angka %2 != 0) {
                continue;
            }
            System.out.println(angka);
        }
        System.out.println("=====");
        int point = 10 ;
        do{
            point--;
            if (point == 10 || point == 1 || point == 5 || point == 6) {
                continue; 
            }
            System.out.println(point);
        }while (point > 0);
    }
}
