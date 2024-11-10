package Coding100day;

public class Day70 {
    public static int apa(int sisBa) {
        return sisBa;
    }
    
    public static void main(String[] args) {
        
        int hasil = apa(11);
        System.out.println(hasil);
        
        if (hasil % 2 == 0) {
            System.out.println("Ini GENAP");
        }else {
            System.out.println("Ini GANJIL");
        }
    }
}
