/**
* File: Labo3Prob01.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Aug 29, 2025
*/

import java.util.Scanner;

public class Lab03Prob01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int totalCredit;
		System.out.println("Enter current accumulated credit hours: ");
		int creditAccum = input.nextInt();
		
		System.out.println("Enter number of total credit hours: ");
		totalCredit = input.nextInt();
		
		System.out.println("You have " + creditAccum + " credit hour(s).\n"
				+ "Your degree requires "+ totalCredit +" credit hour(s).\n");
	}
}
