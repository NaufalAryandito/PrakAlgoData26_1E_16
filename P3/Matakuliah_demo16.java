package P3;
import java.util.Scanner;
public class Matakuliah_demo16 {
    public static void main(String[] args) {
        Scanner dito= new Scanner (System.in);
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jmlMatkul16 = dito.nextInt();
        dito.nextLine();
        Matakuliah16[] arrayOfMatakuliah16 = new Matakuliah16[jmlMatkul16];
        String kode16, nama16, dummy, ruang16;
        int sks16, jumlahJam ;

        for (int i = 0; i < arrayOfMatakuliah16.length; i++) {
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
        System.out.print("Ruangan : ");
        ruang16= dito.nextLine();
        System.out.println("----------------------------------");
        arrayOfMatakuliah16[i]= new Matakuliah16(kode16, nama16, sks16, jumlahJam);
        arrayOfMatakuliah16[i].tambahData(ruang16);
        }
        for (int i = 0; i < arrayOfMatakuliah16.length; i++) {
            System.out.println("Data MataKuliah ke - "+(i+1));
            arrayOfMatakuliah16[i].cetakinfo();
            System.out.println("--------------------------------------------------");
        }
    }
}
