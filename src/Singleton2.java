/**
 * This code was taken almost in entirety from the Hibernate 3.1 reference
 * manual. The package name and formatting has been changed only.
 */
public class Singleton2 {
	private static final String var = "Singleton"; // Create the String constant

	private Singleton2() {
	}

	public static String getString() {
		return var;
	}
}
