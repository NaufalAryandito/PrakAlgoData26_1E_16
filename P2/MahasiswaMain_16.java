package P2;

public class MahasiswaMain_16 {
    public static void main(String[] args) {
        Mahasiswa_16 mhs16 = new Mahasiswa_16();
        mhs16.nama16 = "Muhammad Naufal Aryandito A.";
        mhs16.kelas16 = "TI-1E";
        mhs16.nim16 = "254107020108";
        mhs16.ipk16 = 3.6;
       
        mhs16.tampilkanInformasi();
        mhs16.updateKelas("TI-2E");
        mhs16.updateIPK(3.9);
        mhs16.tampilkanInformasi();

        Mahasiswa_16 mhs2= new Mahasiswa_16("Annisa Nabila", "2141720160", 3.25, "TI-2L" );
            mhs2.updateIPK(3.30);
            mhs2.tampilkanInformasi();
        Mahasiswa_16 mhsDito = new Mahasiswa_16("Budi Speed","221345678", 4.0, "SIB-3E");
            mhsDito.updateIPK(3.95);
            mhsDito.tampilkanInformasi();

    }

}
