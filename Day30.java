
package Coding100day;

import java.math.BigDecimal;

public class Day30 {
    public static void main(String[] args) {
        
        BigDecimal TtahunLalu = new BigDecimal("140.7234512677843423");
        BigDecimal TSkarang = new BigDecimal("165.7001002003004005");
        
        //Mencari Selisih tinggi saya di tahun lalu dengan tinggi saya saatini
        BigDecimal selisih = TSkarang.subtract(TtahunLalu);
            System.out.println("Selisih Tinggi saya sekarang dengan tahun lalu yaitu :"+selisih);
            
        //pembuktian apakah benar selisihnya sekian
        BigDecimal pembuktian = TtahunLalu.add(selisih);
            System.out.println("apakah betul selisihnya sekian maka :"+pembuktian);
        
    }        
}
