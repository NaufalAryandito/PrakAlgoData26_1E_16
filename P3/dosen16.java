package P3;

public class dosen16 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public dosen16(String kode, String nama, boolean jenisKelamin, int usia){
       this.kode=kode;
       this.nama=nama;
       this.jenisKelamin=jenisKelamin;
       this.usia=usia;
    }
   
    
    public void tampilDosen(){
        System.out.println("Kode: "+kode);
        System.out.println("Nama: "+nama);
        if (jenisKelamin==true) {
            System.out.println("Jenis Kelamin: Laki-Laki");
        }else
            System.out.println("Jenis Kelamin: Perempuan");
        System.out.println("Usia: "+usia);
        System.out.println("----------------------------------");
    }
}
