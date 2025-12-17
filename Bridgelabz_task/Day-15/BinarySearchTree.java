package bst;

public class BinarySearchTree<K extends Comparable<K>> {

	public class Node{
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
    
    public static void main(String[] args) {

        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        
        bst.add(56);  
        bst.add(30);  
        bst.add(70);
        
        
        System.out.print("BST Inorder Traversal: ");
        bst.inorder(bst.root);
    }
}
