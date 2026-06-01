package P14;

public class Mahasiswa16 {
    String nama;
    String kelas;
    String nim;
    double ipk;
    public Mahasiswa16(String nama, String kelas, String nim, double ipk) {
        this.nama = nama;
        this.kelas = kelas;
        this.nim = nim;
        this.ipk = ipk;
    }
    void tampilinformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
    }

}
