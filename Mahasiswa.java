public class Mahasiswa {
    private String NIM;
    private String NAMA;
    private String ALAMAT;
    private int SEMESTER;
    private int SKS;
    private double IPK;

    public Mahasiswa(String NIM, String NAMA, String ALAMAT, int SEMESTER, int SKS, double IPK) {
        this.NIM = NIM;
        this.NAMA = NAMA;
        this.ALAMAT = ALAMAT;
        this.SEMESTER = SEMESTER;
        this.SKS = SKS;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNAMA() {
        return NAMA;
    }

    public String getALAMAT() {
        return ALAMAT;
    }

    public int getSEMESTER() {
        return SEMESTER;
    }

    public int getSKS() {
        return SKS;
    }

    public double getIPK() {
        return IPK;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "NIM='" + NIM + '\'' +
                ", NAMA='" + NAMA + '\'' +
                ", ALAMAT='" + ALAMAT + '\'' +
                ", SEMESTER=" + SEMESTER +
                ", SKS=" + SKS +
                ", IPK=" + IPK +
                '}';
    }
}

