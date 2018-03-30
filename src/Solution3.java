import java.util.Scanner;

class MyCalculator {
	int power(int n, int p) throws Exception {
		if (n < 0 || p < 0)
			throw new Exception("n and p should be non-negative");
		if (p == 0)
			return 1;
		return n * power(n, p - 1);
	}
}
// Complete the main method

class Solution3 {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		MyCalculator calc = new MyCalculator();

		while (in.hasNextLine()) {
			int num = in.nextInt();
			int pot = in.nextInt();
			try {
				System.out.println(calc.power(num, pot));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		in.close();
	}
}
