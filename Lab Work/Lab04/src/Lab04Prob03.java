/**
* File: Lab04Prob03.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Sept 5, 2025
* Description: 
*/

//import gsu.Math;

public class Lab04Prob03 {
    public static void main(String[] args) {
        double baseSalary = 40000.0;

        // Step 1: Generate a random number between 0 and 950
        int randomNumber = (int) (Math.random() * 951); // Generates number from 0 to 950 inclusive

        // Step 2: Constrain it to a status number between 0 and 6
        int status = randomNumber % 7;

        // Step 3: Determine raise percentage using if-else
        double raisePercent;

        if (status == 0) {
            raisePercent = 0.0;
        } else if (status == 1) {
            raisePercent = 3.7;
        } else if (status == 2) {
            raisePercent = 4.2;
        } else if (status == 3) {
            raisePercent = 5.7;
        } else if (status == 4) {
            raisePercent = 6.1;
        } else if (status == 5) {
            raisePercent = 7.3;
        } else { // status == 6
            raisePercent = 8.7;
        }

        // Step 4: Calculate new salary
        double raiseAmount = baseSalary * (raisePercent / 100);
        double newSalary = baseSalary + raiseAmount;

        // Step 5: Output the results (exact format)
        System.out.print("With a random status of "+ status+ " and an initial salary of $"+ baseSalary + ", your raise is ");
        System.out.print(raisePercent+ "% which equates to a new salary of $"+ newSalary +".\n");
    }
}
