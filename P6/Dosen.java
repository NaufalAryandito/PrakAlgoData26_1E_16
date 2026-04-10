package P6;

public class Dosen {
    
    String kode;
    String nama;
    boolean jenisKelamin; 
    int usia;

    public Dosen(String kd, String name, String jk, boolean kelamin, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = kelamin;
        this.usia = age;
    }

    void tampil() {
        System.out.println("=============================");
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia        : " + usia);
    }
}

