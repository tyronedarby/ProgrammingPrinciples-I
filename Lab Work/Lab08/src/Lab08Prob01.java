/*
 * File: Lab08Prob01.java
 * Author: Kalis Sandlin, Tyrone Darby, Nam Nguyen
 * Created: Oct 17, 2025
 * Modified: Oct 17, 2025
 * Description: Outputs average using two methods
 */
public class Lab08Prob01 {
	public static void main(String[] args) {
		
		// Prints out averages
		System.out.printf("The average of 2, 3, and 6 is %.5f\n", averageMethod(2, 3, 6));
		System.out.printf("The average of 2.74, 3.45, and 6.21 is %.5f\n", averageMethod(2.74, 3.45, 6.21));
	}
	
	// First method accepts three Ints
	public static double averageMethod(int x, int y, int z) {
		
		// Local variable to store average
		double average = 0;
		
		average = (x + y + z) / 3.0;
		
		return average;
	}
	
	// Second method accepts three doubles
	public static double averageMethod(double x, double y, double z) {
		
		// Local variable to store average
		double average = 0;
		
		average = (x + y + z) / 3.0;
		
		return average;
	}
}