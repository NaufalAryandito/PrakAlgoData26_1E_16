package P6;

import java.util.Scanner;

public class Maindosen {
        public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);
        DataDosen data = new DataDosen();
        int pilih;

        do {
            System.out.println("\n===== MENU DATA DOSEN =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Semua Data");
            System.out.println("3. Sorting ASC (usia) - Bubble Sort");
            System.out.println("4. Sorting DSC (usia) - Selection Sort");
            System.out.println("5. Sorting ASC (usia) - Insertion Sort");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = dito.nextInt();
            dito.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode        : ");
                    String kd = dito.nextLine();
                    System.out.print("Nama        : ");
                    String nm = dito.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jk = dito.nextLine();
                    boolean kelamin = jk.equalsIgnoreCase("L");

                    System.out.print("Usia        : ");
                    int umur = dito.nextInt();dito.nextLine();

                    Dosen d = new Dosen(kd, nm, jk, kelamin, umur);
                    data.tambah(d);
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.sortingASC();
                    System.out.println("Data berhasil diurutkan ASC (Bubble Sort).");
                    break;

                case 4:
                    data.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC (Selection Sort).");
                    break;

                case 5:
                    data.insertionSort();
                    System.out.println("Data berhasil diurutkan ASC (Insertion Sort).");
                    break;

                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }
        } while (pilih != 0);
    }
}

