import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Given a base- integer, , convert it to binary (base-). 
 * Then find and print the base- integer denoting the maximum number of consecutive 1's in 1's binary representation.
 */
public class Solution18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		char[] binary = Integer.toBinaryString(n).toCharArray();
		int tmpCount = 0;
		int maxCount = 0;
		for (int i = 0; i < binary.length; i++) {
			tmpCount = (binary[i] == '0') ? 0 : tmpCount + 1;
			if (tmpCount > maxCount) {
				maxCount = tmpCount;
			}
		}
		System.out.println(maxCount);
	}
}
