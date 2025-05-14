public class SingleLinkedList07 {
    Node07Mahasiswa head;
    Node07Mahasiswa tail;

     boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if(!isEmpty()) {
            Node07Mahasiswa tmp = head;
            System.out.print("Isi Linked List:\n");
            while(tmp != null) {
                tmp.data.tampilkanData();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong!");
        }
    }

    public void addFirst(Mahasiswa07 input) {
        Node07Mahasiswa ndInput = new Node07Mahasiswa(input, null);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa07 input) {
        Node07Mahasiswa ndInput = new Node07Mahasiswa(input, null);
        if(isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(String key, Mahasiswa07 input) {
        Node07Mahasiswa ndInput = new Node07Mahasiswa(input, null);
        Node07Mahasiswa temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Mahasiswa07 input) {
        if(index < 0) {
            System.out.println("Indeks salah!");
        } else if(index == 0) {
            addFirst(input);
        } else {
            Node07Mahasiswa temp = head;
            for(int i = 0; i < index - 1; i++) {
                if(temp.next == null) break;
                temp = temp.next;
            }
            temp.next = new Node07Mahasiswa(input, temp.next);
            if (temp.next.next == null) 
            tail = temp.next;
        }
    }
}
