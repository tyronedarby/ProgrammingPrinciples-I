/**
 * File: ch12/ReadData.java
 * Package: 
 * @author Christopher Williams
 * Created on: Apr 18, 2016
 * Last Modified: Jul 15, 2019
 * Description:  Show example of reading in a simple text file  
 */

import java.util.Scanner; 
import java.io.*;

public class ReadData {
	public static void main(String[] args) throws Exception { // STUDENT:  get rid of this throws later
		// Create a File instance
		File file = new File("scores.txt");

		// Create a Scanner for the file
		Scanner input = new Scanner(file);

		// Read data from a file
		while (input.hasNext()) {
			String firstName = input.next();
			String mi = input.next();
			String lastName = input.next();
			int score = input.nextInt();
			System.out.printf("%s %s %s %d%n", firstName, mi, lastName, score);
		}

		// Close the file
		input.close();

		System.out.println("File read, program terminated.");
	}
}