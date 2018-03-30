/*
 * If the input array is empty consider it as: [0] (array with a zero).
*/
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

class Solution15 {
	
	/*
	 * Complete the function below.
	 */
	
	    static String findNumber(int[] arr, int k) {
	
	        Arrays.sort(arr);
	        int i = 0;
	        while (i < arr.length && arr[i]< k) {
	            i++;
	        }
	        if (i < arr.length && arr[i] == k)
	            return "YES";
	        else
	            return "NO";
	    }
	
	
	    public static void main(String[] args) throws IOException{
	        Scanner in = new Scanner(System.in);
//	        final String fileName = System.getenv("OUTPUT_PATH");
//	        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	        String res;
	        
	        int _arr_size = 0;
	        _arr_size = Integer.parseInt(in.nextLine().trim());
	        int[] _arr = new int[_arr_size];
	        int _arr_item;
	        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
	            _arr_item = Integer.parseInt(in.nextLine().trim());
	            _arr[_arr_i] = _arr_item;
	        }
	        
	        int _k;
	        _k = Integer.parseInt(in.nextLine().trim());
	        
	        res = findNumber(_arr, _k);
	        System.out.println(res);
//	        bw.write(res);
//	        bw.newLine();
//	        
//	        bw.close();
	    }

}
