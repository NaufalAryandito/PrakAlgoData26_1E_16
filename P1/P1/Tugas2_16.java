package P1;
import java.util.Scanner;

public class Tugas2_16 {

    public static void jadwal16(String[][] jadwal16, int n, Scanner dito) {

        for (int i = 0; i < n; i++) {
            System.out.println("\njadwal ke-" + (i + 1));

            System.out.print("Nama Mata Kuliah : ");
            jadwal16[i][0] = dito.nextLine();

            System.out.print("Ruang            : ");
            jadwal16[i][1] = dito.nextLine();

            System.out.print("Hari             : ");
            jadwal16[i][2] = dito.nextLine();

            System.out.print("Jam              : ");
            jadwal16[i][3] = dito.nextLine();
        }
    }

    public static void tampilSemua(String[][] jadwal16, int n) {

        System.out.println("\n=== Semua jadwal Kuliah ===");
        System.out.printf("%-25s %-15s %-10s %-15s\n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("=============================================================");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-15s %-10s %-15s\n",
                    jadwal16[i][0],
                    jadwal16[i][1],
                    jadwal16[i][2],
                    jadwal16[i][3]);
        }
    }

    public static void tampilByHari(String[][] jadwal16, int n, String hariCari) {

        System.out.println("\njadwal pada hari " + hariCari + ":");

        for (int i = 0; i < n; i++) {
            if (jadwal16[i][2].equalsIgnoreCase(hariCari)) {
                System.out.println(jadwal16[i][0] + " | " +
                                   jadwal16[i][1] + " | " +
                                   jadwal16[i][3]);
            }
        }
    }

    public static void tampilByMK(String[][] jadwal16, int n, String mkCari) {

        System.out.println("\njadwal untuk Mata Kuliah " + mkCari + ":");

        for (int i = 0; i < n; i++) {
            if (jadwal16[i][0].equalsIgnoreCase(mkCari)) {
                System.out.println("Ruang : " + jadwal16[i][1]);
                System.out.println("Hari  : " + jadwal16[i][2]);
                System.out.println("Jam   : " + jadwal16[i][3]);
            }
        }
    }

   public static void main(String[] args) {

    Scanner dito = new Scanner(System.in);

    System.out.print("Masukkan jumlah jadwal: ");
    int n = Integer.parseInt(dito.nextLine());

    String[][] jadwal16 = new String[n][4];

    jadwal16(jadwal16, n, dito);

    tampilSemua(jadwal16, n);

    System.out.print("\nCari jadwal berdasarkan hari: ");
    String hari = dito.nextLine();
    tampilByHari(jadwal16, n, hari);

    System.out.print("\nCari jadwal berdasarkan nama MK: ");
    String mk = dito.nextLine();
    tampilByMK(jadwal16, n, mk);

    dito.close();

    }
}
