
package Coding100day;

import java.math.BigInteger;

public class Day29 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("123456789012345678901234567890");
        BigInteger b = new BigInteger("1234567890");
        
        BigInteger Jumlah = a.add(b);
        System.out.println("Jumlah :"+Jumlah);
        
        BigInteger c = new BigInteger ("120000000");
        BigInteger d = new BigInteger ("2");
        
        BigInteger HasilKali = c.multiply(d);
        System.out.println("Hasil Perkalian :"+ HasilKali);
        
        
        
    }
}
