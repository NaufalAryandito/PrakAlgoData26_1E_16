package P11;

public class SingleLinkedList16 {
    Node16 head;
    Node16 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node16 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilanInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(Mahasiswa16 input) {
        Node16 ndInput = new Node16(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    public void addLast(Mahasiswa16 input) {
        Node16 ndInput = new Node16(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(Mahasiswa16 key, Mahasiswa16 input) {
        Node16 ndInput = new Node16(input, null);
        Node16 temp = head;
        do {
            if (temp.data.nama.equalsIgnoreCase(key.nama)) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null)
                    tail = ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void InsertAt(int index, Mahasiswa16 input) {
        if (index < 0) {
            System.out.println("Indeks Salah");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node16 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Indeks Lebih Besar Dari Jumlah Elemen");
            } else if (temp.next == null) {
                addLast(input);
            } else {
                Node16 ndInput = new Node16(input, null);
                ndInput.next = temp.next;
                temp.next = ndInput;
            }
        }
    }
    
}
