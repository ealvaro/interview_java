import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
       data.data = d;
        next = null;
    }
}

public class Day_15 {
  public static  Node insert(Node head,int data) {
        Node copy = head;
        Node newN = new Node(data);
        if (head == null) head = newN;
        else {
            while (copy.next != null) copy = copy.next;
           copy.next = newN;
        }
        return head;
    }
    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data.data + " ");
            start = start.next;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();
        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}
//4
//2
//3
//4
//1
