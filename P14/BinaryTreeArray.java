package P14;

public class BinaryTreeArray {
    Mahasiswa16[] dataMahasiswa;
    int idxLast;
    public BinaryTreeArray() {
        this.dataMahasiswa = new Mahasiswa16[10];
        this.idxLast = -1;
    }
    void populateData(Mahasiswa16 dataMhs [], int idxLast) {
        for (int i = 0; i < idxLast; i++) {
            this.dataMahasiswa[i] = dataMhs[i];
        }
        this.idxLast = idxLast;
    }
    void add(Mahasiswa16 data) {
        if (idxLast < dataMahasiswa.length ){
            idxLast++;
            dataMahasiswa[idxLast] = data;
        } else {
            System.out.println(" Tree Array Penuh!");
        }
    }
    
    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 *idxStart + 1);
                System.out.print(dataMahasiswa[idxStart] + " ");
                traverseInOrder(2 *idxStart + 2);
                dataMahasiswa[idxStart] .tampilinformasi();
                traverseInOrder(2 *idxStart + 2);
            }
        }
    }
    void traversePreOrder(int idxStart){
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart] .tampilinformasi();
                traversePreOrder(2 *idxStart + 1);
                traversePreOrder(2 *idxStart + 2);
            }
        }
    }
}