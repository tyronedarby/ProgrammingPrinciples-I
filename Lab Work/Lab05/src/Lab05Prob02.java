/**
* File: Lab05Prob01.java
* Class: CSCI 1301
* Author: Tyrone Darby , mn Orr
* Created on: Sept 19, 2025
* Description: 
*/

import java.util.Scanner;


public class Lab05Prob02 {
	public static void main(String[] args) {
		// promp the user for input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word:");
		String s = input.nextLine();
		
		char firstChar = s.charAt(0);
		char lastChar = s.charAt(s.length() - 1);
		char middleChar = s.charAt((int)Math.ceil(s.length() / 2.0)) ;
		
		
		
		if (s.length() <= 4) {
			System.out.println(" The string you entered " + s + " contains less than 4 characters");
		}else {
			System.out.println("For the string " + s);
			System.out.println("first letter is " + firstChar);
			System.out.println("last letter is " + lastChar);
			System.out.println("\"middle\" letter is " + middleChar);
			
		}
}
}
