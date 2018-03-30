import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 public class Day_25 {

     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int q = scan.nextInt();
         while (q-- > 0) {
             int n = scan.nextInt();
             boolean isPrime = true;
             if (n>1){
                 int limit = (int) Math.sqrt(n);
                 for (int i = 2; i <= limit; i++) {
                     if (n % i == 0) {
                         isPrime = false;
                         break;
                     }
                 }
                 System.out.println(isPrime ? "Prime" : "Not prime");
             }else
                 System.out.println("Not prime");                
         }
     }
 }
