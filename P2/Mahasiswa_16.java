package P2;
public class Mahasiswa_16 {
    
        String nama16, nim16, kelas16;
        double ipk16;

        public Mahasiswa_16() {
        
    }

    public Mahasiswa_16(String nm16, String nim16, double ipk16,  String kls16) {
        nama16 = nm16;
        this.nim16 = nim16;
        this.ipk16 = ipk16;
        kelas16 = kls16;
    }
      
    void tampilkanInformasi(){
        System.out.println("Nama: "+nama16);
        System.out.println("Nim: "+nim16);
        System.out.println("IPK: "+ipk16);
        System.out.println("Kelas: "+kelas16);
    }
    void updateKelas(String Kelasbaru){
        kelas16=Kelasbaru;
    }
    void updateIPK(double ipkbaru){
    if (ipk16>=0.0 && ipk16<=4.0) {
        
        ipk16=ipkbaru;
    }else
        System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
    }
    String nilaiKinerja(){
        if (ipk16>3.5) {
            return "Kinerja Sangat Baik";
        }else if (ipk16>3.0) {
            return "Kinerja Baik";
        }else if (ipk16>2.0) {
            return "Kinerja Cukup";
        }else{
            return "Kinerja Kurang";
        }
    }
   

}