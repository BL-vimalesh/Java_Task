package bst;

import bst.BinarySearchTree.Node;

public class BinarySearchnumber<K extends Comparable<K>> {

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
	
	public boolean findKey(K key) {
	    return findrec(root, key);
	}

	private boolean findrec(Node current, K key) {

	    
	    if (current == null) {
	        return false;
	    }

	    
	    if (key.compareTo(current.key) == 0) {
	        return true;
	    }

	    
	    if (key.compareTo(current.key) < 0) {
	        return findrec(current.left, key);
	    }

	    
	    return findrec(current.right, key);
	}

    
    public static void main(String[] args) {

    	BinarySearchnumber<Integer> bst = new BinarySearchnumber<>();

        
        bst.add(56);  
        bst.add(30);  
        bst.add(70);
        bst.add(63);
        
        
        System.out.print("BST Inorder Traversal: ");
        bst.inorder(bst.root);
        
        if (bst.findKey(63)) {
            System.out.println("Key found");
        } else {
            System.out.println("Key not found");
        }

    }
}

