
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution7 {
	public boolean solution(int[] A) {
		int count = 0;
		int[] B = Arrays.copyOfRange(A, 0, A.length);
		Arrays.sort(B);
		for (int i = 0; i < A.length; i++) {
			if (A[i] != B[i])
				count++;
		}
		return (count == 2 || count == 0);
	}

	public static void main(String[] args) {
		int[] a = { -1, 3, -4, 5, 1, -6, 2, 1 };
		Solution7 s = new Solution7();
		s.solution(a);
	}

}