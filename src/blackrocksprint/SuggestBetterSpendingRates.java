package blackrocksprint;

import java.util.Arrays;
import java.util.Scanner;

public class SuggestBetterSpendingRates {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int portfolioValue = in.nextInt(); // p
		double interestRate = (in.nextDouble() / 100); // divide by 100 to get r
		int time = in.nextInt(); // number of times I will be calculated
		int threshold = in.nextInt(); // range of spending rates

		// second line input (spending rates)
		int[] rateArray = new int[time];
		for (int i = 0; i < time; i++) {
			rateArray[i] = in.nextInt();
		}

		for (int i = 0; i < time; i++) {
			int rate = 100 - rateArray[i];
		}

		System.out.println(income(portfolioValue, interestRate, time, rateArray));
	}

	private static double income(int p, double r, int t, int[] s) {
		double totalIncome = 0.0;
		int[] calculatedRate = new int[t + 1]; // first spot will be 0
		for (int i = 1; i <= t; i++) {
			calculatedRate[i] = 100 - s[i];
		}
		// calculate I
		int i = 0;
		while (i < t) {
			totalIncome += (p * s[i] * calculatedRate[i] * (Math.pow(1 + r, i + 1)) / Math.pow(100, i + 1));
			i++;
		}
		return totalIncome;
	}

}
