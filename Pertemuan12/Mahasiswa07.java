public class Mahasiswa07 {
    String nim;
    String nama;
    String kelas;
    double ipk;


    public Mahasiswa07 (String nm, String name, double ipk, String kls) {
        nim = nm;
        nama = name;
        this.ipk = ipk;
        kelas = kls;
    }

    public void tampilkanData() {
        System.out.println(nama + " - " + nim + " - " +  kelas + " - " + " - " + ipk);
    }
}