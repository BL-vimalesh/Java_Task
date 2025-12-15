package linkedlist;

public class linkedlist {
   private int key;
   private linkedlist next;
   public linkedlist(int key) {
	   this.key = key;
	   this.next = null;
   }
   public int getkey() {
		return key;
	}
   	
	public linkedlist getNext() {
	return next;
}

   public void setNext(linkedlist next) {
	this.next = next;
   }

	public static void main(String[] args) {
		linkedlist list = new linkedlist(56);
		linkedlist list2 = new linkedlist(30);
		linkedlist list3 = new linkedlist(70);
		
		list.setNext(list2);
		list2.setNext(list3);
		
		linkedlist temp = list;
		while(temp!=null) {
			System.out.println(temp.getkey());
			temp = temp.getNext();
		}
	}
}
