package stack_queue;
public class SimpleStack { 
	
	private static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	private Node top;
	
	public void push(int value) {
		Node newNode = new Node(value);
		newNode.next = top;
		top = newNode;
	}
	public void print() {
		Node temp = top;
		while(temp!=null) {
			System.out.print(temp.data);
			if(temp.next!=null) {
				temp=temp.next;
			}
		}
	}

   
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack();      
        stack.push(70);
        stack.push(30);
        stack.push(56);       
        System.out.println("Stack (Top to Bottom):");
        stack.print();
    }
}

