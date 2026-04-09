package CM1;

public class Peminjaman16 {
    Mahasiswa16 mhs;
    Buku16 buku;
    int lamaPinjam;
    int denda;
    int telat;

    Peminjaman16(Mahasiswa16 mhs, Buku16 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
    }

    public class Peminjaman {
        Mahasiswa16 mhs;
        Buku16 buku;
        int lamaPinjam;
        int telat;
        int denda;

        Peminjaman(Mahasiswa16 mhs, Buku16 buku, int lamaPinjam) {
            this.mhs = mhs;
            this.buku = buku;
            this.lamaPinjam = lamaPinjam;

            hitungDenda();
        }

        void hitungDenda() {
            int batas = 5;
            int biayaTelat = 2000;

            if (lamaPinjam > batas) {
                telat = lamaPinjam - batas;
                denda = telat * biayaTelat;
            } else {
                telat = 0;
                denda = 0;
            }
        }

    }

    public void tampilPeminjaman() {
        System.out.println(mhs.nama16 + " | " + buku.judul
                + " | Lama: " + lamaPinjam
                + " | Terlambat: " + telat
                + " | Denda: " + denda);
    }

}
