package Trees;

public class PrintRootToLeafPath
 {
     static class Node
     {
         int data;
         Node left,right;
         Node(int data)
         {
             this.data=data;
         }
     }
     static void print(Node root, int arr[] ,int index)
     {
         if(root==null)
         {
             return;
         }
         if(root.left== null && root.right ==null)
         {
             arr[index]= root.data;
             for(int i =0; i<=index; i++){
                 System.out.print(arr[i]+" ");
             }
             System.out.println();
             return;
         }
         arr[index] =root.data;
         print(root.left,arr,index+1);
         print(root.right,arr,index+1);
     }
    

    public static void main(String[] args)
         {
            int arr[] = new int[10];
            Node  root= new Node(10);
         root.left= new Node(20);
          root.right=new Node(30);
          root.left.left= new Node(40);
          root.left.right = new Node(50);
          root.right.left = new Node(60);
          root.right.right = new Node(70);
          print(root,arr,0);
          
         }
        }
    
