package Coding100day;

public class Day59 {
    public static void main(String[] args) {
        
        String[] fruits = {"Apple","Mangga","Banana"};
        for (String fruit : fruits) {
            System.out.print(fruit+"  ");     
        }
        System.out.println(" ");
        String teks = "Halo Dunia";
        for (int i = 0; i < teks.length(); i++) {
            System.out.println("Karakter pada TEKS "+i+" : "+teks.charAt(i));    
        }
    }
}
