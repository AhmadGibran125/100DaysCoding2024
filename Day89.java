public class Day89 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mau Berapa Berapa Elemen kak..? ");
        
        
        int kon = in.nextInt();
        in.nextLine();
        
        String[] ar = new String[kon];
        for (int i = 0; i < ar.length; i++) {
            System.out.print(i+1+" . ");
            ar [i] = in.nextLine();
        }
        System.out.println("Cetak");
        for (int i = 0; i < ar.length; i++) {
            System.out.println(i+1+" . "+ar[i]);
        }
        System.out.print("Mau ubah indeks berapa kak ? ");
        int inde = in.nextInt();
        in.nextLine();
       
        if (inde >=  1&& inde <= kon) {
            
            System.out.print(inde+" . ");
            inde-=1;
             ar[inde] = in.nextLine();
             System.out.println("Proses.....");
        }else {
            System.out.println("not valid");
        }
        
        System.out.println("Pembaharuan ");
        for (int i = 0; i < ar.length; i++) {
            System.out.println((i+1)+ " . "+ ar[i]);
        }
    }
}
