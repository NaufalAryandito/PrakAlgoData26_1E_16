package P14;

public class BinaryTreeArrayMain16 {
    public static void main(String[] args) {
    BinaryTreeArray bta = new BinaryTreeArray();
    Mahasiswa16 mhs1 = new Mahasiswa16("Ali", "A", "244160121", 3.57); 
    Mahasiswa16 mhs2 = new Mahasiswa16("Candra", "C", "244160185", 3.41);
    Mahasiswa16 mhs3 = new Mahasiswa16("Badar", "B", "244160221", 3.75);
    Mahasiswa16 mhs4 = new Mahasiswa16("Dewi", "B", "244160220", 3.35);
    
    Mahasiswa16 mhs5 = new Mahasiswa16("Devi", "A", "244160131", 3.48);
    Mahasiswa16 mhs6 = new Mahasiswa16("Ehsan", "D", "244160205", 3.61);
    Mahasiswa16 mhs7 = new Mahasiswa16("Fizi", "B", "244160170", 3.86);
    
    Mahasiswa16[] dataMhs = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7};
    int idxLast = 6;
    bta.populateData(dataMhs, idxLast);
    System.out.println("\nINorder Traversal Mahasiswa : ");
    bta.traverseInOrder(0);
}
}
