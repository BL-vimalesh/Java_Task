package occurence;

public class WordFrequencySimple {
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
	   Node[] array = new Node[size];
	   
	   int getindex(String word) {
		   return Math.abs(word.hashCode()) % size;
	   }
	   void add(String word) {
		   int count2 = getindex(word);
		   Node head = array[count2];
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
		   array[count2] = newnode;
	   }
	   
	   void display() {
		   for(int i=0;i<size;i++) {
			   Node head = array[i];
			   System.out.println(head.word+" -> "+head.count);
			   head = head.next;
		   }
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
    	
    	
    } 
    }

