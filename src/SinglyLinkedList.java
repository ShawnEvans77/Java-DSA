public class SinglyLinkedList {

    private Node head;


    /**
     * A node in a Singly Linked List has data as well as a pointer to the next node.
     */
    private static class Node {
        public Node next;
        public int data;

        public Node(int data) {
            this.data = data;
        }
    }

    /**
     * Creates a Singly Linked List with the head initialized to empty.
     */
    public SinglyLinkedList() {
        head = null;
    }

    /**
     * Adds an element to the start of this Singly Linked List.
     * @param x
     */
    public void addFirst(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    /**
     * Adds an element to the end of this Singly Linked List.
     * @param x
     */
    public void addLast(int x) {
        Node newNode = new Node(x);
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    /**
     * Returns the element at the start of this Singly Linked List. 
     * @return
     */
    public int getFirst() {
        return head.data;
    }

    /**
     * Returns the element at the end of this Singly Linked List.
     * @return
     */
    public int getLast() {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        return temp.data;
    }

    /**
     * Reverses the given Singly Linked List.
     */
    public void reverse() {

        Node prev = null;

        while (head != null) {
            Node after = head.next;
            head.next = prev;
            prev = head;
            head = after;
        }

        head = prev;
    }

    /**
     * Returns the size of this Singly Linked List. 
     * @return An {@code int} representing the number of elements in this Singly Linked List.
     */
    public int size() {
        int size = 0;

        Node temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }

        return size;
    }

    /**
     * Returns a String representation of this Singly Linked List.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node temp = head;

        while (temp != null) {
            result.append(temp.data);
            result.append(temp.next == null ? "" : ", ");

            temp = temp.next;
        }

        result.append("]");
        return result.toString();
    }

}

