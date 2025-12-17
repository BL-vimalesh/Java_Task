package bst;


public class BinarySearchTree2<K extends Comparable<K>> {

    public class Node {
        K key;
        Node left;
        Node right;

        public Node(K key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

   
    public void add(K key) {
        root = addrec(root, key);
    }

    public Node addrec(Node current, K key) {
        if (current == null) {
            return new Node(key);
        }

        if (key.compareTo(current.key) < 0) {
            current.left = addrec(current.left, key);
        } else if (key.compareTo(current.key) > 0) {
            current.right = addrec(current.right, key);
        }

        return current;
    }

 
    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }

    
    public int size(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + size(node.left) + size(node.right);
    }

   
    public int height(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

    public static void main(String[] args) {

        BinarySearchTree2<Integer> bst = new BinarySearchTree2<>();

        bst.add(56);
        bst.add(30);
        bst.add(70);

        System.out.print("BST Inorder Traversal: ");
        bst.inorder(bst.root);

        System.out.println("\nSize of tree: " + bst.size(bst.root));
        System.out.println("Height of tree: " + bst.height(bst.root));
    }
}


