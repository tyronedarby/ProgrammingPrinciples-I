/**
* File: PAssiign07.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Oct 18, 2025
* Description: To determine how many times that character occurs in the string using iteration (loops) as
			   well as the reverse of the string.
*/

import java.util.Scanner;

public class PAssign07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Declare variables
		String s = " ";
		char getChar;
		int numOfChar;
		
		// Loop while the input is not "STOP"
		while(!s.equals("STOP")) {
			System.out.println("\nEnter a string: ");
			s = input.nextLine();	
			
			// Only proceed if the input is not "STOP"
			if(!s.equals("STOP")) {
				System.out.println("Enter a character: ");
				getChar = input.nextLine().charAt(0);
				
				numOfChar = countCharacters(s, getChar);
				printCount(s, getChar, numOfChar);
				
				String rWord = reverseString(s);
				System.out.printf("\nThe reverse of %s is %s%n", s, rWord);
			} 
		}
	}
	
	// Create a method that represents the number of times the character showed up in the string.
	public static int countCharacters(String s, char c) {
		int numOfChar = 0;
		int n = s.length();
		char getChar;
		
		for(int i = 0; i < n; i++) {
			getChar = s.charAt(i);
			
			if(getChar == c) {
				numOfChar += 1;
			} else {
				numOfChar += 0;
				
			}
		}
		
		return numOfChar;
	}
	
	// Create a method that prints the number of occurrences to the console.
	public static void printCount(String s, char c, int n) {
		System.out.printf("%c occurs in %s %d times", c, s ,n);
	}
	
	// Create a method that akes a String as a parameter and returns a String that is the reverse of the passed String.
	public static String reverseString(String s) {
		String reverseWord = "";
		
		for(int i = s.length() - 1; i >= 0; i--) {
			reverseWord = reverseWord + s.charAt(i);
		}
		
		return reverseWord;
	}

}
