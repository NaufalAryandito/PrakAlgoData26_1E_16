package CM2;

public class Antriandll {
    pembeli16 head;
    pembeli16 tail;
    int count_antrian;

    public Antriandll() {
        head = null;
        tail = null;
        count_antrian = 0;
    }

    int tambahAntrian(String nama, String noHp) {
        count_antrian++;
        pembeli16 newPembeli = new pembeli16(count_antrian, nama, noHp);
        if (head == null) {
            head = newPembeli;
            tail = newPembeli;
        } else {
            newPembeli.prev = tail;
            tail.next = newPembeli;
            tail = newPembeli;
        }
        return count_antrian;
    }

    void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("============================");
        System.out.println("Daftar Antrian Pembeli:");
        System.out.println("============================");
        System.out.printf("%-12s %-20s %-15s%n", "No Antrian", "Nama", "No HP");
        pembeli16 current = head;
        while (current != null) {
            System.out.printf("%-12d %-20s %-15s%n", current.no_antrian, current.nama, current.noHp);
            current = current.next;
        }
    }

    pembeli16 hapusAntrian(int no_antrian) {
        pembeli16 current = head;

        while (current != null) {
            if (current.no_antrian == no_antrian) {
                // Lepas dari DLL
                if (current.prev != null)
                    current.prev.next = current.next;
                else
                    head = current.next;

                if (current.next != null)
                    current.next.prev = current.prev;
                else
                    tail = current.prev;

                current.prev = null;
                current.next = null;
                return current;
            }
            current = current.next;
        }
        return null; // tidak ditemukan
    }

    boolean isEmpty() {
        return head == null;
    }
}