package file_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample2 {

	
    public static void main(String[] args) {
        BufferedReader objReader = null;
        try { // disregard this

            String strCurrentLine;

            objReader = new BufferedReader(new FileReader("src/file_exception/input_file.txt"));

            int line_counter = 0;
            while ((strCurrentLine = objReader.readLine()) != null) {

            	// We are counting how many lines.
                line_counter++;
                System.out.println("line " + line_counter + ": " + strCurrentLine);
            }

        } catch (IOException e) { // disregard this

            e.printStackTrace();

        }
    }

}
