package P3;
import java.util.Scanner;
public class Matakuliah_demo16 {
    public static void main(String[] args) {
        Scanner dito= new Scanner (System.in);
        Matakuliah16[] arrayOfMatakuliah16 = new Matakuliah16[3];
        String kode16, nama16, dummy, ruang16;
        int sks16, jumlahJam ;

        for (int i = 0; i < 3; i++) {
        System.out.println("Masukkan data matakuliah ke- "+ (i+1));
        System.out.print("Kode : ");
        kode16= dito.nextLine();
        System.out.print("Nama : ");
        nama16= dito.nextLine();
        System.out.print("SKS : ");
        dummy= dito.nextLine();
        sks16= Integer.parseInt(dummy);
        System.out.print("Jumlah Jam : ");
        dummy= dito.nextLine();
        jumlahJam= Integer.parseInt(dummy);
        // System.out.print("Ruangan : ");
        // ruang16= dito.nextLine();
        System.out.println("----------------------------------");
        arrayOfMatakuliah16[i]= new Matakuliah16(kode16, nama16, sks16, jumlahJam);
        // arrayOfMatakuliah16[i].tambahData(ruang16);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("Data MataKuliah ke - "+(i+1));
            System.out.println("Kode : "+ arrayOfMatakuliah16[i].kode16);
            System.out.println("Nama : "+arrayOfMatakuliah16[i].nama16);
            System.out.println("SKS : "+ arrayOfMatakuliah16[i].sks16);
            System.out.println("Jumlah Jam : "+arrayOfMatakuliah16[i].jumlahJam);
            // System.out.println("Ruangan : "+arrayOfMatakuliah16[i].ruang16);
            System.out.println("--------------------------------------------------");
        }
    }
}
