package file_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sampl1 {

	// GOAL: Access the input_file.txt
	// NOTE: Check the path.
	public static void main(String[] args) {
		BufferedReader objReader = null;
		try { // disregard this

			String strCurrentLine;
			
			// Always identify the path of the file.
			// Can be either relative path or full path.
			// Also take into account the operating system that you are using.
			// objReader = new BufferedReader(new FileReader("src/file_exception/input_file.txt"));
			objReader = new BufferedReader(new FileReader("C:\\Users\\mvoctavianojr\\Desktop\\JavaTutorial\\file_exception\\input_file.txt"));

			// This loop access each line in the file as String.
			while ((strCurrentLine = objReader.readLine()) != null) {

				System.out.println(strCurrentLine);
			}

		} catch (IOException e) { // disregard this

			e.printStackTrace();

		}
	}

}
