
/*
 * File: Lab08Prob02.java
 * Author: Kalis Sandlin, Tyrone Darby, Nam Nguyen
 * Created: Oct 17, 2025
 * Modified: Oct 17, 2025
 * Description: Shows Overloading methods
 */
public class Lab08Prob02 {
	public static void main(String[] args) {
		
		// Prints out averages
		System.out.printf("The average of 2, 3, and 6 is %.5f\n", averageMethod(2, 3, 6));
		System.out.printf("The average of 2.74, 3.45, and 6.21 is %.5f\n", averageMethod(2.74, 3.45, 6.21));
		System.out.printf("The average of 2, 3, 6, and 11 is %.5f\n", averageMethod(2, 3, 6, 11));
		System.out.printf("The average of 2.74, 3.45, 6.21, and 11.91 is %.5f\n", averageMethod(2.74, 3.45, 6.21, 11.91));
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
		
		// These two methods should only be called since there are four inputs and not three which would result in the previous methods to be called
		// Third method accepts four Ints
		public static double averageMethod(int x, int y, int z, int a) {
					
			// Local variable to store average
			double average = 0;
					
			average = (x + y + z + a) / 4.0;
					
			return average;
		}
		
		// Fourth method accepts four doubles
		public static double averageMethod(double x, double y, double z, double a) {
					
			// Local variable to store average
			double average = 0;
					
			average = (x + y + z + a) / 4.0;
					
			return average;
		}
}