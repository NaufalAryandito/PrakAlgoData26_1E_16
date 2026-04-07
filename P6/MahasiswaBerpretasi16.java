package P6;

public class MahasiswaBerpretasi16 {
    Mahasiswa16[] listMhs = new Mahasiswa16[5];
    int idx;

void tambah (Mahasiswa16 m){
    if (idx<listMhs.length){
        listMhs[idx]=m;
        idx++;
    }else{
        System.out.println("data sudah penuh");
    }
}
    void tampil (){
        for (Mahasiswa16 m : listMhs) {
            m.tampilnformasi();
            System.out.println("-------------------------");
        }
    }
    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa16 tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }

}
