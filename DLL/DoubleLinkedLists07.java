public class DoubleLinkedLists07 {
    Node07 head;
    Node07 tail;
    int size;

    public DoubleLinkedLists07() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa07 data) {
        Node07 newNode = new Node07(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa07 data) {
        Node07 newNode = new Node07(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa07 data) {
        Node07 current = head;

        // Cari node dengan nim = keyNim
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + "tidak ditemukan.");
            return;
        }

        Node07 newNode = new Node07(data);

        //Jika current adalah tail, cukup tambahkan di akhir
        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            // Sisipkan di tengah
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }
        Node07 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked List masihh kosong, tidak bisa dihapus!");
            return;
        } 
        Mahasiswa07 dataTerhapus = head.data;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head = head.next;
            head.prev  = null;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        dataTerhapus.tampil();
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked List masihh kosong, tidak dapat dihapus!");
            return;
        } 
        Mahasiswa07 dataTerhapus = tail.data;
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data sudah berhasil dihapus. Data yang terhapus adalah:");
        dataTerhapus.tampil();
    }

     public Node07 search(String nim) {
        Node07 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

   void add(int index, Mahasiswa07 data) {
        if (index < 0) {
            System.out.println("Indeks salah.");
        } else if (index == 0) {
            addFirst(data);
        } else {
            Node07 temp = head;
            int i = 0;
            while (temp != null && i < index - 1) {
                temp = temp.next;
                i++;
            }
            if (temp == null) {
                System.out.println("Indeks melebihi jumlah elemen.");
            } else if (temp.next == null) {
                addLast(data);
            } else {
                Node07 newNode = new Node07(data);
                newNode.next = temp.next;
                newNode.prev = temp;
                temp.next.prev = newNode;
                temp.next = newNode;
            }
        }
    }

    public void removeAfter(String nim) {
        Node07 current = head;
        while (current != null && !current.data.nim.equals(nim)) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            System.out.println("Tidak ada node setelah NIM tersebut untuk dihapus.");
            return;
        }

        Node07 dataHapus = current.next;
        current.next = dataHapus.next;
        if (dataHapus.next != null) {
            dataHapus.next.prev = current;
        } else {
            tail = current;
        }

        System.out.println("Data setelah NIM " + nim + " berhasil dihapus:");
        dataHapus.data.tampil();
        size--;
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("List kosong!");
            return;
        }

        Node07 current = head;
        int i = 0;

        while (current != null && i < index) {
            current = current.next;
            i++;
        }

        if (current == null) {
            System.out.println("Index tidak valid!");
            return;
        }

        System.out.print("Data yang dihapus: ");
        current.data.tampil();

        if (current == head) {
            removeFirst();
        } else if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.println("Data pertama:");
            head.data.tampil();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
        } else {
            System.out.println("Data terakhir:");
            tail.data.tampil();
        }
    }

    public Node07 getIndex(int index) {
        if (isEmpty()) return null;

        Node07 current = head;
        int i = 0;

        while (current != null) {
            if (i == index) return current;
            current = current.next;
            i++;
        }
        return null;
    }

    public int size() {
        int count = 0;
        Node07 current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

}
