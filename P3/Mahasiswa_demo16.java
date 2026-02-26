package P3;
import java.util.Scanner;
public class Mahasiswa_demo16 {
    public static void main(String[] args) {
        Scanner dito= new Scanner(System.in);
        Mahasiswa16[] arrayofmhs = new Mahasiswa16[3];
        String dummy;
       
        for(int i=0; i<3;i++){
        arrayofmhs[i]= new Mahasiswa16();

        System.out.println("Masukkan data mahasiswa ke- "+ (i+1));
        System.out.print("NIM : ");
        arrayofmhs[i].nim16= dito.nextLine();
        System.out.print("Nama : ");
        arrayofmhs[i].nama16= dito.nextLine();
        System.out.print("Kelas : ");
        arrayofmhs[i].kelas16= dito.nextLine();
        System.out.println("IPK : ");
        dummy= dito.nextLine();
        arrayofmhs[i].ipk16= Float.parseFloat(dummy);
        System.out.println("---------------------------------");
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke- "+ (i+1));
            System.out.println("NIM : "+arrayofmhs[i].nim16);
            System.out.println("Nama : "+ arrayofmhs[i].nama16);
            System.out.println("Kelas : "+ arrayofmhs[i].kelas16);
            System.out.println("IPK : "+arrayofmhs[i].ipk16);
            System.out.println("----------------------------------");
            
        }
    }
}
