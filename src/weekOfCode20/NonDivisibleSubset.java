package weekOfCode20;

import java.util.ArrayList;
import java.util.LinkedList;

public class NonDivisibleSubset {
	public static void main(String[] args) {
		int k = 3;
		int a[] = { 5, 7, 2, 4, 1, 1 };
		System.out.println(nonDivisiblePairs(a, k));
	}

	public static int nonDivisiblePairs(int[] listOfNumbers, int divisor) {
		ArrayList<Integer> subPair = new ArrayList<Integer>();
		LinkedList<Integer> stackOfNumbers = new LinkedList<Integer>();
		for (int i = 0; i < listOfNumbers.length; i++) {
			stackOfNumbers.add(listOfNumbers[i]);
		}
		subPair.add(stackOfNumbers.removeFirst());
		while (stackOfNumbers.isEmpty() != true) {
			int possibleNumber = stackOfNumbers.peek();
			int sum = possibleNumber + subPair.get(subPair.size() - 1);
			if (sum % divisor != 0) {
				subPair.add(stackOfNumbers.removeFirst());
			} else {
				stackOfNumbers.removeFirst();
			}
		}
		return subPair.size();
	}

}
