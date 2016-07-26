package rookie.rank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Colleen is turning n years old! She has candles of various heights on her
 * cake, and candle i has height Hi. Because the taller candles tower over the
 * shorter ones, Colleen can only blow out the tallest candles.
 * 
 * Given the Hi for each individual candle, find and print the number of candles
 * she can successfully blow out.
 * 
 * Passed all Hacker Rank test cases. Replaced system input with hard coded
 * variables.
 * 
 * @author J.T. Earl
 *
 */

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		int numberCandles = 4;
		int[] candles = { 3, 2, 1, 3 };
		int count = 0;
		Arrays.sort(candles);
		for (int i = 0; i < candles.length; i++) {
			if (candles[i] >= candles[numberCandles - 1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
