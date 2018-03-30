 import java.io.*;
 import java.util.*;

 public class Day_06 {

     static String skip (String s, int from){
         char[] myCharArray = s.toCharArray();
         String se = "";
         for (int i = from; i < s.length(); i+=2)
             se+=myCharArray[i];
         return se;
     }
     public static void main(String[] args) {
         /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in = new Scanner(System.in);
         int t = in.nextInt();
         for (int i=1;i<=t;i++){
             String s = in.next();
             System.out.println(skip(s,0) + " " + skip(s,1));
         }

     }
 }
