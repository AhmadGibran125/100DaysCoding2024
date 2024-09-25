
package Coding100day;

public class Day24 {
    public static void main(String[] args) {
        Float a = 12.5f;
        Float b = 7.5f;
        Float c = a+b;
        System.out.println("Hasil :" + c);
        float d = c;
        float e = Float.valueOf(d);
        System.out.println("primitif :"+e);
    }
}
