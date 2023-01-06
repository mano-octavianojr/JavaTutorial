package regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sample1 {

	public static void main(String[] args) {

		String regEx = "ant";

		// This line compiles the given regular expression into a pattern with the
		// givenflags.
		Pattern compile = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);

		// This line creates a matcher that will match the given input against this
		// pattern.
		Matcher matcher = compile.matcher("elephant-ant-dog");

		// Attempts to find the next subsequence of the input sequence that matches the
		// pattern.

		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("Match found");
		} else {
			System.out.println("Match not found");
		}
	}
}
