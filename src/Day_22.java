import java.util.*;
import java.io.*;
class Day_22 {
    
    public static int getHeight(Node root){
        if(root==null){
            return -1;
        }
        else{
            int maxLeft = getHeight(root.left) + 1;
            int maxRight = getHeight(root.right) + 1;
            if(maxLeft > maxRight)
                return maxLeft;
            else
                return maxRight;
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
            int height=getHeight(root);
            System.out.println(height);
        }	
}
// 7
// 3
// 5
// 2
// 1
// 4
// 6
// 7
