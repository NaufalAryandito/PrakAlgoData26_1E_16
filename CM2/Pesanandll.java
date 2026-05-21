package CM2;

public class Pesanandll {
    pesanan head;
    pesanan tail;
    
    Pesanandll() {
        head = null;
        tail = null;
    }
    void tambahPesanan(int kode_pesanan, String nama_pesanan, int harga, String namapembeli) {
        pesanan newPesanan = new pesanan(kode_pesanan, nama_pesanan, harga, namapembeli);
        if (head == null) {
            head = newPesanan;
            tail = newPesanan;
        } else {
            newPesanan.prev = tail;
            tail.next = newPesanan;
            tail = newPesanan;
        }
    }
    void sortByNama(){
        if (head == null || head.next == null) return;
        pesanan Sorted = null;
        
        pesanan current = head;
        while (current != null) {
            pesanan nextNode = current.next;
            current.prev = current.next = null;
            if (Sorted == null || current.nama_pesanan.compareToIgnoreCase(Sorted.nama_pesanan) <=0){
                current.next = Sorted;
                if (Sorted != null) Sorted.prev = current;
                Sorted = current;
            } else {
                pesanan tmp = Sorted;
                while (tmp.next != null &&
                       tmp.next.nama_pesanan.compareToIgnoreCase(current.nama_pesanan) < 0) {
                    tmp = tmp.next;
                }
                current.next = tmp.next;
                if (tmp.next != null) tmp.next.prev = current;
                tmp.next = current;
                current.prev = tmp;
            }
 
            current = nextNode;
        }
 
       
        head = Sorted;
        tail = Sorted;
        while (tail.next != null) tail = tail.next;
    }
 
   
    void cetakLaporan() {
        if (head == null) {
            System.out.println("Belum ada pesanan.");
            return;
        }
 
        sortByNama();
 
        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-14s %-22s %-10s %-20s%n",
                "Kode Pesanan", "Nama Pesanan", "Harga", "Pembeli");
 
        long total = 0;
        pesanan cur = head;
        while (cur != null) {
            System.out.printf("%-14d %-22s %-10d %-20s%n",
                    cur.kode_pesanan, cur.nama_pesanan, cur.harga, cur.namapembeli);
            total += cur.harga;
            cur = cur.next;
        }
        System.out.println("--------------------------------------");
        System.out.printf("Total Pendapatan: Rp %,d%n", total);
    }
 
    boolean isEmpty() {
        return head == null;
    }
}
            