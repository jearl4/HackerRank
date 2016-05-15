package daysofcode;

import java.util.Scanner;

//Complete the Difference class by writing the following:
//A class constructor that takes an array of integers as a parameter and saves it to the elements instance variable.
//A computeDifference method that finds the maximum absolute difference between any 2 numbers in N 
//and stores it in the maxDifferencemaxDifference instance variable.

public class Scope {
	private int[] elements;
	public int maximumDifference;

	public Scope(int[] elements) {
		this.elements = elements;
	}

	public int computeDifference() {
		for (int i = 0; i < elements.length; i++) {
			for (int j = 0; j < elements.length; j++) {
				int temporaryMax = Math.abs(elements[i] - elements[j]);
				if (temporaryMax > maximumDifference) {
					maximumDifference = temporaryMax;
				}
			}
		}
		return maximumDifference;
	}
}

// Hacker Rank premade solution class
class Solve {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
		}

		Scope D = new Scope(a);

		D.computeDifference();

		System.out.print(D.maximumDifference);
	}
}