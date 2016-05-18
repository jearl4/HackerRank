package daysofcode;

import java.util.Scanner;

/**
 * task: Given an array of n size containing distinct elements a[0]...a[n-1],
 * sort array in ascending order using the Bubble Sort algorithm. Once
 * sorted, print the following lines:
 * numSwaps need to sort
 * first element in sorted array
 * last element in sort array 
 * 
 * @author Bruce Wayne
 *
 */

public class BubbleSort {
	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		int size = 3;//in.nextInt();
		int array[] = {3,2,1};//new int[size]
		int numberOfSwaps = 0;
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = 0; j < array.length-1; j++) {
				// swap
				if(array[j] > array[j+1]){
					int temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
					numberOfSwaps++;
				}
			}
			if (numberOfSwaps == 0) {
				break;
			}
			//totalSwaps++;
		}

		System.out.println("Array is sorted in " + numberOfSwaps + " swaps.");
		System.out.println("First Element: " + array[0]);
		System.out.println("Last Element: " + array[size-1]);
	}
}
