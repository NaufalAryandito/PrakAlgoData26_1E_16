package P14;
public class BinaryTreeMain16 {
    public static void main(String[] args) {
        BinaryTree16 bst = new BinaryTree16();
        bst.add(new Mahasiswa16("Ali", "A","244160121",3.57));
        bst.add(new Mahasiswa16("Badar", "B","244160221",3.85));
        bst.add(new Mahasiswa16("Candra", "C","244160185",3.21));
        bst.add(new Mahasiswa16("Dewi", "B","244160220",3.54));

        System.out.println("\n Daftar semua mahasiswa (In order traversal):");
        bst.traverseInOrder(bst.root);
        
        System.out.println("\n Pencarian data mahasiswa : ");
        System.out.print(" Cari mahasiswa dengan IPK 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak Ditemukan";
        System.out.println(hasilCari);

        System.out.print(" Cari mahasiswa dengan IPK 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak Ditemukan";
        System.out.println(hasilCari);

        bst.add(new Mahasiswa16("Devi", "A", "244160131",3.72));
        bst.add(new Mahasiswa16("Ehsan", "D","244160205",3.37));
        bst.add(new Mahasiswa16("Fizi", "B","244160170",3.46));
        System.out.println("\n Daftar semua mahasiswa setelah penambahan 3 mahasiswa : ");
        System.out.println("\n InOrder Traversal : ");
        bst.traverseInOrder(bst.root);
        System.out.println("\n PreOrder Traversal : ");
        bst.traversePreOrder(bst.root);
        System.out.println("\n PostOrder Traversal : ");
        bst.traversePostOrder(bst.root);
        
    }

}