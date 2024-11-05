class Node {
    int value;
    Node left, right;

    public Node(int value) {
        this.value = value;
        left = right = null;
    }
}
class BinaryTree {
    Node root;

    // Constructor
    public BinaryTree() {
        root = null;
    }

    // Insert a node in the tree
    public void insert(int value) {
        root = insertRec(root, value);
    }

    // Recursive function to insert a new node in the binary tree
    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value < root.value) {
            root.left = insertRec(root.left, value);
        } else if (value > root.value) {
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    // In-order traversal to print the binary tree
    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.value + " ");
            inOrderTraversal(root.right);
        }
    }
}
public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        
        // Insert nodes into the binary tree
        int[] values = {50, 30, 20, 40, 70, 60, 80};
        for (int value : values) {
            tree.insert(value);
        }

        // Print in-order traversal of the binary tree
        System.out.print("In-order traversal: ");
        tree.inOrderTraversal(tree.root);
    }
}

