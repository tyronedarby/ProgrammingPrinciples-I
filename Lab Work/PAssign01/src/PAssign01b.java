/**
* File: PAssign01b.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Aug 29, 2025
*/

import java.util.Scanner;

public class PAssign01b {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	double base;
	double height;
	double area;
	
	System.out.println("Enter the base of the Triangle: ");
	base = input.nextDouble();
	
	System.out.println("Enter the height of the Triangle: ");
	height = input.nextDouble();
	
	area = (base * height) / 2;
	
	System.out.println("A triangle with base " + base + " and height " + height + " has an area of " + area + ".");
	}
}