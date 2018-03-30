public class Fracts {
	// calculate greatest common multiplier between two numbers
	public static long gcm(long a, long b) {
		long gcd = 1;

		if (a > b) {
			for (long i = b; i >= 1; i--) {
				if (a % i == 0 && b % i == 0) {
					return i;
				}
			}
		} else {
			for (long j = a; j >= 1; j--) {
				if (a % j == 0 && b % j == 0) {
					return j;
				}
			}
		}
		return gcd;
	}

	public static String convertFrac(long[][] lst) {
		// discover Denominator

		long denom = 0;
		for (long[] frac : lst) {
			if (denom == 0) {
				denom = frac[1];
			} else {
				denom *= frac[1] / gcm(denom, frac[1]);
			}
		}

		String answer = "";

		// modify the original array with Denominator
		for (long[] frac : lst) {
			frac[0] *= denom / frac[1];
			frac[1] = denom;
			answer += "(" + frac[0] + "," + frac[1] + ")";
		}
		return answer;
	}

}