public class StackSurat07 {
    Surat07 [] surat;
    int top;
    int size;

    StackSurat07 (int size) {
        this.size = size;
        surat = new Surat07[size];
        top = -1;
    }

    public boolean isFull (){
        if (top == size-1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty (){
        if (top == -1) {
            return true;
        } else{
            return false;
        }
    }

    //push
    public void push (Surat07 srt){
        if (!isFull()){
            top++;
            surat[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi. ");
        }
    }

    //pop
    public Surat07 pop (){
        if (!isEmpty()){
            Surat07 m = surat[top];
            top--;
            return m;
        } else {
            System.out.println("Surat kosong!");
            return null;
        }
    }

    //peek
    public Surat07 peek (){
        if (!isEmpty()){
            return surat[top];
        } else {
            System.out.println("Kosong! Tidak ada Surat yang diterima");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (Surat07 surat : surat) {
            if (surat != null && surat.namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.print("Surat ditemukan: \n");
                surat.tampilkan();
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }

    }
    
}