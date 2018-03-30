import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Sample of Stream filtering with lambdas in java
 */
public class Solution19 {

	public static void main(String[] args) {

		List<String> asList = (List<String>) Stream.of("one", "two", "three", "four")
				.filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());

		System.out.println(asList);
	}
}
