
//Braces in a string are considered to be balanced if the following criteria are met:
//For every opening brace (i.e.: (, {, or [), there is a matching closing brace (i.e.: ), }, or ]) of the same type (i.e.: ( matches ), { matches }, and [ matches ]). An opening brace must appear before (to the left of) its matching closing brace (e.g.: ]{}[ is not balanced).
//No unmatched braces lie between some pair of matched braces. For example, ({[]}) is balanced, but {[}] and [{)] are not balanced.
// 
//Complete the Braces function in your editor. It should take an array of strings named values as a parameter, determine if all its braces are balanced, and then return an array of strings where each element indicates whether or not the element in the corresponding index of values was balanced. If the string in values[i] (where 0 ≤ i ≤ |values| - 1) has balanced braces, then index i in the return array should contain the string YES; otherwise, index i in the return array should contain the string NO.
// 
//Input Format
//Input from stdin is handled by the locked stub code in your editor. The first line contains N, the length of values. Each line i of the N subsequent lines describes values[i].
// 
//Constraints
//1 ≤ |values| ≤ 15
//1 ≤ |values[i]| ≤ 100, where 0 ≤ i ≤ |values|
// 
//Output Format
//Printing the contents of your returned array to stdout is handled by the locked stub code in your editor. Each line i of the N lines of output denotes whether or not the string in values[i] was balanced.
// 
//Sample Input
//values = { "{}[]()", "{[}]}" }
// 
//Sample Output
//return = { "YES", "NO" }
// 
//Explanation
//values[0]: {}[]() meets the criterion for a balanced string, so index 0 in our return array should contain the string YES.
//values[1]: {[}] contains unmatched braces between a matched pair (in the substrings [}, {[}, and [}]), so index 1 in our return array should contain the string NO.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution11 {

	static String matching(String c) {
		char first = c.charAt(0);
		switch (first) {
		case '(':
			return ")";
		case '{':
			return "}";
		case '[':
			return "]";
		default:
			return "";
		}

	}

	static boolean balanced(String str) {
		if (str.length() == 0) {
			return true;
		}
		if (str.length() % 2 != 0) {
			return false;
		} else {
			String between;
			String c = str.substring(0, 1);
			String rest = str.substring(1);
			int next = rest.lastIndexOf(matching(c));
			if (next != 0) {
				between = rest.substring(0, next);
				rest = rest.substring(next + 1);
				return balanced(between) && balanced(rest);
			} else {
				return balanced(rest.substring(1));
			}
		}
	}

	/*
	 * Complete the function below.
	 */

	static String[] Braces(String[] values) {
		String[] returns = new String[values.length];
		for (int res_i = 0; res_i < values.length; res_i++) {
			if (balanced(values[res_i])) {
				returns[res_i] = "YES";
			} else {
				returns[res_i] = "NO";
			}
		}
		return returns;
	}

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		// Map<String, String> env = System.getenv();
		// for (String envName : env.keySet()) {
		// System.out.format("%s=%s%n",
		// envName,
		// env.get(envName));
		// }

		final String fileName = System.getenv("PWD");
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + "/sample_output.txt"));
		String[] res;

		int _values_size = 0;
		_values_size = Integer.parseInt(in.nextLine());
		String[] _values = new String[_values_size];
		String _values_item;
		for (int _values_i = 0; _values_i < _values_size; _values_i++) {
			try {
				_values_item = in.nextLine();
			} catch (Exception e) {
				_values_item = null;
			}
			_values[_values_i] = _values_item;
		}

		res = Braces(_values);
		for (int res_i = 0; res_i < res.length; res_i++) {
			bw.write(String.valueOf(res[res_i]));
			bw.newLine();
		}

		bw.close();
	}
}
