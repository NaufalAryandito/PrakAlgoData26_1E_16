package P5;

public class MainNilai {
    public static void main(String[] args) {

        NilaiMahasiswa[] mhs = {
            new NilaiMahasiswa(78, 82),
            new NilaiMahasiswa(85, 88),
            new NilaiMahasiswa(90, 87),
            new NilaiMahasiswa(76, 79),
            new NilaiMahasiswa(92, 95),
            new NilaiMahasiswa(88, 85),
            new NilaiMahasiswa(80, 83),
            new NilaiMahasiswa(82, 84)
        };

        Nilai nilai = new Nilai(mhs);

        System.out.println("UTS Tertinggi (DC): " + nilai.maxUTS(0, mhs.length - 1));
        System.out.println("UTS Terendah (DC): " + nilai.minUTS(0, mhs.length - 1));
        System.out.println("Rata-rata UAS (BF): " + nilai.rataUAS());
    }
}
