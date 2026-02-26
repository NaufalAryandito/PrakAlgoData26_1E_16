package P2;

public class MataKuliah16 {
    String KodeMK16, Nama16;
    int sks16, jumlahJam16;
    
    public MataKuliah16(){

    }
    public MataKuliah16 (String namaMK, String Kodemk, int sks, int jumlahjam){
        Nama16=namaMK;
        KodeMK16=Kodemk;
        sks16=sks;
        jumlahJam16=jumlahjam;
    }
    void tampilkanInformasi(){
        System.out.println("Nama Mata Kuliah: "+ Nama16);
        System.out.println("Kode Mata Kuliah: "+KodeMK16);
        System.out.println("Jumlah SKS: "+sks16);
        System.out.println("Jumlah Jam: "+jumlahJam16);
    }
    void updateSKS (int sksbaru16){
        sks16=sksbaru16;
        System.out.println("SKS berhasil diubah: "+sksbaru16);
    }
    void tambahJam (int Jam){
        jumlahJam16+=Jam;
        System.out.println("Jam berhasil ditambah: "+Jam);
    }
    void Kurangjam (int Jam){
        if (jumlahJam16>=Jam) {
            jumlahJam16-=Jam;
            System.out.println("Jam berhasil dikurangi: "+Jam);
        }else{
            System.out.println("Jam tidak dapat dikurangi");
        }
    }
}
