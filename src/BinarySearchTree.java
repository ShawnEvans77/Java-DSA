/**
 * The Binary Search Tree is a data structure where given a root, root.left is smaller than root, root.right is bigger than root.
 */
public class BinarySearchTree {

    private TreeNode root;

    private static class TreeNode {
        public int key; 
        public TreeNode left;
        public TreeNode right; 

        public TreeNode(int key) {
            this.key = key;
        }
    }

    /**
     * Creates a Binary Search Tree with the root initialized as {@code null}.
     */
    public BinarySearchTree() {
        root = null;
    }

    /**
     * Insert a value into this Binary Search Tree.
     * @param key The key to be inserted.
     */
    public void insert(int key) {
        root = insert(root, key);
    }

    /**
     * Helper method to allow for inserting a key into the Binary Search Tree using recursion.
     * @param root
     * @param key
     * @return
     */
    public TreeNode insert(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        } 
        
        if (root.key > key)
            root.left = insert(root.left, key);
        else 
            root.right = insert(root.right, key);

        return root;
    }

    /**
     * Return the subtree rooted at the given node.
     * @param key
     * @return
     */
    public TreeNode search(int key) {
        return search(root, key);
    }

    private TreeNode search(TreeNode root, int key) {
        if (root == null || root.key == key)
            return root;

        if (root.key > key)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public void inOrderTraversal() {
        inOrderTraversal(root);  
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    public void preOrderTraversal() {
        preOrderTraversal(root);
    }

    private void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.key + " ");
            inOrderTraversal(root.right);
        }
    }

    private void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.key + " ");
        }
    }

    private void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

}
