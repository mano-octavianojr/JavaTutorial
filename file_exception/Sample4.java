package file_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample4 {

	// Question: What will happen if we access the wrong file?
	// This is where the try-catch will come in the play.
	/**
	 * try{
	 *   codes here
	 * }
	 * catch(Exception exception_var){
	 * 	 codes here
	 * }
	 * */
	public static void main(String[] args) {
		BufferedReader objReader = null;
		try {

			String strCurrentLine;

			objReader = new BufferedReader(new FileReader("src/file_exception/wrong_file.txt"));

			// This loop access each line in the file as String.
			while ((strCurrentLine = objReader.readLine()) != null) {

				System.out.println(strCurrentLine);
			}

		} catch (IOException e) {
			System.out.println("There is an error.");
			e.printStackTrace(); // This is the red font in the console output.
			                     // Try to comment line 35.

		}
	}

}
