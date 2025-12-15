package linkedlist;


public class InsertAfterUC8 {

    private int key;
    private InsertAfterUC8 next;

    public InsertAfterUC8(int key) {
        this.key = key;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public InsertAfterUC8 getNext() {
        return next;
    }

    public void setNext(InsertAfterUC8 next) {
        this.next = next;
    }

    public static InsertAfterUC8 search(InsertAfterUC8 head, int value) {
        InsertAfterUC8 temp = head;
        while (temp != null) {
            if (temp.getKey() == value)
                return temp;
            temp = temp.getNext();
        }
        return null;
    }

   
    public static void insertAfter(InsertAfterUC8 node, InsertAfterUC8 newNode) {
        newNode.setNext(node.getNext());
        node.setNext(newNode);
    }

   
    public static void main(String[] args) {

        InsertAfterUC8 n1 = new InsertAfterUC8(56);
        InsertAfterUC8 n2 = new InsertAfterUC8(30);
        InsertAfterUC8 n3 = new InsertAfterUC8(70);

        n1.setNext(n2);
        n2.setNext(n3);

       
        InsertAfterUC8 node30 = search(n1, 30);

       
        InsertAfterUC8 newNode = new InsertAfterUC8(40);
        insertAfter(node30, newNode);

       
        InsertAfterUC8 temp = n1;
        while (temp != null) {
            System.out.println(temp.getKey());
            temp = temp.getNext();
        }
    }

   
    public static class Test {

        @org.junit.Test
        public void testInsert40After30() {

            InsertAfterUC8 n1 = new InsertAfterUC8(56);
            InsertAfterUC8 n2 = new InsertAfterUC8(30);
            InsertAfterUC8 n3 = new InsertAfterUC8(70);

            n1.setNext(n2);
            n2.setNext(n3);

            
            InsertAfterUC8 node30 = InsertAfterUC8.search(n1, 30);

            
            InsertAfterUC8 newNode = new InsertAfterUC8(40);
            InsertAfterUC8.insertAfter(node30, newNode);

            
          Assert.assertEquals(56, n1.getKey());
          Assert.assertEquals(30, n1.getNext().getKey());
          Assert.assertEquals(40, n1.getNext().getNext().getKey());
          Assert.assertEquals(70, n1.getNext().getNext().getNext().getKey());
        }
    }
}
