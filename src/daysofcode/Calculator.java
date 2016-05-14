package daysofcode;

import java.util.Scanner;

/**
 * Write a Calculator class with a single method: int power(int n,int p). The
 * power method takes two integers, n and p, as parameters and returns the
 * integer result of n to the power of p. If either n or p is negative, then the
 * method must throw an exception with the message: n and p should be
 * non-negative.
 * 
 * @author J.T. Earl
 *
 */
class Calculator {
	public int power(int n, int p) throws Exception {
		if (n < 0 || p < 0) {
			throw new Exception("n and p should be non-negative");
		}

		return (int) Math.pow(n, p);

	}
}

// pre-made Hacker Rank code
class Solution {

	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
