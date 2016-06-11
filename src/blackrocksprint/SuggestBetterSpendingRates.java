package blackrocksprint;

import java.util.Arrays;
import java.util.Scanner;

public class SuggestBetterSpendingRates {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// int portfolioValue = in.nextInt(); // p
		// double interestRate = (in.nextDouble() / 100); // divide by 100 to
		// get r
		// int time = in.nextInt(); // number of times I will be calculated
		// int threshold = in.nextInt(); // range of spending rates
		//
		// // second line input (spending rates)
		// int[] rateArray = new int[time];
		// for (int i = 0; i < time; i++) {
		// rateArray[i] = in.nextInt();
		// }
		//
		// for (int i = 0; i < time; i++) {
		// int rate = 100 - rateArray[i];
		// }

		int portfolioValue = 5000;
		double interestRate = 5.5/100;
		int time = 3;
		int threshold = 1;
		int[] rateArray = { 29, 42, 37 };

		System.out.println(income(portfolioValue, interestRate, time, rateArray));
	}

	private static double income(int p, double r, int t, int[] s) {
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

}
