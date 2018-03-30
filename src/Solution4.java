import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution4 {

	public static void main(String args[]) throws Exception {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();
		ArrayList<Integer> arraylist = new ArrayList<Integer>(Collections.nCopies(n, 0));

		for (int i = 0; i < m; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int k = in.nextInt();
			for (int j = a - 1; j <= b - 1; j++)
				arraylist.set(j, arraylist.get(j) + k);
		}

		// System.out.println("n="+n+" m="+m);
		// for(int counter: arraylist){
		// System.out.println(counter);
		// }

		Collections.sort(arraylist);
		System.out.println(arraylist.get(n - 1));
		in.close();
	}

}