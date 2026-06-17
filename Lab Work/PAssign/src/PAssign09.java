/**
* File: PAssiign09.java
* Class: CSCI 1301
* Author: Tyrone Darby
* Created on: Nov 1, 2025
* Description: This Java program evaluates 12 properties to determine which should be kept or donated by comparing their 4.75-year 
* 			   maintenance costs against half of their 10.25-year rental revenue, then displays financial totals and individual property 
*              decisions.
*/

public class PAssign09 {
    
    /**
     * Determines if a property should be kept based on maintenance costs vs rental income.
     * annualMaintenanceCost Annual maintenance/renovation costs
     * annualRentalIncome Annual rental income
     * return true if property should be kept, false if it should be donated
     */
	
    public static boolean keepProperty(double annualMaintenanceCost, double annualRentalIncome) {
        double maintenanceCost4_75Years = annualMaintenanceCost * 4.75;
        double rentalRevenue10_25Years = annualRentalIncome * 10.25;
        double halfRentalRevenue = rentalRevenue10_25Years / 2.0;
        
        return maintenanceCost4_75Years < halfRentalRevenue;
    }
    
    
     // Prints the keep/donate decision for each property.
     // Return decision Boolean array with keep (true) or donate (false) decisions
     
    public static void printDecisions(boolean[] decision) {
        for (int i = 0; i < decision.length; i++) {
            System.out.printf("Property %d - %s%n", i, decision[i] ? "keep" : "donate");
        }
    }
    
    public static void main(String[] args) {
        // Given property data
        double[] maintenanceCosts = {21500, 29275, 37250, 35322, 19757, 24625, 30300, 18759, 15217, 27090, 12439, 22005};
        double[] rentalIncomes = {26752, 21421, 39759, 24783, 15297, 25264, 32159, 16157, 21705, 19420, 18275, 21350};
        
        // Decision array to store keep/donate decisions
        boolean[] decision = new boolean[maintenanceCosts.length];
        
        // Calculate totals before donation
        double totalMaintenanceBefore = 0.0;
        double totalRentalBefore = 0.0;
        
        for (int i = 0; i < maintenanceCosts.length; i++) {
            totalMaintenanceBefore += maintenanceCosts[i];
            totalRentalBefore += rentalIncomes[i];
        }
        
        // Evaluate each property
        for (int i = 0; i < maintenanceCosts.length; i++) {
            decision[i] = keepProperty(maintenanceCosts[i], rentalIncomes[i]);
        }
        
        // Calculate totals after donation (only kept properties)
        double totalMaintenanceAfter = 0.0;
        double totalRentalAfter = 0.0;
        double totalDonatedRental = 0.0;
        
        for (int i = 0; i < maintenanceCosts.length; i++) {
            if (decision[i]) {
                // Property is kept
                totalMaintenanceAfter += maintenanceCosts[i];
                totalRentalAfter += rentalIncomes[i];
            } else {
                // Property is donated
                totalDonatedRental += rentalIncomes[i];
            }
        }
        
        // Display results
        System.out.printf("Total maintenance/renovation before donation: $%,.2f%n", totalMaintenanceBefore);
        System.out.printf("Total rental income before donation: $%,.2f%n%n", totalRentalBefore);
        System.out.printf("Total maintenance/renovation after donation: $%,.2f%n", totalMaintenanceAfter);
        System.out.printf("Total rental income after donation: $%,.2f%n%n", totalRentalAfter);
        System.out.printf("Total Donated Rental Income: $%,.2f%n%n", totalDonatedRental);
        
        printDecisions(decision);
    }
}
