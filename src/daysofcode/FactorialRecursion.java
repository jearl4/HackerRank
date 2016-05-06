package daysofcode;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number >= 2) {
			System.out.println(factorial(number));
		}

	}

	public static int factorial(int number) {
		if (number <= 1) { // base case
			return 1;
		} else {
			return number * factorial(number - 1);
		}
	}

}
