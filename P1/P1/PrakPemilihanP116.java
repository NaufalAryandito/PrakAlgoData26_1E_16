package P1;

import java.util.Scanner;

public class PrakPemilihanP116 {
    public static void main(String[] args) {
        Scanner dito16 = new Scanner(System.in);
        int Tugas16, Uts16, Kuis16, Uas16;
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=================================");
        System.out.println("Masukkan Nilai Tugas: ");
        Tugas16 = dito16.nextInt();
        System.out.println("Masukkan Nilai Kuis: ");
        Kuis16 = dito16.nextInt();
        System.out.println("Masukkan Nilai UTS: ");
        Uts16 = dito16.nextInt();
        System.out.println("Masukkan Nilai UAS: ");
        Uas16 = dito16.nextInt();
        System.out.println("====================================");
        System.out.println("=====================================");
        if (Tugas16 > 100 || Tugas16 < 0 || Kuis16 > 100 || Kuis16 < 0 || Uts16 > 100 || Uts16 < 0 || Uas16 > 100
                || Uas16 < 0) {
            System.out.println("Nilai Tidak Valid");
        } else {
            double nilaiAkhir16 = ((0.2 * Tugas16) + (0.2 * Kuis16) + (0.3 * Uts16) + (0.3 * Uas16));
            String huruf16="";
            if (nilaiAkhir16 <= 100 && nilaiAkhir16 > 80) {
                huruf16 = "A";

            }
            if (nilaiAkhir16 <= 80 && nilaiAkhir16 > 73) {
                huruf16 = "B+";
            }
            if (nilaiAkhir16 <= 73 && nilaiAkhir16 > 65) {
                huruf16 = "B";
            }
            if (nilaiAkhir16 <= 65 && nilaiAkhir16 > 60) {
                huruf16 = "C+";
            }
            if (nilaiAkhir16 <= 60 && nilaiAkhir16 > 50) {
                huruf16 = "C";
            }
            if (nilaiAkhir16 <= 50 && nilaiAkhir16 > 39) {
                huruf16 = "D";
            }
            if (nilaiAkhir16 <= 39) {
                huruf16 = "E";
            }
            System.out.println("Nilai Akhir: " + nilaiAkhir16);
            System.out.println("Nilai Huruf: " + huruf16);
            String Kelulusan16="";
            if (huruf16.equalsIgnoreCase("D")||huruf16.equalsIgnoreCase("E")) {
                Kelulusan16="Tidak Lulus";
            }else{
                Kelulusan16="Selamat Anda Lulus";
            }
            System.out.println("============================");
            System.out.println("===============================");
            System.out.println(Kelulusan16);
        }

    }

}