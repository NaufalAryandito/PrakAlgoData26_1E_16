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
        Node16 successor=delNode.right;
        Node16 successorParent=delNode;
        while(successor.left!=null){
            successorParent=successor;
            successor=successor.left;
        }
        if(successor!=delNode.right){
            successorParent.left=successor.right;
            successor.right=delNode.right;
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
}else {
    if (current.left==null && current.right==null) {
        if (current == root) {
            root = null;
        } else {
            if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        }else if (current.left==null) {
            if (current == root) {
                root = current.right;
            } else {
                if (isLeftChild) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
            } 
        }else if (current.right==null) {
            if (current == root) {
                root = current.left;
            } else {
                if (isLeftChild) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            }
        }else {
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
}
