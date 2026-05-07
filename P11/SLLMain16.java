package P11;

import java.util.Scanner;

public class SLLMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList16 sll = new SingleLinkedList16();
        Mahasiswa16 mhs1 = new Mahasiswa16("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa16 mhs2 = new Mahasiswa16("22212202", "Cintia", "3C", 3.5);
        Mahasiswa16 mhs3 = new Mahasiswa16("22212202", "Bimon", "2B", 3.8);
        Mahasiswa16 mhs4 = new Mahasiswa16("21212203", "Dirga", "4D", 3.6);

        System.out.print("Masukkan nama  : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan kelas : ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK   : ");
        double ipk = sc.nextDouble();

        Mahasiswa16 baru = new Mahasiswa16(nim, nama, kelas, ipk);
        sll.addLast(baru);
        sll.print();
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter(mhs4, mhs3);
        sll.InsertAt(2, mhs2);
        sll.print();
    }
}