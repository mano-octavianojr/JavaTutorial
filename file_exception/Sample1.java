package file_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample1 {

    public static void main(String[] args) {
        BufferedReader objReader = null;
        try { // disregard this

            String strCurrentLine;

            objReader = new BufferedReader(new FileReader("src/file_exception/input_file.txt"));

            while ((strCurrentLine = objReader.readLine()) != null) {

                System.out.println(strCurrentLine);
            }

        } catch (IOException e) { // disregard this

            e.printStackTrace();

        }
    }

}
