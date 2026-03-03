package P3;
import java.util.Scanner;
public class dosenMain16 {
    public static void main(String[] args) {
        Scanner dito= new Scanner(System.in);
        System.out.println("Masukkan jumlah dosen: ");
        int jmlDosen= dito.nextInt();
        dito.nextLine();
        dosen16[] arrayofdosen= new dosen16[jmlDosen];

        for (int i = 0; i < arrayofdosen.length; i++) {
            System.out.println("Masukkan data dosen ke- "+(i+1));
            System.out.print("Kode: ");
            String kode=dito.nextLine();
            System.out.print("Nama: ");
            String nama= dito.nextLine();
            System.out.print("Jenis Kelamin (true= laki-laki, false= perempuan): ");
            boolean jenisKelamin= dito.nextBoolean();
            System.out.print("Usia: ");
            int usia= dito.nextInt();
            dito.nextLine();
            arrayofdosen[i]= new dosen16(kode, nama, jenisKelamin, usia);
            
        }
        System.out.println("== DATA DOSEN ==");
        for ( dosen16 dsn : arrayofdosen) {
            dsn.tampilDosen();
        }
        dataDosen16.datasemuadosen(arrayofdosen);
        dataDosen16.jumlahDosenperjeniskelamin(arrayofdosen);
        dataDosen16.rerataUsiaDosenPerJenisKelamin(arrayofdosen);
        dataDosen16.infoDosenPalingTua(arrayofdosen);
        dataDosen16.infoDosenPalingMuda(arrayofdosen);
    }
}
