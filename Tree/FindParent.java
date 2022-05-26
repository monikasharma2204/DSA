package Trees;

public  class FindParent 
{
    static class Node
    {
        int data;
        Node left,right;

        Node(int data)
        {
            this.data = data;
        }
    }
    

      static   Node  findParent( Node  root,int data)
    {
        if(root==null)
        return null;

        if(root.left!=null)
        {
            if(root. left.data == data )
            return root;

        }
        if(root.right!=null)
        {
            if( root.right.data == data)
            return root;
        }

        Node left = findParent(root.left, data);
        Node right = findParent( root.right, data);

        if(left != null)
        return left;
    
        if(right != null)

        return right;
        return null;
    }


         public static void main(String[] args)
         {
             Node  root= new Node(10);
          root.left= new Node(20);
          root.right=new Node(30);
          root.left.left= new Node(40);
          root.left.right = new Node(50);
          root.right.left = new Node(60);
          root.right.right = new Node(70);
          Node ans = findParent(root,70);
          System.out.println(ans.data);
         }
        }
    
