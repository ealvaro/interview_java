import java.io.*;
import java.util.*;
class Day_23 {
	static void levelOrder(Node root){
        LinkedList<Node> queue = new LinkedList<Node>();
        if(root != null) {
        // enqueue current root
        queue.addLast(root);
        try{
        // while there are nodes to process
        while( queue != null ) {
            // dequeue next node
            Node tree = queue.removeFirst();
            
            System.out.print(tree.data+" ");
            
            // enqueue child elements from next level in order
            if( tree.left != null ) {
                queue.addLast( tree.left );
            }
            if( tree.right != null ) {
                queue.addLast( tree.right );
            }
        }
        }catch(NoSuchElementException nsee){
           
        }
        }
    }
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }   
}    

// 6
// 3
// 5
// 4
// 7
// 2
// 1
