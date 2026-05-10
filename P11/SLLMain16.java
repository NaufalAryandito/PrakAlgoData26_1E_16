package P11;

import java.util.Scanner;

public class SLLMain16 {
    public static void main(String[] args) {
        Scanner dito = new Scanner(System.in);
        SingleLinkedList16 sll = new SingleLinkedList16();

        
        Mahasiswa16 mhs1 = new Mahasiswa16("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa16 mhs2 = new Mahasiswa16("22212202", "Cintia", "3C", 3.5);
        Mahasiswa16 mhs3 = new Mahasiswa16("23212201", "Bimon",  "2B", 3.8);
        Mahasiswa16 mhs4 = new Mahasiswa16("21212203", "Dirga",  "4D", 3.6);

        // === Input data dari keyboard ===
        System.out.print("Masukkan nama  : ");
        String nama = dito.nextLine();
        System.out.print("Masukkan NIM   : ");
        String nim = dito.nextLine();
        System.out.print("Masukkan kelas : ");
        String kelas = dito.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = Double.parseDouble(dito.nextLine());
        Mahasiswa16 baru = new Mahasiswa16(nim, nama, kelas, ipk);

        dito.close();


      
        sll.print();

       
        sll.addFirst(mhs4);
        sll.print();

  
        sll.addLast(mhs1);
        sll.print();

  
        sll.insertAfter("Dirga", mhs3);

        
        sll.insertAt(2, mhs2);
        sll.print();

        
        System.out.println("data index 1 :");
        sll.getData(1);
        System.out.println();

        
        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("Bimon"));
        System.out.println();

       
        sll.removeFirst();
        sll.removeLast();
        sll.print();

        
        sll.removeAt(0);
        sll.print();

       
        sll.addLast(baru);
        sll.print();
    }
}