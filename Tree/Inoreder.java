package Trees;

public class Inoreder {

    static class Node {
        Node left, right;
        int data;

        Node (int data){
            this.data = data ;
        }
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }
       
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

    }
}
