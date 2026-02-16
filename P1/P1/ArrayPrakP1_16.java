package P1;
import java.util.Scanner;
public class ArrayPrakP1_16 {
    public static void main(String[] args) {
      Scanner dito= new Scanner(System.in);
         String[] mk12 = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks12 = { 2, 2, 2, 3, 2, 3, 2, 2 };

        double[] nilaiangka12 = new double[mk12.length];
        String[] nilaihuruf12 = new String[mk12.length];
        double[] nilaisetara12 = new double[mk12.length];

        double totalbobot12 = 0;
        int totalsks12 = 0;

        System.out.println("Program Menghitung IP Semester\n");

        for (int i = 0; i < mk12.length; i++) {
            System.out.print("Masukkan nilai Angka untuk mk12 " + mk12[i] + ": ");
            nilaiangka12[i] = dito.nextDouble();

            if (nilaiangka12[i] > 80) {
                nilaihuruf12[i] = "A";
                nilaisetara12[i] = 4.0;
            } else if (nilaiangka12[i] > 73) {
                nilaihuruf12[i] = "B+";
                nilaisetara12[i] = 3.5;
            } else if (nilaiangka12[i] > 65) {
                nilaihuruf12[i] = "B";
                nilaisetara12[i] = 3.0;
            } else if (nilaiangka12[i] > 60) {
                nilaihuruf12[i] = "C+";
                nilaisetara12[i] = 2.5;
            } else if (nilaiangka12[i] > 50) {
                nilaihuruf12[i] = "C";
                nilaisetara12[i] = 2.0;
            } else if (nilaiangka12[i] > 39) {
                nilaihuruf12[i] = "D";
                nilaisetara12[i] = 1.0;
            } else {
                nilaihuruf12[i] = "E";
                nilaisetara12[i] = 0.0;
            }

            totalbobot12 += nilaisetara12[i] * sks12[i];
            totalsks12 += sks12[i];
        }

        double ip12 = totalbobot12 / totalsks12;
        System.out.println("===============================");
        System.out.println("\nHasil Konversi Nilai");
        System.out.println("===============================");
        System.out.printf("%-40s %-12s %-12s %-10s\n",
                "mk12", "Nilai Angka", "Nilai Huruf", "Bobot");

        for (int i = 0; i < mk12.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-10.2f\n",
                    mk12[i], nilaiangka12[i], nilaihuruf12[i], nilaisetara12[i]);
        }

        System.out.println("===============================");
        System.out.printf("IP : %.2f\n", ip12);
        dito.close();
}
}