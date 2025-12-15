package linkedlist;

public class linkedlistadded_uc2 {
    private int key;
    private linkedlistadded_uc2 Next;
    
    public linkedlistadded_uc2(int key) {
    	this.key = key;
    	this.Next = null;
    }
    
	public int getKey() {
		return key;
	}
	public linkedlistadded_uc2 getNext() {
		return Next;
	}

	public void setNext(linkedlistadded_uc2 next) {
		Next = next;
	}

	public static void main(String[] args) {
		linkedlistadded_uc2 firstlist = new linkedlistadded_uc2(70);
		linkedlistadded_uc2 secondlist = new linkedlistadded_uc2(30);
		linkedlistadded_uc2 thirdlist = new linkedlistadded_uc2(56);
		
		thirdlist.setNext(secondlist);
		secondlist.setNext(firstlist);
		
		linkedlistadded_uc2 temp = thirdlist;
		while (temp != null) {
            System.out.print(temp.getKey());
            if (temp.getNext() != null) System.out.print(" -> ");
            temp = temp.getNext();
        }
	}}

