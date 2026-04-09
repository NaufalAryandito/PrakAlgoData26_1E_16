package CM1;
import java.util.Scanner;

public class MainPeminjaman {

    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);

       
        Mahasiswa16[] m = {
            new Mahasiswa16("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa16("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa16("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku16[] b = {
            new Buku16("B001", "Algoritma", 2020),
            new Buku16("B002", "Basis Data", 2019),
            new Buku16("B003", "Pemrograman", 2021),
            new Buku16("B004", "Fisika", 2024)
        };

        Peminjaman16[] p = {
            new Peminjaman16(m[0], b[0], 7),
            new Peminjaman16(m[1], b[1], 3),
            new Peminjaman16(m[2], b[2], 10),
            new Peminjaman16(m[2], b[3], 6)
        };

        int pilih;
        do {
            System.out.println("=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            pilih = dito.nextInt();

            switch(pilih){
                case 1:
                    System.out.println("\nDaftar Mahasiswa:");
                    for(Mahasiswa16 x : m) x.tampilMahasiswa();
                    System.out.println();
                    break;

                case 2:
                    System.out.println("\nDaftar Buku:");
                    for(Buku16 x : b) x.tampilBuku();
                    System.out.println();
                    break;

                case 3:
                    System.out.println("\nData Peminjaman:");
                    for(Peminjaman16 x : p) x.tampilPeminjaman();
                    System.out.println();
                    break;

                case 4:
                   
                    for(int i=0; i<p.length-1; i++){
                        int max = i;
                        for(int j=i+1; j<p.length; j++){
                            if(p[j].denda > p[max].denda)
                                max = j;
                        }
                        Peminjaman16 temp = p[i];
                        p[i] = p[max];
                        p[max] = temp;
                    }

                    System.out.println("\nSetelah diurutkan (Denda terbesar):");
                    for(Peminjaman16 x : p) x.tampilPeminjaman();
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Masukkan NIM: ");
                    String cari = dito.next();
                    boolean ketemu = false;

                    for(Peminjaman16 x : p){
                        if(x.mhs.nim.equals(cari)){
                            x.tampilPeminjaman();
                            ketemu = true;
                        }
                    }

                    if(!ketemu)
                        System.out.println("Data tidak ditemukan.");

                    System.out.println();
                    break;

                case 6:
                    System.out.println("Keluar...");
                    break;
            }

        } while (pilih != 6);
    }
}