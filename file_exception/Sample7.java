package file_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample7 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, IOException {
		
		BufferedReader buffer = new BufferedReader(
				new FileReader("C:\\Users\\mvoctavianojr\\Desktop\\JavaTutorial\\file_exception\\input_file.txt"));
		
		
	}
}
