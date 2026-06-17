/**
 * File: csci1301/ReadPrices.java
 * Package: 
 * @author Christopher Williams
 * Created on: Dec 4, 2019
 * Description:  Read the prices file and display the information
 */
import java.io.File;
import java.util.Scanner;

public class ReadPrices {

	public static void main(String[] args) {
		File inFile = new File("src/textFileIO/pricelist.txt");
		try ( // auto-close these resources
				Scanner input = new Scanner(inFile); 
				) {
			double currPrice = 0.0;
			// process file
			while (input.hasNext()) {
				currPrice = input.nextDouble();
				System.out.printf("$%.2f\n", currPrice);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}