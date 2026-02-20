package P2;
public class Mahasiswa_16 {
    
        String nama16, nim16, kelas16;
        double ipk16;
        
    void tampilkanInformasi(){
        System.out.println("nama: "+nama16);
        System.out.println("Nim: "+nim16);
        System.out.println("IPK: "+ipk16);
        System.out.println("Kelas: "+kelas16);
    }
    void updateKelas(String Kelasbaru){
        kelas16=Kelasbaru;
    }
    void updateIPK(double ipkbaru){
    ipk16=ipkbaru;
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