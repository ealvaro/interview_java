 import java.io.*;
 import java.util.*;
 import java.text.*;
 import java.math.*;
 import java.util.regex.*;

 public class Day_11 {

     static int hourGlass(int topI,int topJ, int[][] arr){
         int total = 0;
         for(int i=topI; i < topI+3; i++){
             for(int j=topJ; j < topJ+3; j++){
                 total += arr[i][j];
             }
         }
         total -= arr[topI+1][topJ];
         total -= arr[topI+1][topJ+2];
         return total;
     }
    
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int arr[][] = new int[6][6];
         for(int i=0; i < 6; i++){
             for(int j=0; j < 6; j++){
                 arr[i][j] = in.nextInt();
                 //System.out.print(arr[i][j]);
             }
             //System.out.println();
         }
         int hg = 0;
         int max = -63;
         for(int i=0; i < 4; i++){
             for(int j=0; j < 4; j++){
                 hg = hourGlass(i,j,arr);
                 if (max < hg) max = hg;
                 //System.out.print(hg);
             }        
             //System.out.println();
         }
         System.out.println(max);
     }
 }
//1 1 1 0 0 0
//0 1 0 0 0 0
//1 1 1 0 0 0
//0 0 2 4 4 0
//0 0 0 2 0 0
//0 0 1 2 4 0
