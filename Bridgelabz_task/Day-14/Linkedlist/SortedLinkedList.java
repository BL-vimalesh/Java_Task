package linkedlist;
public class SortedLinkedList<T extends Comparable<T>> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;

    
    public void add(T value) {
        Node<T> newNode = new Node<>(value);

        
        if (head == null || value.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        
        Node<T> temp = head;
        while (temp.next != null && value.compareTo(temp.next.data) > 0) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

   
    public void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
        System.out.println();
    }

   
    public static void main(String[] args) {

        SortedLinkedList<Integer> list = new SortedLinkedList<>();

        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);

        System.out.println("Sorted Linked List:");
        list.printList();   
    }
}
