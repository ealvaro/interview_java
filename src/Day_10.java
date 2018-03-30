 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;

 public class Day_10 {

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
        
         char[] binary = Integer.toBinaryString(n).toCharArray();
         int tmpCount = 0;
         int maxCount = 0;
         for(int i = 0; i < binary.length; i++){
             tmpCount = (binary[i] == '0') ? 0 : tmpCount + 1; 
             if(tmpCount > maxCount){
                 maxCount = tmpCount;
             }
         }
         System.out.println(maxCount);
     }
 }
