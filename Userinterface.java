import java.util.Scanner;

public class Userinterface {
    public static void menu() {
        System.out.println();
        System.out.println("======================");
        System.out.println("|   > Pilih Menu <    |");
        System.out.println("----------------------");
        System.out.println("|   > C < to Create   |");
        System.out.println("|   > R < to Read     |");
        System.out.println("|   > U < to Update   |");
        System.out.println("|   > D < to Delate   |");
        System.out.println("|   > X < to Exit     |");
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        Database db = new Database();
        System.out.println("HEY");
        while (true){
            menu();
            Scanner in = new Scanner(System.in);
            System.out.print("Pilih : ");
            String pilih = in.nextLine();
            pilih = pilih.toLowerCase();
            switch (pilih){
                case "c":
                    System.out.println("Create");
                    System.out.println("---------------------------------------------");
                    System.out.println("INPUT DATA BARU");
                    System.out.print("NIM        : ");
                    String nim = in.nextLine();
                    System.out.print("NAMA       : ");
                    String nama = in.nextLine();
                    System.out.print("ALAMAT     : ");
                    String alamat = in.nextLine();
                    System.out.print("SEMESTER   : ");
                    int sem = in.nextInt();
                    System.out.print("SKS        : ");
                    int sk = in.nextInt();
                    System.out.print("IPK        : ");
                    double ip = in.nextDouble();
                    in.nextLine();
                    System.out.println("---------------------------------------------");
                    boolean status = db.insert(nim,nama,alamat,sem,sk,ip);
                    if (status==true){
                        System.out.println("DATA BERHASIL DITAMBAHKAN");
                    }else{
                        System.out.println("GAGAl MENAMBAHKAN");
                        System.out.println("NIM "+nim+" SUDAH ADA");
                    }
                    break;
                case "r":
                    System.out.println("Read");
                    db.view();
                    break;
                case "u":
                    System.out.println("Update");
                    db.view();
                    System.out.println("INPUT NIM MAHSISWA YANG AKAN DI PERBAHARUI");
                    System.out.print("NIM : ");
                    String key = in.nextLine();
                    int index = db.search(key);
                    if (index >= 0 ){
                        System.out.println("MENGUPDAT DATA "+ db.getData().get(index));
                        System.out.println("---------------------------------------------");
                        System.out.println("INPUT DATA BARU");
                        System.out.print("NIM        : ");
                        nim = in.nextLine();
                        System.out.print("NAMA       : ");
                        nama = in.nextLine();
                        System.out.print("ALAMAT     : ");
                        alamat = in.nextLine();
                        System.out.print("SEMESTER   : ");
                        sem = in.nextInt();
                        System.out.print("SKS        : ");
                        sk = in.nextInt();
                        System.out.print("IPK        : ");
                        ip = in.nextDouble();
                        in.nextLine();
                        System.out.println("---------------------------------------------");
                        status = db.update(index,nim,nama,alamat,sem,sk,ip);
                        if (status==true){
                            System.out.println("DATA BERHASIL DIPERBAHARUI");
                        }else{
                            System.out.println("GAGAL MEMPERBARUI DATA");
                        }
                    }else{
                        System.err.println("NIM YANG ANDA INPUT " +key+" TIDAK ADA DALAM DAFTAR");
                    }
                    break;
                case "d":
                    System.out.println("Delate");
                    db.view();
                    System.out.println("INPUT NIM YANG AKAN DI HAPUS");
                    System.out.print("NIM : ");
                    key = in.nextLine();
                    index = db.search(key);
                    if (index >= 0){
                        System.out.println("YAKIN ? MAU MENGHAPUS "+db.getData().get(index));
                        System.out.print("YA / NO : ");
                        pilih = in.nextLine();
                        if (pilih.equalsIgnoreCase("YA")){
                            status=db.delate(index);
                            System.out.println("DATA BERHASIL DI HAPUS DARI DAFTAR");
                        }
                    }else{
                        System.err.println("NIM YANG ANDA INPUT "+ key + " TIDAK ADA DALAM DAFTAR");
                    }
                    break;
                case "x":
                    System.out.println("Exit");
                    System.out.println("TEKAN YA / NO");
                    System.out.print("Pilih : ");
                    pilih = in.nextLine();
                    if (pilih.equalsIgnoreCase("YA")){
                        System.exit(0);
                    }
                    break;
            }
        }
    }
}
