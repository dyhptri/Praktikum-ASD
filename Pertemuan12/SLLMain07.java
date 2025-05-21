import java.util.Scanner;

public class SLLMain07 {

    public static void main(String[] args) {
         SingleLinkedList07 sll = new SingleLinkedList07();
         Scanner sc = new Scanner(System.in);
       
         Mahasiswa07 mhs1 = new Mahasiswa07("24212200", "Alvaro", 4.0, "1A");
         Mahasiswa07 mhs2 = new Mahasiswa07("23212201", "Bimon", 3.8, "2B");
         Mahasiswa07 mhs3 = new Mahasiswa07("22212202", "Cintia", 3.5, "3C");
         Mahasiswa07 mhs4 = new Mahasiswa07("21212203", "Dirga", 3.6, "4D");
         
         sll.print();
         sll.addFirst(mhs4);
         sll.print();
         sll.addLast(mhs1);
         sll.print();
         sll.insertAfter("Dirga", mhs3);
         sll.insertAt(2, mhs2);
         sll.print();

        System.out.println("data index 1: ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexof("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

         //     int pilih;
    //     do {
    //         System.out.println("========== Menu Linked List ==========");
    //         System.out.println("1. Tambah data di awal (addFirst)");
    //         System.out.println("2. Tambah data di akhir (addLast)");
    //         System.out.println("3. Tambah data setelah nama tertentu (insertAfter)");
    //         System.out.println("4. Tambah data di indeks tertentu (insertAt)");
    //         System.out.println("5. Tampilkan data");
    //         System.out.println("0. Keluar");
    //         System.out.print("Pilih menu: ");
    //         pilih = sc.nextInt();
    //         sc.nextLine();

    //         switch (pilih) {
    //             case 1:
    //                 Mahasiswa07 m1 = inputMahasiswa(sc);
    //                 sll.addFirst(m1);
    //                 break;
    //             case 2:
    //                 Mahasiswa07 m2 = inputMahasiswa(sc);
    //                 sll.addLast(m2);
    //                 break;
    //             case 3:
    //                 System.out.print("Masukkan nama setelah siapa akan disisipkan: ");
    //                 String key = sc.nextLine();
    //                 Mahasiswa07 m3 = inputMahasiswa(sc);
    //                 sll.insertAfter(key, m3);
    //                 break;
    //             case 4:
    //                 System.out.print("Masukkan indeks: ");
    //                 int index = sc.nextInt();
    //                 sc.nextLine();
    //                 Mahasiswa07 m4 = inputMahasiswa(sc);
    //                 sll.insertAt(index, m4);
    //                 break;
    //             case 5:
    //                 sll.print();
    //                 break;
    //             case 0:
    //                 System.out.println("Terima kasih!");
    //                 break;
    //             default:
    //                 System.out.println("Pilihan tidak valid.");
    //         }
    //     } while (pilih != 0);
    //     sc.close();
    // }
    
    // static Mahasiswa07 inputMahasiswa(Scanner sc) {
    //     System.out.print("Masukkan NIM: ");
    //     String nim = sc.nextLine();
    //     System.out.print("Masukkan Nama: ");
    //     String nama = sc.nextLine();
    //     System.out.print("Masukkan Kelas: ");
    //     String kelas = sc.nextLine();
    //     System.out.print("Masukkan IPK: ");
    //     double ipk = sc.nextDouble();
    //     sc.nextLine(); 
    //     return new Mahasiswa07(nim, nama, ipk, kelas);
    // }
}
}
