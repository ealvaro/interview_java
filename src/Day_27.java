import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day_27 {

    Day_27 (int n, int k, int[] a){
        System.out.println(n + " " + k);
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // number of test cases - each test case is two lines
        int testCases = 5; 
        
        System.out.println(testCases);
        new Day_27(4, 3, new int[] {-1, 0, 4, 2});
        new Day_27(5, 2, new int[] {0, -1, 2, 1, 4});
        new Day_27(7, 6, new int[] {2, 0, -1, 1 , 1 , 1, 1});
        new Day_27(3, 1, new int[] {-1, 0, 4});
        new Day_27(6, 4, new int[] {0, -1, 1, 4, 5, 6});
    }
}
// When properly solved, this input:
// 2
// 4 3
// -1 -3 4 2
// 4 2
// 0 -1 2 1
// Produces this output:
// YES
// NO
// For the first test case, k=3. The professor wants at least 3 students in attendance, but only 2 arrive on time (-3 and -1). Thus, the class is canceled.
// For the second test case,k=2 . The professor wants at least 2 students in attendance, and 2 do arrive on time (0 and -1). Thus, the class is not canceled.
