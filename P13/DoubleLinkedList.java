package P13;

public class DoubleLinkedList {
    Node16 head;
    Node16 tail;
    int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa16 data) {
        Node16 newNode = new Node16(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa16 data) {
        Node16 newNode = new Node16(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNim, Mahasiswa16 data) {
        Node16 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }
        Node16 newNode = new Node16(data);
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        System.out.println("Data di awal berhasil dihapus.");
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        System.out.println("Data di akhir berhasil dihapus.");
        size--;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        Node16 current = head;
        while (current != null) {
            current.data.tampil();
            System.out.println("-------------------");
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        Node16 current = tail;
        while (current != null) {
            current.data.tampil();
            System.out.println("-------------------");
            current = current.prev;
        }
    }

    public void add(int index, Mahasiswa16 data) {
        if (index < 0) {
            System.out.println("Index tidak valid.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node16 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Index melebihi ukuran jumlah data ");
            return;
        }
        if (current == tail) {
            addLast(data);
        } else {
            Node16 newNode = new Node16(data);
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
        size++;
    }

    public void removeAfter(String keyNim) {
        Node16 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Node setelah key tidak ditemukan atau tidak ada node setelah key.");
            return;
        }
        Node16 deleted = current.next;
        System.out.println("Data yang dihapus:");
        deleted.data.tampil();
        if (deleted == tail) {
            current.next = null;
            tail = current;
        } else {
            current.next = deleted.next;
            deleted.next.prev = current;
        }
        size--;
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node16 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Index tidak ditemukan.");
            return;

        }
        System.out.println("Data yang dihapus:");
        current.data.tampil();
        if (current == tail) {
            removeLast();
        } else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        System.out.println("Data pertama:");
        head.data.tampil();
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        System.out.println("Data terakhir:");
        tail.data.tampil();
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("List kosong.");
            return;
        }
        Node16 current = head;
        int i = 0;
        while (current != null && i < index) {
            current = current.next;
            i++;
        }
        if (current == null) {
            System.out.println("Index tidak ditemukan.");
            return;
        }
        System.out.println("Data pada index " + index + ":");
        current.data.tampil();
    }
    public int size() {
        return size;
    }
    public void printSize() {
        System.out.println("Jumlah data: " + size);
    }
}