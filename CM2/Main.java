package CM2;

import java.util.Scanner;

public class Main {

    static Scanner dito = new Scanner(System.in);

    public static void main(String[] args) {

        Pesanandll daftarPesanan = new Pesanandll();
        Antriandll antrian = new Antriandll();

        // Data awal antrian
        antrian.tambahAntrian("Ainra", "08224500000");
        antrian.tambahAntrian("Danra", "08224511111");
        antrian.tambahAntrian("Sanri", "08224522222");

        int pilihan;

        do {
            tampilkanMenu();

            System.out.print("Pilih menu : ");
            pilihan = dito.nextInt();
            dito.nextLine();

            switch (pilihan) {

                case 1:
                    menuTambahAntrian(antrian);
                    break;

                case 2:
                    antrian.cetakAntrian();
                    break;

                case 3:
                    menuHapusAntrian(antrian, daftarPesanan);
                    break;

                case 4:
                    daftarPesanan.cetakLaporan();
                    break;

                case 0:
                    System.out.println("Terima kasih telah menggunakan Sistem Antrian Royal Delish!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
    }

    static void tampilkanMenu() {
        System.out.println("\n==============================");
        System.out.println("   SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("==============================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
        System.out.println("==============================");
    }

    static void menuTambahAntrian(Antriandll antrian) {

        System.out.println("\n--- Tambah Antrian ---");

        System.out.print("Nama Pembeli : ");
        String nama = dito.nextLine();

        System.out.print("No HP        : ");
        String noHp = dito.nextLine();

        int nomorAntrian = antrian.tambahAntrian(nama, noHp);

        System.out.println("Antrian berhasil ditambahkan!");
        System.out.println("Nomor Antrian : " + nomorAntrian);
    }

    static void menuHapusAntrian(Antriandll antrian, Pesanandll pesanan) {

        if (antrian.isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }

        System.out.println("\n--- Daftar Antrian ---");
        antrian.cetakAntrian();

        System.out.print("\nMasukkan nomor antrian yang dipanggil : ");
        int noAntrian = dito.nextInt();
        dito.nextLine();

        pembeli16 pembeli = antrian.hapusAntrian(noAntrian);

        if (pembeli == null) {
            System.out.println("Nomor antrian tidak ditemukan!");
            return;
        }

        System.out.println("\nPembeli " + pembeli.nama + " dipanggil ke kasir");

        System.out.println("\n--- Input Pesanan ---");

        System.out.print("Kode Pesanan : ");
        int kode = dito.nextInt();
        dito.nextLine();

        System.out.print("Nama Pesanan : ");
        String namaPesanan = dito.nextLine();

        System.out.print("Harga        : ");
        int harga = dito.nextInt();
        dito.nextLine();

        pesanan.tambahPesanan(kode, namaPesanan, harga, pembeli.nama);

        System.out.println("\nPesanan berhasil ditambahkan!");
        System.out.println(pembeli.nama + " memesan " + namaPesanan);
    }
}