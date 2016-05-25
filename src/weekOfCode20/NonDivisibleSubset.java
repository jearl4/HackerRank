package weekOfCode20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class NonDivisibleSubset {
	public static void main(String[] args) {
		int k = 5;
		int a[] = { 1, 7, 2, 4, 5, 1 };
		Arrays.sort(a);
		System.out.println(nonDivisiblePairs(a, k));
	}

	public static int nonDivisiblePairs(int[] listOfNumbers, int divisor) {
		if (divisor == 0) { // can't divide by 0
			return 0;
		}
		ArrayList<Integer> subPair = new ArrayList<Integer>();
		LinkedList<Integer> queueOfNumbers = new LinkedList<Integer>();

		// add numbers to linked list
		for (int i = 0; i < listOfNumbers.length; i++) {
			queueOfNumbers.add(listOfNumbers[i]);
		}
		// if empty list
		if (listOfNumbers.length == 0) {
			return 0;
		}

		subPair.add(queueOfNumbers.removeFirst());

		while (queueOfNumbers.isEmpty() != true) {
			for (int i = 0; i < queueOfNumbers.size(); i++) {
				int possibleNumber = queueOfNumbers.peek();
				int sum = 0;
				sum = possibleNumber + subPair.get(subPair.size() - 1);
				if (sum % divisor != 0) {
					subPair.add(queueOfNumbers.removeFirst());
				} else {
					queueOfNumbers.removeFirst();
				}
			}
		}
		return subPair.size();
	}
}
