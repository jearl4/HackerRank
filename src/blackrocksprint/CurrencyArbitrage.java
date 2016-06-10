package blackrocksprint;

import java.util.Scanner;

public class CurrencyArbitrage {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// int quotes = in.nextInt();
		// double dollarToEuro = in.nextInt();
		// double euroToGBP = in.nextInt();
		// double gbpToUSD = in.nextInt();
		
		int quotes = 2;
		double usdToEuro = 1.1837;
		double euroToGBP = 1.3829;
		double gbpToUSD = 0.6102;

		int i = 0;
		while (i < quotes) {
			// convert currency
			double startingAmount = 100000;
			double conversionResult = startingAmount / usdToEuro / euroToGBP / gbpToUSD;
			if (conversionResult > startingAmount) {
				// print out profit
				System.out.println((int) (conversionResult - startingAmount));
			} else {
				System.out.println(0);
			}
			i++;
		}
	}
}
