package Coding100day;

public class Day87 {
    public static void main(String[] args) {
        int[] gibran = {00,01,02};
        
        System.out.println("Before");
        for (int i = 0; i < gibran.length; i++) {
            System.out.print(gibran[i]+ " ");
        }
        
        gibran[0]=31;
       
        gibran[2]=2006;
        
        System.out.println("After");
        for (int ag = 0; ag < gibran.length; ag++) {
            System.out.print(gibran[ag]+ " ");
        }
    }
    
}
