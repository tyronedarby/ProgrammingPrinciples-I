/**
 * File: Lab10Prob01.java
 * Class: CSCI 1301
 * Author: Wesley Soto, Tyrone Darby
 * Created: OCT 31, 2025
 * Modified: OCT 31, 2025
 * Description: first half of an array
 */



public class Lab10Prob02 {
	public static void main(String[] args) {
		
		// calls method prints output half array
		printArray(halfCopyArray(new double[] {18.7, -22.2, 43.4, 74.1, -25.5, 46.6, 27.8}));
		
		
	}
	public static void printArray(double[] array) {
		
		//print array into console
		for (double currValue: array) {
			System.out.println(currValue);
		}
	}
	public static double[] halfCopyArray(double[] array) {
		
		// create half array
		double[] halfArray = new double[(int)(Math.ceil(array.length / 2.0))];
		int mid = (int)(Math.ceil(array.length / 2.0));
		
		//assign values from array to half array
		for (int i = 0; i < mid; i++) {
			halfArray[i] = array[i];
		}
		
		// return array
		return halfArray;
	}
}
