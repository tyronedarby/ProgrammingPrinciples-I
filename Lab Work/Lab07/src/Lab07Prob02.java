/**
* File: Lab07Prob01.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Oct 3, 2025
* Description:
*/

import java.util.Scanner;

public class Lab07Prob02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput = 0;
        System.out.print("Enter a number: ");
        userInput = input.nextInt();
        
        // Modified for loop with logical operator to replace break
        // Loop continues while i < userInput AND i < 25 (replaces break condition)
        for (int i = 0; i < userInput && i < 25; i++) {
            // Use logical operator to replace continue - only print if NOT one of the skip values
            if (!(i == 3 || i == 7 || i == 18 || i == 23)) {
                System.out.printf("%d ", i);
            }
        }
        System.out.printf("%nYou entered %d%n", userInput);
        System.out.println("Program Completed");
        
        
    }
}