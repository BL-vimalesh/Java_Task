package stack_queue;



public class remove_back {
    private static class Node{
    	int data;
    	Node next;
    	public Node(int data) {
    		this.data = data;
    	}
    }
    private static Node front;
    private static Node rear;
    
    public static void push(int value) {
    	Node newnode = new Node(value);
    	if(rear == null) {
    		rear = front=newnode;
    	}
    	rear.next = newnode;
    	rear = newnode;
    }
    
    //pop from the front
    public static void pop() {
    	if(front == null) {
    		System.out.print("queue is empty");
    	}
    	front = front.next;
    	if(front == null) {
    		rear = null;
    	}
    }
    public static void pop_back() {
    	if(rear == null) {
    		System.out.print("queue is empty");
    	}else if(front==rear) {
    		front=rear=null;
    	}
    	
    	Node temp = front;
    	
    	while(temp.next!=rear) {
    		temp = temp.next;
    	}
    	rear = temp;
    	rear.next = null;
    }
    
    public static void display() {
    	Node temp = front;
    	while(temp!=null) {
    		System.out.println(temp.data);
    		temp = temp.next;
    	}
    }
    
    public static void main(String[] args) {
    	remove_back queue = new remove_back();
    	queue.push(56);
    	queue.push(30);
    	queue.push(70);
        queue.pop();
        queue.pop_back();
    	queue.display();
    }
}
