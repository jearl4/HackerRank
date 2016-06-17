package algorithms;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 * Given the nth and (n+1)th terms, the (n+2)th can be computed by the following
 * relation Tn+2 = (Tn+1)2 + Tn
 * 
 * So, if the first two terms of the series are 0 and 1: the third term = 1^2 +
 * 0 = 1 fourth term = 1^2 + 1 = 2 fifth term = 2^2 + 1 = 5 ... And so on.
 * 
 * Given three integers A, B and N, such that the first two terms of the series
 * (1st and 2nd terms) are A and B respectively, compute the Nth term of the
 * series.
 * 
 * 
 * @author J.T. Earl
 *
 */
public class FibonacciModified {

	static Hashtable<Integer, Integer> numbersTable = new Hashtable<Integer, Integer>();

	public static void main(String[] args) {
		/**
		 * For taking input on Hacker Rank 
		 * 
		 * Scanner in = new Scanner(System.in);
		 * int firstNumber = in.nextInt(); 
		 * int secondNumber = in.nextInt(); 
		 * int nthNumber = in.nextInt();
		 */
		
		int firstNumber = 0;
		int secondNumber = 1;
		int nthNumber = 5;
		
		numbersTable.put(firstNumber, firstNumber);
		numbersTable.put(secondNumber, secondNumber);
		System.out.println(fib(nthNumber));
	}

	private static int fib(int num) {
		if (!numbersTable.containsKey(num)) {
			//numbersMap.put(num, fib(num - 1) + fib(num - 2));
			numbersTable.put(num, fib((int) Math.sqrt(num)) + fib(num));
		}
		return numbersTable.get(num);
	}
}
