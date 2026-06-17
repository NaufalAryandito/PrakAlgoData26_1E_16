package P16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class SistemNilaiUtama16 {
    static List<MahasiswaTugas16> listMahasiswa = new ArrayList<>();
    static List<MataKuliahTugas16> listMK = new ArrayList<>();
    static List<NilaiTugas16> listNilai = new ArrayList<>();

    static Queue<MahasiswaTugas16> queueHapus = new LinkedList<>();

    public static void main(String[] args) {
        initDataAwal();

        Scanner sc = new Scanner(System.in);
        int menu;

        do {
            System.out.println("*************************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("*************************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai (Ascending)");
            System.out.println("5. Hapus Mahasiswa Terlama (Queue)");
            System.out.println("6. Keluar");
            System.out.print("Pilih : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:

                    System.out.println("\n--- DAFTAR MAHASISWA ---");
                    System.out.printf("%-10s %-15s %-10s\n", "NIM", "Nama", "Telf");
                    for (MahasiswaTugas16 m : listMahasiswa)
                        System.out.println(m);

                    System.out.print("Pilih mahasiswa by nim: ");
                    String nimInput = sc.nextLine();
                    MahasiswaTugas16 mhsPilihan = cariMahasiswa(nimInput);

                    System.out.println("\n--- DAFTAR MATA KULIAH ---");
                    System.out.printf("%-10s %-35s %-5s\n", "Kode", "Mata Kuliah", "SKS");
                    for (MataKuliahTugas16 mk : listMK) {
                        System.out.printf("%-10s %-35s %-5d\n", mk.kode, mk.nama, mk.sks);
                    }

                    System.out.print("Pilih MK by kode: ");
                    String kodeInput = sc.nextLine();
                    MataKuliahTugas16 mkPilihan = cariMK(kodeInput);

                    if (mhsPilihan != null && mkPilihan != null) {
                        System.out.print("Masukkan Nilai: ");
                        double nilai = sc.nextDouble();
                        listNilai.add(new NilaiTugas16(mhsPilihan, mkPilihan, nilai));
                        System.out.println("Data nilai sukses ditambahkan!\n");
                    } else {
                        System.out.println("Error: NIM atau Kode MK tidak valid!\n");
                    }
                    break;

                case 2:
                    tampilkanTabelNilai();
                    break;

                case 3:

                    System.out.print("Masukkan data mahasiswa [nim] : ");
                    String cariNim = sc.nextLine();
                    System.out.printf("\n%-10s %-15s %-30s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
                    int totalSKS = 0;
                    for (NilaiTugas16 n : listNilai) {
                        if (n.mhs.nim.equals(cariNim)) {
                            System.out.printf("%-10s %-15s %-30s %-5d %-5.2f\n", n.mhs.nim, n.mhs.nama, n.mk.nama,
                                    n.mk.sks, n.nilaiAngka);
                            totalSKS += n.mk.sks;
                        }
                    }
                    System.out.println("Total SKS " + totalSKS + " telah diambil.\n");
                    break;

                case 4:

                    listNilai.sort((n1, n2) -> Double.compare(n1.nilaiAngka, n2.nilaiAngka));
                    System.out.println("\n[Data Diurutkan Berdasarkan Nilai Terkecil ke Terbesar]");
                    tampilkanTabelNilai();
                    break;

                case 5:

                    if (!queueHapus.isEmpty()) {
                        MahasiswaTugas16 mhsKeluar = queueHapus.poll();
                        listMahasiswa.remove(mhsKeluar);

                        listNilai.removeIf(n -> n.mhs.nim.equals(mhsKeluar.nim));
                        System.out.println("\n-> SUKSES: Mahasiswa " + mhsKeluar.nama + " (" + mhsKeluar.nim
                                + ") dihapus lewat sistem Queue!\n");
                    } else {
                        System.out.println("Antrean mahasiswa sudah kosong!\n");
                    }
                    break;

                case 6:
                    System.out.println("Keluar program.");
                    break;
            }
        } while (menu != 6);
    }

    static void initDataAwal() {
        MahasiswaTugas16 m1 = new MahasiswaTugas16("20001", "Thalhah", "021xxx");
        MahasiswaTugas16 m2 = new MahasiswaTugas16("20002", "Zubair", "021xxx");
        MahasiswaTugas16 m3 = new MahasiswaTugas16("20003", "Abdur-Rahman", "021xxx");
        MahasiswaTugas16 m4 = new MahasiswaTugas16("20004", "Sa'ad", "021xxx");

        listMahasiswa.addAll(Arrays.asList(m1, m2, m3, m4));
        queueHapus.addAll(Arrays.asList(m1, m2, m3, m4));

        listMK.add(new MataKuliahTugas16("00001", "Internet of Things", 3));
        listMK.add(new MataKuliahTugas16("00002", "Algoritma dan Struktur Data", 2));
        listMK.add(new MataKuliahTugas16("00003", "Algoritma dan Pemrograman", 2));
        listMK.add(new MataKuliahTugas16("00004", "Praktikum ASD", 3));
    }

    static MahasiswaTugas16 cariMahasiswa(String nim) {
        for (MahasiswaTugas16 m : listMahasiswa) {
            if (m.nim.equals(nim))
                return m;
        }
        return null;
    }

    static MataKuliahTugas16 cariMK(String kode) {
        for (MataKuliahTugas16 mk : listMK) {
            if (mk.kode.equals(kode))
                return mk;
        }
        return null;
    }

    static void tampilkanTabelNilai() {
        System.out.printf("\n%-10s %-15s %-30s %-5s %-5s\n", "Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
        for (NilaiTugas16 n : listNilai) {
            System.out.printf("%-10s %-15s %-30s %-5d %-5.2f\n", n.mhs.nim, n.mhs.nama, n.mk.nama, n.mk.sks,
                    n.nilaiAngka);
        }
        System.out.println();
    }
}
