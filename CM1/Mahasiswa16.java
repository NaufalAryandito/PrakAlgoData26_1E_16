package CM1;
public class Mahasiswa16{
    public static final String nim = null;
    String nim16, nama16, prodi16;

    Mahasiswa16(String nim16, String nama16, String prodi16){
        this.nim16=nim16;
        this.nama16=nama16;
        this.prodi16=prodi16;
    }
    void tampilMahasiswa(){
        System.out.println("NIM "+nim16+"| Nama "+nama16+"| Prodi: "+prodi16);
    }
}