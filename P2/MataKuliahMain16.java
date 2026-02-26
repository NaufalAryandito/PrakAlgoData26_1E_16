package P2;

public class MataKuliahMain16 {

    public static void main(String[] args) {
        System.out.println("====================");
        System.out.println("Mata Kuliah 1");
        System.out.println("====================");
        MataKuliah16 MK1 = new MataKuliah16();
        MK1.Nama16 = "Algoritma dan Struktur Data";
        MK1.KodeMK16 = "123";
        MK1.sks16 = 3;
        MK1.jumlahJam16 = 5;

        MK1.tampilkanInformasi();
        MK1.updateSKS(4);
        MK1.tambahJam(4);
        MK1.tampilkanInformasi();

        System.out.println("====================");
        System.out.println("Mata Kuliah 2");
        System.out.println("=====================");
        MataKuliah16 mk2 = new MataKuliah16("Basis Data", "456", 2, 4);
        mk2.tampilkanInformasi();
        mk2.updateSKS(3);
        mk2.Kurangjam(2);
        mk2.tampilkanInformasi();
    }
}