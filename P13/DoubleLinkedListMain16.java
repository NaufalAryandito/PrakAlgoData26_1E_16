package P13;

import java.util.Scanner;

public class DoubleLinkedListMain16 {
    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);
        DoubleLinkedList list = new DoubleLinkedList();
        int pilihan;

        do {
            System.out.println("=== MENU DOUBLE LINKED LIST ===");
            System.out.println("1. Tambah Data di Awal");
            System.out.println("2. Tambah Data di Akhir");
            System.out.println("3. Sisipkan Data di tengah (setelah NIM )");
            System.out.println("4. Hapus Data di Awal");
            System.out.println("5. Hapus Data di Akhir");
            System.out.println("6. Tampilkan Data");
            System.out.println("7. Tampilkan Data Secara Terbalik");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = dito.nextInt();
            dito.nextLine();

            switch (pilihan) {
                case 1:
                    Mahasiswa16 mhsAwal = inputMahasiswa(dito);
                    list.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa16 mhsAkhir = inputMahasiswa(dito);
                    list.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String keyNim = dito.nextLine();
                    System.out.println("Masukkan data baru:");
                    Mahasiswa16 dataBaru = inputMahasiswa(dito);
                    list.insertAfter(keyNim, dataBaru);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    list.print();
                    break;
                case 7:
                    list.printReverse();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
    }

    public static Mahasiswa16 inputMahasiswa(Scanner dito) {
        System.out.print("Masukkan NIM: ");
        String nim = dito.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = dito.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = dito.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = dito.nextDouble();
        dito.nextLine(); // Clear the buffer
        return new Mahasiswa16(nama, nim, kelas, ipk);
    }
}
