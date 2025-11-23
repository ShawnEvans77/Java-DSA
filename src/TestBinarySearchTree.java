public class TestBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Randomly generating a set of numbers to insert into the tree. Uncomment if you want the tree to be huge.
        
        // int numbers = 20;
        // int max = 5000;
        // int min = -5000;

        // for (int i = 0; i < numbers; i++) {
        //     int random = (int) (Math.random() * (max - min + 1)) + min;
        //     tree.insert(random);
        // }

        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);

        tree.inOrderTraversal();
        System.out.println("\n-----------------------------------------------");
        tree.postOrderTraversal();
        System.out.println("\n-----------------------------------------------");
        tree.preOrderTraversal();
        
    }
    
}
