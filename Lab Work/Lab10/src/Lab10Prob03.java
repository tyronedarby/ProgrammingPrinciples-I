
/**
 * File: Lab10Prob01.java
 * Class: CSCI 1301
 * Author: Wesley Soto, Tyrone Darby
 * Created: OCT 31, 2025
 * Modified: OCT 31, 2025
 * Description: create an array that displays min/max temperatures and average and above/ below avg
 * 				 for days as well as days greater than 25 degree diff
 */



public class Lab10Prob03 {
	public static void main(String[] args) {
		
		// declare arrays
		int[] highTemp = { 66, 73, 77, 79, 81, 82, 83, 85, 85, 87, 82 };
		int[] lowTemp = { 41, 44, 49, 51, 49, 62, 59, 59, 57, 61, 63 };
		double length = (double)(highTemp.length);
		int countDiff = 0;
		
		// declared variables
		final int TEMP_DIFF = 25;
		
		System.out.println("Days greater than 25 degree difference:");
		
		for (int i = 0; i < highTemp.length; i++) {
			
			//prints days with > 25 temp diff
			if (Math.abs(highTemp[i] - lowTemp[i]) > TEMP_DIFF) {
				System.out.printf("Day %d:\t%d\n", i, Math.abs(highTemp[i] - lowTemp[i]));
				countDiff++;
			}
		}
		
		// find average low and high
		int lowSum = 0, highSum = 0;
		int minLow = lowTemp[0], maxHigh = highTemp[0];
		//low temp
		for (int i = 0; i < lowTemp.length; i++) {
			lowSum += lowTemp[i];
			if (minLow > lowTemp[i]) {
				minLow = lowTemp[i];
			}
			highSum += highTemp[i];
			if (maxHigh < highTemp[i]) {
				maxHigh = highTemp[i];
			}
		}
		// average calculation
		double lowAvg = (double)(lowSum / length);
		double highAvg = (double)(highSum / length);
		
		// diff temp avg
		int diffSum = 0;
		for (int i = 0; i < highTemp.length; i++) {
			diffSum += Math.abs(highTemp[i] - lowTemp[i]);
		}
		
		// calculate diff avg
		double diffAvg = (double)(diffSum / length);
		
		System.out.printf("\nStatistics:\nMin Low: %d\nAverage Low: %.2f\n\nMax High: %d\nAverage High: %.2f\n\nAverage Difference: %.2f\nNumber of days with above-average difference: %d out of %d\n\n"
				, minLow, lowAvg, maxHigh, highAvg, diffAvg, countDiff, highTemp.length);
	}
}
