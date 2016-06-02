package algorithms;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

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
	
	static Map<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
	
	public static void main (String[] args){
		numbersMap.put(0, 0);
		numbersMap.put(1, 1);
		System.out.println(fib(3));
	}
	
	private static int fib(int num){
		if(!numbersMap.containsKey(num)){
			numbersMap.put(num, fib(num-1) + fib(num-2));
		}
		return numbersMap.get(num);
	}
}
