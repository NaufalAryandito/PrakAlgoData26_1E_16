package P2;

public class dosen16 {
    String idDosen16, nama16, bdgahli16;
    int tahunGabung16;
    boolean Status16;

    public dosen16(){

    }
    public dosen16 (String idDosen16, String nama16, int tahunGabung16, boolean status, String bdgahli16){
        this.idDosen16=idDosen16;
        this.nama16=nama16;
        this.tahunGabung16=tahunGabung16;
        status =Status16;
        this. bdgahli16= bdgahli16;
    }
    void tampilInformasi(){
        System.out.println("ID Dosen: "+idDosen16);
        System.out.println("Nama Dosen: "+ nama16);
        System.out.println("Tahun Bergabung: "+tahunGabung16);
        System.out.println("Status: "+Status16);
        System.out.println("Bidang Keahlian: "+ bdgahli16);
    }
    void StatusAktif(boolean status){
      status=Status16;
    }
    int hitMasaKerja(int thnSekarang){
        return thnSekarang-tahunGabung16;
    }
    void ubahKeahlian (String Bidang){
        bdgahli16=Bidang;
    }
}
