
package Coding100day;

public class Day33 {
    public static void main(String[] args) {
        // implicit casting (widening)
        int bulat = 1000;
        double desimal = bulat;  //konversi otomatis
        
        System.out.println(" implicit casting ");
        System.out.println("Nilai Bilangan Bulat :"+bulat);
        System.out.println("Nilai bilangan Desimal :"+desimal);
        
        // explicit casting (narrowing)
        double desimal2 = 1000.0;
        int bulat2 = (int)desimal2 ; //konversi manual
        
        System.out.println(" explicit casting ");
        System.out.println("Nilai bilangan Desimal :"+desimal2);
        System.out.println("Nilai bilangan Bulat :"+bulat2);
        
        
                
        
        
        
    }
        
}
