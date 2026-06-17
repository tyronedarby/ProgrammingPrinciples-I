/**
* File: Lab04Prob01.java
* Class: CSCI 1301
* Author: Tyrone Darby, Prince Ndour
* Created on: Sept 5, 2025
* Description: 
*/

//import gsu.Math;
import java.util.Scanner;

public class Lab04Prob01 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		//Declare random number between 0 and 65.
		int randNum = (int) (Math.random() *66) +0;
		
		// Determine if they eligible to purchase alcohol or not.
		if(randNum >= 21) {
			System.out.println("You are "+randNum+" years old and are eligible to purchase alcohol.");	
		} else {
			System.out.println("You are "+randNum+" years old and are not eligible to purchase alcohol.");
			
		}
	}
}
