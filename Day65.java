package Coding100day;

public class Day65 {
    public static void main(String[] args) {
        //luar
        for (int i = 1; i <= 3; i++) {
            //dalam
            for (int j = 1; j <= 3; j++) {
                System.out.print(j+" ");
                
            }
            System.out.println("");
        }
        int a = 3;
        //luar
        while (a >= 1){
            int b = 3;
            //dalam
            while (b >= 1){
                System.out.print(b+" ");
                b--;
            }
            System.out.println("");
            a--;
        }
        
    }
}
