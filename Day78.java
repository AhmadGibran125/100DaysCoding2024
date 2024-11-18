package Coding100day;

public class Day78 {
    public static void main(String[] args) {
        String A = "AHMAD";
        String B = "ahmad";
        String C = "gibran";
        String D = "GIBRAN";
        
        System.out.println("ini untuk A ke B maka "+A.equalsIgnoreCase(B));
        System.out.println("ini untuk A ke D maka "+A.equalsIgnoreCase(D));
       
        System.out.println("ini untuk C ke D maka "+C.equalsIgnoreCase(D));      
        System.out.println("ini untuk C ke B maka "+C.equalsIgnoreCase(B));
       
        
        
    }
}
