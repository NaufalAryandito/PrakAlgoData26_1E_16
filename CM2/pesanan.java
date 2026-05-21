package CM2;

public class pesanan {
    int kode_pesanan;
    String nama_pesanan;
    int harga;
    String namapembeli;
    pesanan prev;
    pesanan next;
   

    public pesanan(int kode_pesanan, String nama_pesanan, int harga, String namapembeli) {
        this.kode_pesanan = kode_pesanan;
        this.nama_pesanan = nama_pesanan;
        this.harga = harga;
        this.namapembeli = namapembeli;
        this.prev = null;
        this.next = null;
    }
}
