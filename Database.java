import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private ArrayList<Mahasiswa> data = new ArrayList<>();
    private String filename = "src/data.csv";
    private Path path = Path.of(filename);

    public Database() {
        open();
    }

    public ArrayList<Mahasiswa> getData() {
        return data;
    }

    public void open(){
        try {
            List<String> lines = Files.readAllLines(path);
            data = new ArrayList<>();
            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] elemen = line.split(";");
                String NIM = elemen[0];
                String NAMA = elemen[1];
                String ALAMAT = elemen[2];
                int SEMESTER = Integer.parseInt(elemen[3]);
                int SKS = Integer.parseInt(elemen[4]);
                double IPK = Double.parseDouble(elemen[5]);
                Mahasiswa mhs = new Mahasiswa(NIM, NAMA, ALAMAT, SEMESTER, SKS, IPK);
                data.add(mhs);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void save(){
        StringBuilder sb = new StringBuilder();
        sb.append("NIM,NAMA,ALAMAT (KOTA),SEMESTER,SKS,IPK\n");
        if (!data.isEmpty()){
            for (int i = 0; i < data.size(); i++) {
                Mahasiswa mhs = data.get(i);
                String line = mhs.getNIM()+";"+mhs.getNAMA()+";"+mhs.getALAMAT()+";"+mhs.getSEMESTER()+";"+mhs.getSKS()+";"+mhs.getIPK()+"\n";
                sb.append(line);

            }
        }
        try {
            Files.writeString(path,sb.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void view(){
        System.out.println("==================================================================================");
        System.out.printf("| %-8.8S |", "NIM");
        System.out.printf(" %-20.20S |", "NAMA");
        System.out.printf(" %-20.20S |", "ALAMAT");
        System.out.printf(" %8.8S |", "SEMESTER");
        System.out.printf(" %3.3S |", "SKS");
        System.out.printf(" %4.4S |", "IPK");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------");
        for (Mahasiswa mhs : data ){
            System.out.printf("| %-8S |", mhs.getNIM());
            System.out.printf(" %-20.20S |", mhs.getNAMA());
            System.out.printf(" %-20.20S |", mhs.getALAMAT());
            System.out.printf(" %8.8S |", mhs.getSEMESTER());
            System.out.printf(" %3.3S |", mhs.getSKS());
            System.out.printf(" %4.4S |", mhs.getIPK());
            System.out.println();
        }
        System.out.println("----------------------------------------------------------------------------------");
    }
    boolean insert(String NIM,String NAMA,String ALAMAT,int SEMESTER,int SKS,double IPK){
        boolean status = true;
        if (!data.isEmpty()){
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).getNIM().equalsIgnoreCase(NIM)){
                    status = false;
                    break;
                }
            }
        }
        if (status == true){
            Mahasiswa mhs = new Mahasiswa(NIM, NAMA, ALAMAT, SEMESTER, SKS, IPK);
            data.add(mhs);
            save();
        }
        return status;
    }
    public int search(String NIM){
        int index = -1;
        if (!data.isEmpty()){
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).getNIM().equalsIgnoreCase(NIM)){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }
    public boolean update(int index,String NIM,String NAMA,String ALAMAT,int SEMESTER,int SKS,double IPK){
        boolean status = false;
        if (!data.isEmpty()) {
            if (index >= 0 && index < data.size()) {
                Mahasiswa mhs = new Mahasiswa(NIM, NAMA, ALAMAT, SEMESTER, SKS, IPK);
                data.set(index, mhs);
                save();
                status = true;
            }
        }
        return status;
    }
    public boolean delate(int index){
        boolean status = false;
        if (!data.isEmpty()){
            data.remove(index);
            save();
            status = true;
        }
        return status;
    }

}
