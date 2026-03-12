package P5;
import java.util.Scanner;
public class MainSum {
    public static void main(String[] args) {
        Scanner dito= new Scanner (System.in);
        System.out.print("Masukkan Jumlah Elemen: ");
        int elemen= dito.nextInt();

        Sum sm = new Sum(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke- "+(i+1)+": ");
            sm.keuntungan[i]= dito.nextDouble();
        }
        System.out.println("Total keuntungan menggunakan BRUTEFORCE: "+ sm.totalBF());
        System.out.println("Total keuntungan menggunaan DIVIDE and CONQUER: "+ sm.totalDC(sm.keuntungan, 0,elemen-1));
    }
}
