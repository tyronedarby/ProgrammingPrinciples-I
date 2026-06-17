/**
 * File: ch12/WriteData.java
 * Package: 
 * @author Christopher Williams
 * Created on: Apr 18, 2016
 * Last Modified: Jul 15, 2019
 * Description:  Show example of writing to a simple text file  
 */

import java.io.*;

public class WriteData {
	public static void main(String[] args) throws Exception { // STUDENT:  get rid of this throws later
		File file = new File("src/scores.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			// Two options
			// 1.  Valid case for exiting:  preserve existing file
			// System.exit(0);
			// OR
			// 2.  Auto-delete file for convenience/testing
			file.delete();
			System.out.println("File deleted");
		}

		// Create a file
		PrintWriter output = new PrintWriter(file);

		// Write formatted output to the file
		output.print("John T Smith ");
		output.println(90);
		output.print("Eric K Jones ");
		output.println(85);
		output.print("Jane X Doe");
		output.println(97);

		// Close the file
		output.close();
		
		System.out.println("File written, program terminated.");

	}
}