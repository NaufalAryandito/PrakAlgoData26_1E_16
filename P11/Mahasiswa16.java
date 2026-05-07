package P11;

public class Mahasiswa16 {
    String nama, nim, kelas;
    double ipk;

    Mahasiswa16(){

    }

    Mahasiswa16(String nm, String name, String kls, double ip){
        nama = name;
        this.nim = nim;
        kelas = kls;
        ipk = ip;
    }
    public void tampilanInformasi(){
      System.out.printf("%-10s %-10s %-5s %.1f%n", nama, nim, kelas, ipk);
    }
}