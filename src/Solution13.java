import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution13 {

	/*
	 * 
	 * Complete the function below.
	 */

	public static String fillString(int count, char c) {
		StringBuilder sb = new StringBuilder(count);
		for (int i = 0; i < count; i++) {
			sb.append(c);
		}
		return sb.toString();
	}

	static void StairCase(int n) {
		for (int i = n-1; i >= 0; i--) {
			String s = fillString(i, ' ') + fillString(n-i,'*');
			System.out.println(s);
		}

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int _n;
		_n = Integer.parseInt(in.nextLine().trim());

		StairCase(_n);

	}
}
