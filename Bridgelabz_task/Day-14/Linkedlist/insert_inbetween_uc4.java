package linkedlist;

public class insert_inbetween_uc4 {
    private int key;
    private insert_inbetween_uc4 Node;
    
    public insert_inbetween_uc4(int key) {
    	this.key = key;
    	this.Node = null;
    }
    
	public int getKey() {
		return key;
	}

	public insert_inbetween_uc4 getNode() {
		return Node;
	}

	public void setNode(insert_inbetween_uc4 node) {
		Node = node;
	}

	public static void main(String[] args) {
		insert_inbetween_uc4 list1 = new insert_inbetween_uc4(56);
		insert_inbetween_uc4 list2 =  new insert_inbetween_uc4(70);
		insert_inbetween_uc4 between =  new insert_inbetween_uc4(30);
		list1.setNode(list2);
		
		list1.setNode(between);
		between.setNode(list2);
		insert_inbetween_uc4 temp = list1;
		while(temp!=null) {
			System.out.println(temp.getKey());
			temp = temp.getNode();
		}}}