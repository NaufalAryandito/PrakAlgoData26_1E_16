package P3;

public class Mahasiswa_demo16 {
    public static void main(String[] args) {
        Mahasiswa16[] arrayofmhs = new Mahasiswa16[3];
        arrayofmhs[0]= new Mahasiswa16();
        arrayofmhs[0].nim16= "244107060033";
        arrayofmhs[0].nama16="Agnes Titania Kinanti";
        arrayofmhs[0].kelas16="SIB-1E";
        arrayofmhs[0].ipk16= (float) 3.75;

        arrayofmhs[1]= new Mahasiswa16();
        arrayofmhs[1].nim16= "2341720172";
        arrayofmhs[1].nama16= "Achmad Maulana Hamzah";
        arrayofmhs[1].kelas16= "TI-2A";
        arrayofmhs[1].ipk16= (float) 3.36;

        arrayofmhs[2]= new Mahasiswa16();
        arrayofmhs[2].nim16= "244107023006";
        arrayofmhs[2].nama16= "Dirhamawan Putranto";
        arrayofmhs[2].kelas16= "TI-2E";
        arrayofmhs[2].ipk16=(float) 3.80;

        System.out.println("NIM : "+arrayofmhs[0].nim16);
        System.out.println("Nama : "+ arrayofmhs[0].nama16);
        System.out.println("Kelas : "+ arrayofmhs[0].kelas16);
        System.out.println("IPK : "+arrayofmhs[0].ipk16);
        System.out.println("----------------------------------");
        System.out.println("NIM : "+arrayofmhs[1].nim16);
        System.out.println("Nama : "+ arrayofmhs[1].nama16 );
        System.out.println("Kelas : "+arrayofmhs[1].kelas16);
        System.out.println("IPK : "+arrayofmhs[1].ipk16);
        System.out.println("-----------------------------------");
        System.out.println("NIM : "+arrayofmhs[2].nim16);
        System.out.println("Nama : "+arrayofmhs[2].nama16);
        System.out.println("Kelas : "+arrayofmhs[2].kelas16);
        System.out.println("IPK : "+arrayofmhs[2].ipk16);
        System.out.println("-----------------------------------");
    }
}
