import java.util.Scanner;

public class mahasiswaDemo07{
    public static void main(String[] args) {
        StackTugasMahasiswa stack = new StackTugasMahasiswa(5);
        int pilih;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat tugas Terbawah ");
            System.out.println("6. Banyak tugas yang sudah dikumpulkan");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine(); 

        switch (pilih) {
            case 1:
                System.out.print("Nama: ");
                String nama = scan.nextLine();
                System.out.print("NIM: ");
                String nim = scan.nextLine();
                System.out.print("Kelas: ");
                String kelas = scan.nextLine();
            
                mahasiswa07 mhs = new mahasiswa07(nama, nim, kelas);
                stack.push(mhs);
                System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                break;
        
            case 2:
                mahasiswa07 dinilai = stack.pop();
                if (dinilai != null) {
                    System.out.println("Menilai tugas dari " + dinilai.nama);
                    System.out.print("Masukkan nilai (0-100): ");
                    int nilai = scan.nextInt();
                    dinilai.tugasDinilai(nilai);
                    System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);

                    String biner = stack.konversiDesimalBiner(nilai);
                    System.out.println("Nilai Biner Tugas: " + biner);
                }
                break;
            case 3:
                mahasiswa07 lihatAtas = stack.peekAtas();
                if (lihatAtas != null) {
                    System.out.println("Tugas terakhir dikumpulkan oleh " + lihatAtas.nama);
                }
                break;
        
            case 4:
                System.out.println("Daftar semua tugas");
                System.out.println("Nama\tNIM\tKelas");
                stack.print();
                break;
            case 5:
                mahasiswa07 lihatBawah = stack.peekbawah();
                if (lihatBawah != null) {
                    System.out.println("Tugas awal dikumpulkan oleh " + lihatBawah.nama);
                }
                break;
            case 6:
                int jmh = stack.jumlah();
                System.out.println("Jumlah Tugas yang dikumpulkan adalah " + jmh);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
            }
        }   while (pilih >= 1 && pilih <= 5);

    }
}