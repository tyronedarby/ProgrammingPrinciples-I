/**
* File: PAssiign06.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Oct 5, 2025
* Description: A program that asks the user to enter an integer that is used to set a limit that will
			   generate the following four patterns of multiples of five using nested loops
*/

import java.util.Scanner;

public class PAssign06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter max number of multiples: ");
		int maxNum = input.nextInt();
		int num = 5;
		
		//Loop until the user enter a positive number
		while(maxNum < 0) {
			
			//If the user enter a negative number, prompt them again to enter a positive number
			if(maxNum < 0) {
				System.out.println("Please enter a positive value.");
				System.out.println("\nEnter max number of multiples: ");
				maxNum = input.nextInt();
			}
		}
		
		// Ascending multiples of five with ascending length triangle
		System.out.println("\nPattern A:");
		for(int i = 1; i <= maxNum; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j * num + " ");
			}
			System.out.println();
		}
		
		// Ascending multiples of five with descending length (inverted) triangle
		System.out.println("\nPattern B:");
		for(int i = maxNum; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j * num + " ");
			}
			System.out.println();
		}
		
		// Descending multiples of five with ascending length triangle
		System.out.println("\nPattern C:");
		for(int i = 1; i <= maxNum; i++) {
			for(int j = i; j >= 1; j--) {
				System.out.print(j * num + " ");
			}
			System.out.println();
		}
		
		// Descending multiples of five with descending length (inverted) triangle
		System.out.println("\nPattern D:");
		for(int i = maxNum; i >= 1; i--) {
			for(int j = i; j >= 1; j--) {
				System.out.print(j * num + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

}
