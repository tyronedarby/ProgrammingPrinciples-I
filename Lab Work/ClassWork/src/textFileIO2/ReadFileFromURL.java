/**
 * File: ch12/ReadFileFromURL.java
 * Package: 
 * @author Christopher Williams
 * Created on: Apr 18, 2016
 * Last Modified: Jul 15, 2019
 * Description:  Show example of reading from a URL
 */

import java.util.Scanner;
import java.net.*;
import java.io.*;

public class ReadFileFromURL {
	public static void main(String[] args) {
		System.out.print("Enter a URL: ");   
		String URLString = new Scanner(System.in).next();

		try {
			URL url = new URL(URLString); 
			int count = 0;
			Scanner input = new Scanner(url.openStream());
			while (input.hasNext()) {
				String line = input.nextLine();
				count += line.length();
			} 

			System.out.println("The file size is " + count + " characters");
		} catch (MalformedURLException ex) {
			System.out.println("Invalid URL");
		} catch (IOException ex) {
			System.out.println("IO Errors");
		}
	}
}   