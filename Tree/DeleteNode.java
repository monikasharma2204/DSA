package Trees;

public class DeleteNode
 {
      static class Node 
      {
          int data;
          Node left ,right;
          Node(int value)
          {
              this.data= value;
              this.left= this.right= null;
          }
    }
    static void preorder(Node root)
    {
        if( root == null)
        return;

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }


    static Node delete(Node root, int value)
    {
        if(root==null)
        {
            return root;
        }
        if(value<root.data)
        {
            root.left= delete(root.left,value);
        }
        else if(value> root.data)
        {
            root.right= delete( root.right, value);
        }
        else     
        {
            if( root.left==null)
            return root.right;
            
            if(root.right==null)
            return root.left;    
        
            else 
            {
                root.data= smallvalue(root.right);
                root.right= delete(root.right,root.data);

            }
        }
        return root;
    }

    static int smallvalue( Node root)
    {
        Node temp = root;
        while(temp.left!= null)
        {
            temp= temp.left;
        }
        return temp.data;
    }

    static Node insert(Node root,int value)
    {
        if(root==null)
        {
            Node temp= new Node(value);
            return temp;
        }
        if(root.data>value)
        {
            root.left= insert(root.left,value);
        }
        else     
        {
            root.right= insert(root.right,value);
        }
        return root;
    }

    public static void main(String[] args)
    {
        Node root= insert(null,40);
           root= insert(root,30);
           root= insert(root,47);
           root=insert(root,100);
           root=insert(root,45);
           preorder(root);

           System.out.println();
           root= delete(root, 47);
           preorder(root);


    }

}
