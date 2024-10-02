package Coding100day;

public class Day31 {

    public static void main(String[] args) {

        String Tanggal_lahir = "31";
        String Bulan_lahir = "1";
        String Tahun_lahir = "2006";

        byte tanggal = Byte.parseByte(Tanggal_lahir);
        System.out.println("Tanggal lahir : " + tanggal);

        char bulan = Bulan_lahir.charAt(0);
        System.out.println("Bulan lahir : " + bulan);

        short tahun = Short.parseShort(Tahun_lahir);
        System.out.println("Tahun lahir : " + tahun);
    }
}
