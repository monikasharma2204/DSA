package Trees;

public class CountLeafNodes {
    static int count = 0;
    static int n = 0;

    static class Node {
        Node left, right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }
    
    static int full(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.left != null && root.right != null) {
            n++;
        }
        full(root.left);
        full(root.right);

        return n;
    }

    static int leaf(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            count++;
        }

        leaf(root.left);
        leaf(root.right);

        return count;
    }

    static void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + "  ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(10);

        root.left = new Node(20);
        root.right = new Node(30);

        root.left.left = new Node(40);
        root.left.right = new Node(50);

        inorder(root);
        System.out.println();
        // int count = leaf(root);
        // System.out.println(count);

        int n= full(root);

        System.out.println(n);
        
        

    }
}
