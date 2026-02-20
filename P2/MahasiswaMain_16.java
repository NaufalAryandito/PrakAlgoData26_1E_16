package P2;

public class MahasiswaMain_16 {
    public static void main(String[] args) {
        Mahasiswa_16 mhs16= new Mahasiswa_16();
        mhs16.nama16="Dito";
        mhs16.kelas16="TI-1E";
        mhs16.nim16="254107020108";
        mhs16.ipk16=3.6; 
        System.out.println("Data Mahasiswa Awal");
        mhs16.tampilkanInformasi();
    mhs16.updateKelas("TI-2E");
    mhs16.updateIPK(3.9);
    System.out.println("Data Mahasiswa Update");
    mhs16.tampilkanInformasi();



}
    

}
