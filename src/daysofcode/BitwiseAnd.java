package daysofcode;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * final day of 30 days of code! Given set S={1,2,3...,N}. Find two integers, A
 * and B (where A < B ), from set S such that the value of A&B is the maximum
 * possible and also less than a given integer, K. In this case, & represents
 * the bitwise AND operator.
 * 
 * @author J.T. Earl
 *
 */
public class BitwiseAnd {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			if ((k | (k - 1)) > n)
				System.out.println(k - 2);
			else
				System.out.println(k - 1);
		}
	}
}
