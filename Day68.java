package Coding100day;

public class Day68 {
    public int angka (){
        return 10;
    }
    public int luasPersegi(int sisi ){
        return sisi * sisi;
}
    public static void main(String[] args) {
        Day68 luas = new Day68();
        int Angka = luas.angka();
        System.out.print("Mngembalikkan angka ");
        System.out.println(Angka);
        
        int hasil = luas.luasPersegi(10);
        System.out.print("Luas Persegi ");
        System.out.println(hasil);
    }
}
