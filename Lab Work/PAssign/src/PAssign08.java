/**
* File: PAssiign08.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Oct 25, 2025
* Description: create an array of that size and have the user populate the values with whatever whole-number values they choose
*/

import java.util.Scanner;

public class PAssign08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user for the array  size
		System.out.println("Enter number of values: ");
		int size = input.nextInt();
		
		// Declare variables
		int[] nums = new int[size];
		int count = 0;
		int max = 0, maxIndex = 0, minIndex = 0;
		int min = 0, over = 0, under = 0;
		double avg = 0, sum = 0;
		
		// user populate the array
		for(int i = 0; i < nums.length; i++) {
			count++;
			System.out.printf("Enter value (%d of %d): ", count, size);
			nums[i] = input.nextInt();
			
			// Calculate the sum of numbers in the array
			sum += nums[i];
		}
		
		// Calculate the average of numbers in the array
		avg = sum / size;
		min = nums[0];

		for(int i = 0; i < nums.length; i++) {
			System.out.printf("\nIndex %d: %d", i, nums[i]);
			
			// Determine the maximum number and its index in the array 
			if(nums[i] > max) {
				max = nums[i];
				maxIndex = i;
			}
			
			// Determine the minimum number and its index in the array 
			if(nums[i] < min) {
				min = nums[i];
				minIndex = i;
			}
			
			// Determine the over/under average numbers in the array 
			if(nums[i] > avg) {
				over++;
			} else {
				under++;
			}
		}
		
		// Output Result
		System.out.printf("\n\nMaximum: %d at index %d\nMinimum: %d at index %d\nAverage: %.4f\nValues over average: %d\nValues under average: %d%n", 
				max, maxIndex, min, minIndex, avg, over, under);
	}
}
