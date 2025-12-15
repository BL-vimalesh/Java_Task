package linkedlist;


public class SearchLinkedList {

    private int key;
    private SearchLinkedList next;

    public SearchLinkedList(int key) {
        this.key = key;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public SearchLinkedList getNext() {
        return next;
    }

    public void setNext(SearchLinkedList next) {
        this.next = next;
    }

    
    public static SearchLinkedList search(SearchLinkedList head, int value) {
        SearchLinkedList temp = head;

        while (temp != null) {
            if (temp.getKey() == value) {
                return temp;   // found
            }
            temp = temp.getNext();
        }
        return null; // not found
    }

    public static void main(String[] args) {

        SearchLinkedList n1 = new SearchLinkedList(56);
        SearchLinkedList n2 = new SearchLinkedList(30);
        SearchLinkedList n3 = new SearchLinkedList(70);

        n1.setNext(n2);
        n2.setNext(n3);

        SearchLinkedList result = search(n1, 30);

        if (result != null)
            System.out.println("Found: " + result.getKey());
        else
            System.out.println("Not Found");
    }
}

