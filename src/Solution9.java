import java.util.*;

class Solution9 {
	int solution(int X, int Y, int[] A) {
		if (!Arrays.asList(A).contains(X) || !Arrays.asList(A).contains(Y)) {
			return 0;
		} else {
			int N = A.length;
			int result = -1;
			int nX = 0;
			int nY = 0;
			for (int i = 0; i < N; i++) {
				if (A[i] == X)
					nX += 1;
				else if (A[i] == Y)
					nY += 1;
				if (nX == nY)
					result = i;
			}
			return result;
		}
	}

	public static void main(String[] args) {
		// int[] a = { 6, 42, 11, 7, 1000000000, 42 };
		int[] a = { 10, 7 };
		Solution9 s = new Solution9();
		System.out.println(s.solution(1000000000, 42, a));
	}
}