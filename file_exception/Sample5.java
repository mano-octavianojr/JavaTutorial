package file_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException; // Need to import.

public class Sample5 {

	// NOTE: There are Classes that will give you an error if you do not put error
	// handling (try removing the try-catch keywords).
	// Furthermore, you can also handle specific error in your code.
	public static void main(String[] args) {
		BufferedReader objReader = null;
		try {

			objReader = new BufferedReader(
					new FileReader("C:\\Users\\mvoctavianojr\\Desktop\\JavaTutorial\\file_exception\\input_file.txt"));

		} catch (IOException e) {

			e.printStackTrace();

		} catch (Exception e) {
			System.out.println("General exception."); // Think of it that this will be executed
														// if no exception catch the error.
		}
	}
}
