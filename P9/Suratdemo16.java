package P9;

import java.util.Scanner;

public class Suratdemo16 {
    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);
        StackSurat16 stack = new StackSurat16(5);
        int pilih;

        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Terima Surat");
            System.out.println("2. Proses Surat");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            pilih = dito.nextInt();
            dito.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = dito.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = dito.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = dito.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = dito.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = dito.nextInt();
                    dito.nextLine();

                    Surat16 s = new Surat16(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    System.out.println("Surat berhasil ditambahkan!");
                    break;

                case 2:
                    Surat16 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat dari: " + proses.namaMahasiswa);
                    } else {
                        System.out.println("Tidak ada surat!");
                    }
                    break;

                case 3:
                    Surat16 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dari: " + lihat.namaMahasiswa);
                    } else {
                        System.out.println("Stack kosong!");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = dito.nextLine();

                    if (stack.cari(cari)) {
                        System.out.println("Surat ditemukan!");
                    } else {
                        System.out.println("Surat tidak ditemukan!");
                    }
                    break;
            }

        } while (pilih != 0);

    }
}
