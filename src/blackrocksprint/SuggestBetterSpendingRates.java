package blackrocksprint;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class SuggestBetterSpendingRates {

	public static void main(String[] args) {
		/**
		 * These lines are for reading the input from Hacker Rank 
		 * 
		 * Scanner in = new Scanner(System.in); 
		 * int portfolioValue = in.nextInt(); // p
		 * double interestRate = (in.nextDouble() / 100); // divide by 100 to get r 
		 * int time = in.nextInt(); // number of times I will be calculated 
		 * int threshold = in.nextInt(); // range of spending rates
		 * 
		 * // second line input (spending rates) 
		 * int[] rateArray = newint[time];
		 * for (int i = 0; i < time; i++) { rateArray[i] = in.nextInt(); }
		 */

		// create number formatter to round current income to 3 decimal spots
		DecimalFormat threeDecimals = new DecimalFormat("#.###");

		int portfolioValue = 5000;
		double interestRate = 5.5 / 100;
		int time = 3;
		int threshold = 1;
		int[] rateArray = { 29, 42, 37 };

		System.out.println(threeDecimals.format(currentIncome(portfolioValue, interestRate, time, rateArray)));
		maximizeIncome(threshold, rateArray);
	}

	private static double currentIncome(int p, double r, int t, int[] s) {
		double totalIncome = 0.0;
		int[] calculatedRate = calculateRate(s, t); // first spot will be 0

		// calculate I
		int i = 0;
		while (i < t) {
			totalIncome += (p * s[i] * calculatedRate[i] * (Math.pow(1 + r, i + 1)) / Math.pow(100, i + 1));
			i++;
		}
		return totalIncome;
	}

	private static int[] calculateRate(int[] s, int t) {
		int[] calculatedRate = new int[t + 1]; // first spot will be 0
		for (int i = 0; i <= t; i++) {
			if (i == 0) {
				calculatedRate[i] = 1;
			} else {
				calculatedRate[i] = calculatedRate[i - 1] * (100 - s[i - 1]);
			}
		}
		return calculatedRate;
	}

	/**
	 * get sum of spending rate
	 * 
	 * @param spendingRate
	 * @return
	 */
	private static int getSum(int[] spendingRate) {
		int sum = 0;
		for (int i = 0; i < spendingRate.length; i++) {
			sum += spendingRate[i];
		}
		return sum;
	}

	private static void maximizeIncome(int threshold, int[] spendingRate) {
		// holds all possible threshold values of each spending value
		int[][] thresholdArray = new int[(threshold * 2) + 1][spendingRate.length];
		int[] values = new int[];
		threshold *= -1; // turn threshold negative so it can be incremented in
							// a loop
		for (int i = 0; i < spendingRate.length; i++) {
			for (int j = 0; j < thresholdArray.length; j++) {
				thresholdArray[i][j] = spendingRate[i] + threshold;
				threshold++;
			}
		}

		int totalSum = getSum(spendingRate);
		int temporarySum = 0;
		for (int i = 0; i < thresholdArray.length; i++) {
			for (int j = 0; j < thresholdArray[i].length; j++) {
				// calculate the sum of all combinations in the array
				// compare to the value of totalSum
			}
		}
	}

}
