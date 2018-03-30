
/**
 * This code was taken almost in entirety from the Hibernate 3.1 reference
 * manual. The package name and formatting has been changed only.
 */
public class Singleton {
	private static final String var;

	static {
		try {
			// Create the String constant
			var = "Singleton";
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial String creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static String getString() {
		return var;
	}
}
