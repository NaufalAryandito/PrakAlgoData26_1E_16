package P6;

import java.util.Scanner;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
      Scanner dito = new Scanner (System.in);
      
      System.out.print("Jumlah Mahasiswa: ");
      int jumlah= dito.nextInt();
      dito.nextLine();
      MahasiswaBerpretasi16 list= new MahasiswaBerpretasi16(jumlah);

      
      for (int i = 0; i < jumlah; i++) {
        System.out.println("data mahasiswa ke- "+(i+1));
        System.out.print("NIM: ");
        String nim = dito.nextLine();
        System.out.print("Nama: ");
        String nama= dito.nextLine();
        System.out.print("Kelas: ");
        String kelas = dito.nextLine();
        System.out.print("IPK: ");
        double ipk = dito.nextDouble();
        dito.nextLine();

        Mahasiswa16 m= new Mahasiswa16(nim, nama, kelas, ipk);
        list.tambah(m);
      }
       
        
        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        list.selectionSort();
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC) : ");
        list.insertionSort();
        list.tampil();  

        list.tampil();
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK : ");
        double cari =dito.nextDouble();

        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss= (int) posisi;
        list.tampilPosisi(cari,pss);
        list.tampilDataSearch(cari,pss);

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("---------------------------------------------------");
        double posisi2 = list.findBinarySearch(cari,0, jumlah-1);
        int pss2= (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
      }
}
