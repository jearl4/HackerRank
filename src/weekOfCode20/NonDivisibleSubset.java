package weekOfCode20;

import java.util.ArrayList;
import java.util.Arrays;

public class NonDivisibleSubset {
	public static void main(String[] args) {
		int k = 2;
		int a[] = { 1, 2, 3, 4, 5 };
		// Arrays.sort(a);
		System.out.println(nonDivisiblePairs(a, k));
	}

	public static int nonDivisiblePairs(int[] listOfNumbers, int divisor) {
		if (divisor == 0 || divisor == 1) { // can't divide by 0
			return 0;
		}
		ArrayList<Integer> subPair = new ArrayList<Integer>();

		// add numbers to linked list
		for (int i = 0; i < listOfNumbers.length; i++) {
			subPair.add(listOfNumbers[i]);
		}
		// if empty list
		if (listOfNumbers.length == 0) {
			return 0;
		}

		// solve the problem
		for (int i = 0; i < subPair.size(); i++) {
			for (int j = i + 1; j < subPair.size(); j++) {
				int modI = subPair.get(i) % divisor;
				int modJ = subPair.get(j) % divisor;
				if ((modI + modJ) % divisor == 0) {
					subPair.remove(j);
				}
			}
		}
		if (subPair.size() == 1) {
			return 0;
		} else {
			return subPair.size();
		}

	}
}
