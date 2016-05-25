package weekOfCode20;

import java.util.Scanner;

/**
 * You are given an array of integers, 0 to n-1 , and a positive integer, k.
 * Find and print the number of pairs where i<j and ai+aj is evenly divisible by
 * k.
 * 6 3
	1 3 2 6 1 2
	5
	1+2, 1+2, 3+6, 2+1, 1+2
 * 
 * @author J.T. Earl
 *
 */
public class DivisibleSumPairs {
	    public static void main(String[] args) {
	        int k = 3;
	        int a[] = {1,3,2,6,1,2};
	        System.out.println(divisiblePairs(a,k));
	    }
	    public static int divisiblePairs(int[] listOfNumbers, int divisor){
	    	int numberPairs = 0;
	    	for (int i = 0; i < listOfNumbers.length-1; i++) {
				for (int j = i + 1; j < listOfNumbers.length; j++) {
					int pairSum = listOfNumbers[i] + listOfNumbers[j];
					if(pairSum % divisor == 0) 
						numberPairs++;
				}
			}
	    	return numberPairs;
	}

}
