package P16;

public class MahasiswaTugas16 {
    String nim;
    String nama;
    String telf;

    public MahasiswaTugas16(String nim, String nama, String telf) {
        this.nim = nim;
        this.nama = nama;
        this.telf = telf;
    }

    public String toString() {

        return String.format("%-10s %-15s %-10s", nim, nama, telf);
    }
}
