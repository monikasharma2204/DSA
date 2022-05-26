package Trees;


public class AvlTree 
{
    static class Node 
    {
        int data;
        int height;
        Node left,right;

        Node(int value)
        {
            this.data=value;
            this.height=1;
        }
    }
    // to get  balance factor
     static int findBalancefactor(Node root)
    {
        int left = height(root.left);
        int right= height(root.right);
        return left-right;
    }

    //right rotate
     static Node rightRotation(Node root)
    {
        Node rootleft = root.left;
        Node rootleftRight = root.left.right;

        rootleft.right = root;
        root.left = rootleftRight;

        root.height = height(root);
        rootleft.height = height(rootleft);
        return rootleft;
    }

    //left  rotate
     static Node leftRotation(Node root)
    {
        Node rootRight = root.right;
        Node rootRightleft = root.right.left;

        rootRight.left= root;
        root.right= rootRightleft;

        root.height = height(root);
        rootRight.height = height(rootRight);

        return rootRight;
    }

    //hight
     static int height(Node root)
    {
        if(root==null)
        return 0;
        int left= height(root.left);
        int right=height(root.right);
        return (1+ Math.max(left,right));
    }
    //insrtion  and creation of Avl
     static  Node insert(Node root,int data)
    {
        if(root==null)
        {
            return new Node(data);
        }
        if(data<root.data)
        {
            root.left= insert(root.left,data);
        }
        
        else if(data>root.data)
        {
            root.right=insert(root.right,data);
        }
        root.height=height(root);
        int balancefactor =  findBalancefactor(root);
        
        if(balancefactor< -1 && data >root.right.data)
        {
            return leftRotation(root);
           }
     else if(balancefactor <  -1 && data < root.right.data    )
    {
        root.right = rightRotation(root.right);
        return leftRotation(root);
    }
    else  if(balancefactor > 1 &&  data < root.left.data)
    {
        return rightRotation(root);
    }
    else if(balancefactor >   1 && data <  root.left.data)
    {
        root.left = leftRotation( root.left);
        return rightRotation(root);
    }
      else    
      {
          return root;
      }
    }
    static void inorder(Node root)
    {
        if(root==null)
        return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static void main(String[] args)
    {
       Node root= insert(null,50);
       root = insert(root,60);
       root = insert(root,70);
       root= insert(root,30);
       root = insert(root,35);
       root = insert(root,32);
       inorder(root);

    }
    
}
