package weekOfCode20;

import java.util.ArrayList;
import java.util.Arrays;

public class NonDivisibleSubset {
	public static void main(String[] args) {
		int k = 3;
		int a[] = { 3, 7, 2, 4 };
		Arrays.sort(a);
		System.out.println(nonDivisiblePairs(a, k));
	}

	public static int nonDivisiblePairs(int[] listOfNumbers, int divisor) {
		if (divisor == 0) { // can't divide by 0
			return 0;
		}
		if (divisor == 1) {
			return 1;
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
			if (subPair.get(i) % divisor == 0) {
				i++;
			}
			for (int j = i + 1; j < subPair.size(); j++) {
				int modI = subPair.get(i) % divisor;
				int modJ = subPair.get(j) % divisor;
				if ((modI + modJ) % divisor == 0) {
					subPair.remove(j);
				}
			}
		}
		if (subPair.size() == 1) {
			return 1;
		} else {
			return subPair.size();
		}

	}
}
