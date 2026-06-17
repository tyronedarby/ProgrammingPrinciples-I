/**
* File: Lab05Prob01.java
* Class: CSCI 1301
* Author: Tyrone Darby , Jordan Orr
* Created on: Sept 19, 2025
* Description: 
*/

import java.util.Scanner;


public class Lab05Prob04 {
	public static void main(String[] args) {
		// promp the user for input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the lenght of triangle: ");
		double a = input.nextDouble();
		
		System.out.println("Enter the lenght of triangle: ");
		double b = input.nextDouble();
		
		System.out.println("Enter the lenght of triangle: ");
		double c = input.nextDouble();
		
		
		double s = (a+b+c)/2;
		// use herons formula to calculate the area of a triangle 
		double area = Math.sqrt(s * ( s - a ) * ( s -  b ) * ( s - c ));
		System.out.printf("For side lengths of %.2f, %.2f, %.2f, the area is %.2f", a, b, c, area); 
	}
}