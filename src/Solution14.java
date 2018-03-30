/*
 * Given an array of numbers, determine whether the sum of all of the numbers is odd or even.
 * Give your answer in string format as 'odd' or 'even'.
 * If the input array is empty consider it as: [0] (array with a zero).
*/
import static java.util.Arrays.stream;

class Solution14 {
    static String oddOrEven(final int[] array) {
        return stream(array).sum() % 2 == 0 ? "even" : "odd";
    }
    
	public static void main(String[] args) {
		int[] a = {0};
		System.out.println(Solution14.oddOrEven(a));// returns "even"
		int[] b = {2, 5, 34, 6};
		System.out.println(Solution14.oddOrEven(b));// returns "odd"
		int[] c = {0, -1, -5};
		System.out.println(Solution14.oddOrEven(c));// returns "even"
	}

}
