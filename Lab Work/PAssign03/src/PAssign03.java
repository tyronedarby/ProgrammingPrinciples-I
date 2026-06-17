/**
* File: PAssign03.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Sept 6, 2025
*/

import java.util.Scanner;

public class PAssign03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define constants
        final double BEVERAGE_PRICE = 0.50;
        final double SANDWICH_PRICE = 2.75;

        double beverages;
        double sandwiches;

        // Prompt for beverages
        System.out.print("Enter the number of beverages: ");
        beverages = input.nextDouble();

        if (beverages == 0.0) {
            System.out.println("ERROR: A quantity of zero is not allowed.");
            System.out.print("Enter the number of beverages: ");
            beverages = input.nextDouble();
        // If valid after retry
        }else if (beverages > 0.0) {
            System.out.println("Ordered: " + beverages + " beverages");
        }

        // Prompt for sandwiches
        System.out.print("Enter the number of sandwiches: ");
        sandwiches = input.nextDouble();

        if (sandwiches == 0.0) {
            System.out.println("ERROR: A quantity of zero is not allowed.");
            System.out.print("Enter the number of sandwiches: ");
            sandwiches = input.nextDouble();
        // If valid after retry
        }else if (sandwiches > 0.0) {
            System.out.println("Ordered: " + sandwiches + " sandwiches");
        }

        // Only calculate totals if both inputs are valid
        if (beverages > 0.0 && sandwiches > 0.0) {
            double subtotal = (beverages * BEVERAGE_PRICE) + (sandwiches * SANDWICH_PRICE);
            double total = subtotal * 1.075;

            System.out.println("The subtotal of " + beverages + " beverages and " + sandwiches + " sandwiches is $" + subtotal + ".");
            System.out.println("With tax, the total is $" + total + ".");
        } else {
            System.out.println("Your order total could not be calculated due to a zero quantity for an item.");
        }
    }
}
