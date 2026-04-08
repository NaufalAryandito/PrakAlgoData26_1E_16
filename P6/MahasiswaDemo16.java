package P6;

import java.util.Scanner;

public class MahasiswaDemo16 {
    public static void main(String[] args) {
      Scanner dito = new Scanner (System.in);
        
      MahasiswaBerpretasi16 list= new MahasiswaBerpretasi16();

      System.out.print("Jumlah Mahasiswa: ");
      int jumlah= dito.nextInt();
      dito.nextLine();
      
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
    }
}
