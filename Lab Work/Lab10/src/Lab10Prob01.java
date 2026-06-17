
/**
 * File: Lab10Prob01.java
 * Class: CSCI 1301
 * Author: Wesley Soto, Tyrone Darby
 * Created: OCT 31, 2025
 * Modified: OCT 31, 2025
 * Description: create array 21 doubles with multiples of 7 using a loop
 */



public class Lab10Prob01 {
	public static void main(String[] args) {
		
		// declare array
		double[] multiple7Array = new double[21];
		
		// loop for assigning values of multiples of 7
		for (int i = 0; i < multiple7Array.length; i++) {
			multiple7Array[i] = i * 7;
		}
		
		printArray(multiple7Array);
		
	}
	public static void printArray(double[] array) {
		
		
		//print array into console
		for (double currValue: array) {
			System.out.println(currValue);
		}
	}
}
