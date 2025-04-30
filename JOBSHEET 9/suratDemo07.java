import java.util.Scanner;

public class suratDemo07 {
        public static void main(String[] args) {
            StackSurat07 stack = new StackSurat07(10);
            Scanner sc = new Scanner(System.in);
            int pilih;
    
            do {
                System.out.println("\n===== MENU SURAT IZIN =====");
                System.out.println("1. Terima Surat Izin");
                System.out.println("2. Proses Surat Izin");
                System.out.println("3. Lihat Surat Izin Terakhir");
                System.out.println("4. Cari Surat (berdasarkan nama mahasiswa)");
                System.out.println("0. Keluar");
                System.out.print("Pilih: ");
                pilih = sc.nextInt();
                sc.nextLine();

                switch (pilih) {
                    case 1:
                        System.out.print("ID Surat        : ");
                        String id = sc.nextLine();
                        System.out.print("Nama mahasiwa   : ");
                        String nama = sc.nextLine();
                        System.out.print("Kelas           : ");
                        String kelas = sc.nextLine();
                        System.out.print("Jenis Izin (S/I): ");
                        char jenis = sc.nextLine().toUpperCase().charAt(0);
                        System.out.print("Durasi (Hari)   : ");
                        int durasi = sc.nextInt();

                        Surat07 surat = new Surat07 (id, nama, kelas, jenis, durasi);
                        stack.push(surat);
                        break;
                    case 2:
                        Surat07 diproses = stack.pop();
                        if (diproses != null) {
                            System.out.println("\nSurat sedang diproses");
                            diproses.tampilkan();
                            System.out.println("\nSurat telah diproses");
                        }
                        break;
                    case 3:
                        Surat07 lihat = stack.peek();
                        if (lihat != null) {
                            System.out.println("Surat terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                        }
                        break;
                    case 4:
                        System.out.print("Masukkan nama mahasiswa: ");
                        String cariNama = sc.nextLine();
                        stack.cariSurat(cariNama);
                        break;

                    default:
                    System.out.println("Pilihan tidak valid.");
                        break;
                }
            } while (pilih >= 1 && pilih <= 4);

        }
}