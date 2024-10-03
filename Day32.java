
package Coding100day;

public class Day32 {
    public static void main(String[] args) {
      
        int in = 10000;
        String te = String.valueOf(in);
        System.out.println("intString :"+te);
        
        double ble = 1.00001;
        String dou =  String.valueOf(ble);
        System.out.println("doubleString :"+dou);
        
        boolean lean = true;
        String boo = String.valueOf(lean);
        System.out.println("booleanString :"+boo);
       
        //concatenation
        int angka = 200;
        String angkaS = angka + "";
        double desimal = 2.002;
        String desimalS = desimal + "";
        boolean status = false;
        String statusS = status + "";
        
        System.out.println("angka Str :"+angkaS);
        System.out.println("desimal Str :"+desimalS);
        System.out.println("status Str :"+statusS);
        }
        
        
        
    }

