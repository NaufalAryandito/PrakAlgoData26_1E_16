package P2;

public class dosenMain16 {
    public static void main(String[] args) {
        System.out.println("==============");
        System.out.println("Dosen 1");
        System.out.println("==============");
        dosen16 dsn1 = new dosen16();
        dsn1.idDosen16 = "24567389";
        dsn1.nama16 = "Arif Budiman";
        dsn1.tahunGabung16 = 2019;
        dsn1.Status16 = true;
        dsn1.bdgahli16 = "Pemrograman";

        dsn1.tampilInformasi();
        System.out.println();
        System.out.println("-Update Dosen-");
        dsn1.ubahKeahlian("Basis Data");
        dsn1.tampilInformasi();
        System.out.println("Masa Kerja: " + dsn1.hitMasaKerja(2026) + " tahun");

        System.out.println("==============");
        System.out.println("Dosen 2");
        System.out.println("==============");

        dosen16 dsn2 = new dosen16("1324678", "Syaifullah", 2000, true, "Agama Islam");
        dsn2.StatusAktif(false);
        dsn2.tampilInformasi();
        System.out.println("Masa Kerja: " + dsn2.hitMasaKerja(2026) + " tahun");

    }
}
