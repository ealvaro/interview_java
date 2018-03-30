
// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.

class Solution8 {

	public int solution(String S) {
		String[] ops = S.split(" ");
		// System.out.println("ops = "+ops[0]);
		Stack<Integer> st = new Stack<Integer>();
		try {
			for (int i = 0; i < ops.length; i++) {
				char first = ops[i].charAt(0);
				switch (first) {
				case 'D':
					st.push(st.peek());
					break;
				case 'P':
					st.pop();
					break;
				case '+':
					st.push(st.pop() + st.pop());
					break;
				case '-':
					st.push(st.pop() - st.pop());
					break;
				default:
					st.push(Integer.valueOf(ops[i]));
					break;
				}
			}
		} catch (IndexOutOfBoundsException e) {
			return -1;
		} catch (EmptyStackException e) {
			return -1;
		}

		return st.peek();
	}

	public static void main(String[] args) {
		String ops = "13 DUP 4 POP 5 DUP + DUP + -";
		Solution8 s = new Solution8();
		s.solution(ops);
	}

}