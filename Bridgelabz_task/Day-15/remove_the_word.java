package occurence;

import java.util.*;

import occurence.WordFrequencySimple.Node;

public class remove_the_word {
    static class Node{
    	String word;
    	int count;
    	Node next;
    public Node(String word) {
    	this.word = word;
    	this.count = 1;
    }
    }
    
    static class Hashtable{
    	int size = 5;
    	Node[] table = new Node[size];
    	Node head; 
    	int getindex(String word) {
    		return Math.abs(word.hashCode()) % size;
    	}
    	
    	void add(String word) {
    		int c = getindex(word);
            Node head = table[c];
            Node temp = head;
            while(temp!=null) {
            	if(temp.word.equals(word)) {
            		temp.count++;
            		return;
            	}
            	temp =temp.next;
            }
            Node newnode = new Node(word);
            newnode.next = head;
            table[c] = newnode;
    	}
    	
    	void display() {
            for (int i = 0; i < size; i++) {
                Node temp = table[i];
                while (temp != null) {
                    System.out.println(temp.word + " -> " + temp.count);
                    temp = temp.next;
                }
            }
        }
    	
    	void removed(String word) {
    		int c = getindex(word);
    		Node head = table[c];
    		Node temp =head;
    		if(temp == null) {
    			System.out.print("word not found");
    			return;
    		}
    		if(temp.word.equals(word)) {
    			head.count--;
    			
    			if(head.count == 0) {
    				table[c] = head.next;
    			}
    			head = head.next;
    			return;
    		}
    		
    		Node prev = head;
    		Node curr = head.next;
    		while(curr!=null) {
    			if(curr.word.equals(word)) {
    				curr.count--;
    				if(curr.count == 0) {
    					prev.next = curr.next;
    				}
    				return;
    			}
    			prev = curr;
    			curr = head.next;
    		}
    		System.out.print("word not found");
    	}
    }
    
     public static void main(String[] args) {
    	 String paragraph =
                 "Paranoids are not paranoid because they are paranoid " +
                 "but because they keep putting themselves deliberately " +
                 "into paranoid avoidable situations";
    	 
    	 String[] str = paragraph.toLowerCase().split(" ");
    	 
    	 Hashtable hash = new Hashtable();
    	 for(String s: str) {
    		 hash.add(s);
    	 }
    	 
    	 hash.display();
    	 String remove = "avoidable"; 
    	 hash.removed(remove);
    	 hash.display();
     	
     }}
	