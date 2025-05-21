import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedLists07 list = new DoubleLinkedLists07();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double LInked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah data setelah NIM tertentu");
            System.out.println("8. Tambahkan data pada indeks tertentu");
            System.out.println("9. Hapus data setelah NIM tertentu");
            System.out.println("10. Hapus data pada indeks tertentu");
            System.out.println("11. Tampilkan data pertama");
            System.out.println("12. Tampilkan data terakhir");
            System.out.println("13. Tampilkan data pada indeks tertentu");
            System.out.println("14. Tampilkan jumlah data (size)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa07 mhs = inputMahasiswa(sc);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa07 mhs = inputMahasiswa(sc);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.println("Masukkan NIM yang dicari");
                    String nim = sc.nextLine();
                    Node07 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan: ");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                } 
                case 7 -> {
                    System.out.println("Masukkann NIM setelah data ingin disisipkan");
                    String keyNim = sc.nextLine();
                    Mahasiswa07 mhs = inputMahasiswa(sc);
                    list.insertAfter(keyNim, mhs);
                }
                case 8 -> {
                     System.out.print("Masukkan indeks untuk menyisipkan data: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    Mahasiswa07 mhs = inputMahasiswa(sc);
                    list.add(index, mhs);
                }
                case 9 -> {
                    System.out.print("Masukkan NIM acuan penghapusan setelahnya: ");
                    String nim = sc.nextLine();
                    list.removeAfter(nim);
                }
                case 10 -> {
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    list.remove(index);
                }
                case 11 -> list.getFirst();
                case 12 -> list.getLast();
                case 13 -> {
                    System.out.print("Masukkan indeks: ");
                    int idx = sc.nextInt();
                    sc.nextLine();
                    Node07 node = list.getIndex(idx);
                    if (node != null) {
                        System.out.println("Data pada indeks " + idx + ":");
                        node.data.tampil();
                    } else {
                        System.out.println("Index tidak valid atau list kosong.");
                    }
                }
                case 14 -> {
                     System.out.println("Jumlah data dalam list: " + list.size());
                }
                case 0 -> System.out.println("keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan !=0);
    }

    static Mahasiswa07 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine(); 
        return new Mahasiswa07(nim, nama, kelas, ipk);
    }
}
