/**
* File: Lab04Prob02.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Sept 5, 2025
* Description: 
*/
import java.util.Scanner;

public class Lab04Prob02 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		//User inputs month number
		System.out.println("Enter the month number: ");
		int num = input.nextInt();
		String season = "";
		
		//Determine which season is the month in.
		if(num == 12 || num <= 2) {
			season = "winter";
			System.out.println("Month "+num+" occurs during " + season + ".");
		}else if(num >= 3 && num <= 5) {
			season = "spring";
			System.out.println("Month "+num+" occurs during " + season + ".");
		}else if(num >= 6 && num <= 8) {
			season = "summer";
			System.out.println("Month "+num+" occurs during " + season + ".");
		}else if(num >= 9 && num <= 11 ) {
			season = "fall";
			System.out.println("Month "+num+" occurs during " + season + ".");
		}else {
			System.out.println("That is not a valid month.");
		}
	}
}
