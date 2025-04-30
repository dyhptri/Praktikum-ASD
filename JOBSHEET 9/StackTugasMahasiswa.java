public class StackTugasMahasiswa {
    mahasiswa07 [] stack;
    int top;
    int size;

    public StackTugasMahasiswa (int size) {
        this.size = size;
        stack = new mahasiswa07[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push (mahasiswa07 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! tidak bisa menambahkan tugas lagi.");
        }
    }

    public mahasiswa07 pop() {
        if (!isEmpty()) {
            mahasiswa07 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! tidak ada tugas untuk dinilai.");
            return null;
        }
    }



    public mahasiswa07 peekAtas() {
        if(!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public mahasiswa07 peekbawah(){
        if(!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas );
        }
        System.out.println("");
    }

    public String konversiDesimalBiner (int nilai) {
        Stackkonversi07 stack = new Stackkonversi07();
        while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

    public int jumlah(){
        int x=0;
        for (int i=0; i<=top; i++){
            x++;
        }
        return x;
    }

}
