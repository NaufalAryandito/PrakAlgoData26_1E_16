package P5;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner dito = new Scanner (System.in);
        System.out.println("Masukkan jumlah elemen: ");
        int elemen= dito.nextInt();

        Pangkat[] png= new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.println("Masukkan basis elemen ke- "+(i+1)+ ": ");
            int basis = dito.nextInt();
            System.out.println("Masukkan nilai elemen ke- "+(i+1)+ ": ");
            int pangkat= dito.nextInt();
            png[i]= new Pangkat(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTEFORCE: ");
        for (Pangkat p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER: ");
        for (Pangkat p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
