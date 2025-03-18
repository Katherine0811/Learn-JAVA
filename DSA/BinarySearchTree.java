public class BinarySearchTree {

    // Binary Search Tree
    // A tree data structure, where each node is greater than it's left child, but less than it's right child
    // Benefit: Easy to locate a node when they are in this order

    // Time Complexity = Best Case: O(log n)
    //                   Worst Case: O(n)
    // Space Complexity = O(n)

    Node root;

    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        int value = node.value;

        if (root == null) {
            root = node;
            return root;
        } else if (value < root.value) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        return root;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(Node root) {
        if (root != null) {
            displayHelper(root.left);
            System.out.println(root.value);
            displayHelper(root.right);
        }
    }

    public boolean search(int value) {
        return searchHelper(root, value);
    }

    private boolean searchHelper(Node root, int value) {
        if (root == null) {
            return false;
        } else if (root.value == value) {
            return true;
        } else if (root.value > value) {
            return searchHelper(root.left, value);
        } else {
            return searchHelper(root.right, value);
        }
    }

    public void remove(int value) {
        if (search(value)) {
            removeHelper(root, value);
        } else {
            System.out.println(value + "Could not be found.");
        }
    }

    public Node removeHelper(Node root, int value) {
        if (root == null) {
            return root;
        } else if (value < root.value) {
            root.left = removeHelper(root.left, value);
        } else if (value > root.value) {
            root.right = removeHelper(root.right, value);
        } else {
            // Node is found
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.right != null) {
                // Find a successor to replace this node
                root.value = successor(root);
                root.right = removeHelper(root.right, root.value);
            } else {
                // Find a predecessor to replace this node
                root.value = predecessor(root);
                root.left = removeHelper(root.left, root.value);
            }
        }
        return root;
    }

    private int successor(Node root) {
        // Find the least value below the right child of this root node
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.value;
    }

    private int predecessor(Node root) {
        // Find the least value below the right child of this root node
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.value;
    }
}
