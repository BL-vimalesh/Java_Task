package linkedlist;
@org.junit.Test

public class Delete40UC9 {

    private int key;
    private Delete40UC9 next;

    public Delete40UC9(int key) {
        this.key = key;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public Delete40UC9 getNext() {
        return next;
    }

    public void setNext(Delete40UC9 next) {
        this.next = next;
    }

    
    public static Delete40UC9 search(Delete40UC9 head, int value) {
        Delete40UC9 temp = head;
        while (temp != null) {
            if (temp.getKey() == value)
                return temp;
            temp = temp.getNext();
        }
        return null;
    }

    
    public static Delete40UC9 delete(Delete40UC9 head, int value) {

        
        if (head == null)
            return null;

        
        if (head.getKey() == value)
            return head.getNext();

        
        Delete40UC9 temp = head;
        while (temp.getNext() != null) {
            if (temp.getNext().getKey() == value) {
                temp.setNext(temp.getNext().getNext());
                return head;
            }
            temp = temp.getNext();
        }

        return head; 
    }
    public static int size(Delete40UC9 head) {
        int count = 0;
        Delete40UC9 temp = head;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

   
    public static void main(String[] args) {

        Delete40UC9 n1 = new Delete40UC9(56);
        Delete40UC9 n2 = new Delete40UC9(30);
        Delete40UC9 n3 = new Delete40UC9(40);
        Delete40UC9 n4 = new Delete40UC9(70);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        
        n1 = delete(n1, 40);

        
        Delete40UC9 temp = n1;
        while (temp != null) {
            System.out.println(temp.getKey());
            temp = temp.getNext();
        }

        
        System.out.println("Size: " + size(n1));
    }
    public static class Test {

       
        public void testDelete40AndSize() {

            Delete40UC9 n1 = new Delete40UC9(56);
            Delete40UC9 n2 = new Delete40UC9(30);
            Delete40UC9 n3 = new Delete40UC9(40);
            Delete40UC9 n4 = new Delete40UC9(70);

            n1.setNext(n2);
            n2.setNext(n3);
            n3.setNext(n4);

            
            n1 = Delete40UC9.delete(n1, 40);

            
            org.junit.Assert.assertEquals(56, n1.getKey());
            org.junit.Assert.assertEquals(30, n1.getNext().getKey());
            org.junit.Assert.assertEquals(70, n1.getNext().getNext().getKey());
            org.junit.Assert.assertEquals(3, Delete40UC9.size(n1));
        }
    }
}
