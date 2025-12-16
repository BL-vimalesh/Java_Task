package occurence;

public class WordFrequency {
	static class Node{
		String word;
		int count;
		Node next;
	public Node(String word) {
		this.word = word;
		this.count = 1;
		this.next = null;
	}}
     	static Node head;
		static void addword(String word) {
			Node temp = head;
			while(temp!=null) {
				if(temp.word.equals(word)) {
					temp.count++;
					return;
				}
				temp = temp.next;
			}
			Node newnode = new Node(word);
			newnode.next = head;
			head = newnode;
		}
		
		 void display() {
			Node temp = head;
			while(temp!=null) {
				System.out.println(temp.word+" -> "+ temp.count);
				temp = temp.next;
			}
		}
    public static void main(String[] args) {

        String str = "to be or not to be";
        String[] word = str.toLowerCase().split(" ");
        
        WordFrequency list = new WordFrequency();
        
        for(String words: word) {
        	list.addword(words);
        }
        list.display();
    }
    }
