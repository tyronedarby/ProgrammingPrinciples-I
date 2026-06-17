/*
 * File: Lab09Prob01
 * Class: CSCI 1301
 * Author: Tyrone Darby Charles Cooper
 * Created On: October 24, 2025
 * Last Modified On: October 24, 2025
 * Description: print random values from array and return minimum value at its index
 */

//import gsu.Math;

public class Lab09Prob01 {

	public static void main(String[] args) {
		// declare and initialize variables
		int[] randNums = new int[12]; 
		int length = randNums.length;
		int min = 256;
		int index = 0;
		System.out.println("Length: " + length);
		System.out.println("");

		// loop through array for random values
		for(int i = 0; i < randNums.length; i++) {
			
			randNums[i] = (int) (-256 + Math.random() * (256 - (-256) + 1));
			System.out.println(randNums[i]);
			
			// check for lowest number
			if(randNums[i] < min) {
				min = randNums[i];
				index = i;
			}
		
		}
		// print minimun value at its index
		System.out.printf("%nMinimum value: %d at index %d%n", min, index);
		
	}

}
