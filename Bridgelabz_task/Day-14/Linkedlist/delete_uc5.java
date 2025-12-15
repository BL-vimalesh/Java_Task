package linkedlist;

public class delete_uc5 {
    private int key;
    private delete_uc5 Node;
    public delete_uc5(int key) {
    	this.key = key;
    	this.Node = null;
    }
	public int getKey() {
		return key;
	}
	public delete_uc5 getNode() {
		return Node;
	}
	public void setNode(delete_uc5 node) {
		Node = node;
	}
	public static void main(String[] args) {
		delete_uc5 list1 = new delete_uc5(56);
		delete_uc5 list2 = new delete_uc5(30);
		delete_uc5 list3 = new delete_uc5(70);
       
		list1.setNode(list2);
		list2.setNode(list3);
		
		list1 = list1.getNode();
		delete_uc5 temp = list1;
		while(temp!=null) {
			System.out.println(temp.getKey());
			temp = temp.getNode();
		}
	}
}
