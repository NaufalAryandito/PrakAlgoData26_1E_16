package P13;

public class Mahasiswa16 {
    String nama, nim, kelas;
    double ipk;

    public Mahasiswa16(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.ipk = ipk;
     }
     public void tampil(){
        System.out.println(
            "NIM : "+nim +
            "\nNama :"+ nama +
            "\nKelas : "+ kelas +
            "\nIPK : " + ipk
        );
     }
    }

