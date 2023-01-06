/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sample3 {

	public static void main(String[] args) {
		BufferedReader objReader = null;
		try { // disregard this

			String strCurrentLine;

			objReader = new BufferedReader(new FileReader("src/file_exception/input_file.txt"));

			int sum = 0;
			while ((strCurrentLine = objReader.readLine()) != null) {

				// Split the lines into array.
				// NOTE: The value inside the .split() depends on how
				// you are going to split the values.
				String[] stringArray = strCurrentLine.split(" ");

				// Loop all elements in array.
				for (String num : stringArray) {
					System.out.println(num);

					// Convert string into integer.
					int temp = Integer.parseInt(num);
					sum += temp;
				}
			}

			System.out.println("sum: " + sum);
		} catch (IOException e) { // disregard this

			e.printStackTrace();

		}
	}
}
