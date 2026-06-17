/**
* File: Lab07Prob01.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Oct 3, 2025
* Description:
*/

import java.util.Scanner;

public class Lab07Prob01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5 -i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
