public class SLLMain07 {
    public static void main(String[] args) {
         SingleLinkedList07 sll = new SingleLinkedList07();

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
    }
}
