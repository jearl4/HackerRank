package algorithms;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Task: Given an array of integers, calculate which fraction of its elements
 * are positive, which fraction of its elements are negative, and which fraction
 * of its elements are zeroes, respectively. Print the decimal value of each
 * fraction on a new line.
 * 
 * @author J.T. Earl
 *
 */
public class PlusMinus {

	public static void main(String[] args) {
		// create fields
		Scanner in = new Scanner(System.in);
		double totalPositive = 0.0;
		double totalNegative = 0.0;
		double totalZero = 0.0;

		int size = in.nextInt(); // get array size
		int array[] = new int[size];
		// add elements to array
		for (int arr_i = 0; arr_i < size; arr_i++) {
			array[arr_i] = in.nextInt();
			if (array[i] > 0) {
				totalPositive++;
			} else if (array[i] < 0) {
				totalNegative++;
			} else {
				totalZero++;
			}
		}
		// for (int i = 0; i < array.length; i++) {
		//
		// }
	}

}
