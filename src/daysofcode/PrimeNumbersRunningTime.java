package daysofcode;

import java.util.Scanner;

/**
 * A prime is a natural number greater than that has no positive divisors other
 * than and itself. Given a number, n, determine and print whether it's prime or
 * not prime.
 * 
 * Note: If possible, try to come up with a O(square root(n)) primality
 * algorithm, or see what sort of optimizations you come up with for an O(n)
 * algorithm. Be sure to check out the Editorial after submitting your code!
 * 
 * @author J.T. Earl
 *
 */
public class PrimeNumbersRunningTime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTestCases = in.nextInt();
		for (int i = 0; i < numTestCases; i++) {
			System.out.println(isPrime(in.nextInt()) ? "Prime" : "Not prime");
		}
		in.close();
	}

	public static boolean isPrime(int number) {
		boolean prime = true;
		if (number == 1) {
			prime = false;
			return prime;
		}
		int bound = (int) Math.sqrt(number);
		for (int i = 2; i < bound; i++) {
			if (number % i == 0) {
				prime = false;
				return prime;
			}
		}
		return prime;
	}
}
