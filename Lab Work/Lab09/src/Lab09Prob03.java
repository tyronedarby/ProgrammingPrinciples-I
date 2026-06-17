/*
 * File: Lab09Prob01
 * Class: CSCI 1301
 * Author: Tyrone Darby Charles Cooper
 * Created On: October 24, 2025
 * Last Modified On: October 24, 2025
 * Description: print values from array at their index and return maximum value
 */

//import gsu.Math;


public class Lab09Prob03 {

	public static void main(String[] args) {
		// declare and initialize variables
		double[] randNums = {-12.6018020118, 15.3437682821, 145.8110691671, 11.1681119916, 82.0442710394, 155.0005475009, 
				-6.1179400421, 120.1984991874, 38.6575114628, 77.1494972203};
		int length = randNums.length - 1;
		
		double max = -12.6018020118;
		double min = 0;
		double avg = 0;
		int below = 0+1, above = 0 - 1;
		double sum = 0;
		
		// loop through array and print values at their index
		for(int i = 0; i < randNums.length; i++) {
			
			sum += randNums[i];
			// calculate average
			avg = sum / randNums.length;
			// loop for minimum value
			if(randNums[i] < min) {
				min = randNums[i];
			}
			
			// loop to find maximum value
			if(randNums[i] > max) {
				max = randNums[i];	
			}
			
			// check to see if numbers is above average
			if (randNums[i] < avg) {
				below++;
			} else {
				above++;
			}
		}
		
		
		// print maximum value at its index
		System.out.printf("Maximum value: %.3f%nMinimum value: %.3f%nAverage value: %.3f%nValues above average: %d%nValues below average: %d%n", 
				max, min, avg, above, below);
	}
}  