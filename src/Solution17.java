// Given two integers, l and r, print all the odd numbers between them (l and r inclusive)
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Solution17 {
	
	/*
	 * Complete the function below.
	 */
	
    static int[] oddNumbers(int l, int r) {
        if (l%2 == 0) l++;
        if (r%2 == 0) r--;
        int odds = (r - l) / 2 + 1;
        int[] a = new int[odds];
        for (int i=0; i < odds; i++)
           a[i] = l + 2*i;
        return a;
    }
	
	
    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;
        int _l;
        _l = Integer.parseInt(in.nextLine().trim());
        
        int _r;
        _r = Integer.parseInt(in.nextLine().trim());
        
        res = oddNumbers(_l, _r);
        for(int res_i=0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }
        
        bw.close();
    }	    
}
