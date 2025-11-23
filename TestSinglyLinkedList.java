public class TestSinglyLinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.addFirst(3);
        list.addFirst(5);
        list.addLast(7);
        list.addFirst(100);

        System.out.println(list);

        list.reverse();

        System.out.println(list);
    }
    
}
