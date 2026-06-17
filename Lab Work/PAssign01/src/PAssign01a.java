/**
* File: PAssign01a.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Aug 29, 2025
*/

import java.util.Scanner;

public class PAssign01a {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double beverage = 0.50;
		double sandwiche = 2.75;
		double price;
		
		System.out.println("Enter number of beverages: ");
		double beverages = input.nextDouble();
		
		System.out.println("Enter number of sandwiches: ");
		double sandwiches = input.nextDouble();
		
		price = (beverage * beverages) + (sandwiche * sandwiches);
		
		System.out.println("The total of " + beverages + " beverages and " + sandwiches + " sandwiches is $" + price + ".");
	}
}
