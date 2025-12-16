package stack_queue;

public class peek_pop_uc2 {

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private static Node top;

    public static void push(int value) {
        Node newnode = new Node(value);
        newnode.next = top;
        top = newnode;
    }

    public static void pop() {
        if (top == null) {
            System.out.println("stack is empty");
            return;
        }
        top = top.next;
    }

    public static void peek() {
        if (top != null) {
            System.out.println(top.data);
        } else {
            System.out.println("stack is empty");
        }
    }

    public static void main(String[] args) {

        push(56);
        push(30);
        push(70);

        while (top != null) {
            peek();
            pop();
        }
    }
}
