package P14;

public class BinaryTree16 {

    Node16 root;

    public BinaryTree16() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Mahasiswa16 mahasiswa) {
        Node16 newNode = new Node16(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node16 current = root;
            Node16 parent;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    boolean find(double ipk) {
        boolean result = false;
        Node16 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreOrder(Node16 node) {
        if (node != null) {
            node.mahasiswa.tampilinformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traverseInOrder(Node16 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilinformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePostOrder(Node16 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilinformasi();
        }
    }

    Node16 getSuccessor(Node16 delNode) {
        Node16 successor = delNode.right;
        Node16 successorParent = delNode;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != delNode.right) {
            successorParent.left = successor.right;
            successor.right = delNode.right;
        }
        return successor;
    }

    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node16 parent = root;
        Node16 current = root;
        boolean isLeftChild = false;
        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else {
                Node16 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                current.mahasiswa.tampilinformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    public void addRekursif(Mahasiswa16 mahasiswa) {
        if (isEmpty()) {
            root = new Node16(mahasiswa);
        } else {
            root = addRekursifHelper(root, mahasiswa);
        }
    }

    private Node16 addRekursifHelper(Node16 current, Mahasiswa16 mahasiswa) {
        if (current == null) {
            return new Node16(mahasiswa);
        }
        if (mahasiswa.ipk < current.mahasiswa.ipk) {
            current.left = addRekursifHelper(current.left, mahasiswa);
        } else if (mahasiswa.ipk > current.mahasiswa.ipk) {
            current.right = addRekursifHelper(current.right, mahasiswa);
        }
        return current;
    }

    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree Kosong");
            return;
        }
        Node16 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK terkecil: ");
        current.mahasiswa.tampilinformasi();
    }

    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree Kosong");
            return;
        }
        Node16 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IPK terbesar: ");
        current.mahasiswa.tampilinformasi();
    }

    public void tampilMahasiswaIPKdiatas(double ipkBatas) {
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas);
        tampilMahasiswaIPKdiatasHelper(root, ipkBatas);
    }

    private void tampilMahasiswaIPKdiatasHelper(Node16 node, double ipkBatas) {
        if (node != null) {
            tampilMahasiswaIPKdiatasHelper(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilinformasi();
            }
            tampilMahasiswaIPKdiatasHelper(node.right, ipkBatas);
        }
    }
}