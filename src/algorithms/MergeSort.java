package algorithms;

import java.util.Random;

/**
 * Implementation of the merge sort in C.L.R.S. book. Takes O(n log n) time and
 * uses divide and conquer to sort an array.
 * 
 * @author J.T. Earl
 *
 */

public class MergeSort {

	public static void main(String[] args) {
		// Random rand = new Random();
		int[] array = { 4, 3, 2, 1, 0 };
		// fill array with random numbers 0-9
		// for (int i = 0; i < array.length; i++) {
		// array[i] = rand.nextInt(10);
		// }

		// sort array
		mergeSort(array, 0, array.length);

		// print sorted array
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + " ");
		}
	}

	/**
	 * Assumes that subarrays [leftPoint..midPoint] and [midPoint+1..rightPoint]
	 * are in sorted order. leftPoint, midPoint, rightPoint are indices into the
	 * array such that leftPoint <= midPoint < rightPoint
	 * 
	 * @param array
	 * @param leftPoint
	 * @param midPoint
	 * @param rightPoint
	 * @return
	 */
	private static void merge(int[] array, int leftPoint, int midPoint, int rightPoint) {
		int leftSize = midPoint - leftPoint;
		int rightSize = rightPoint - midPoint;

		// create left and right subarrays, add one to hold sentinel values
		int[] leftArray = new int[leftSize + 1];
		int[] rightArray = new int[rightSize + 1];

		// fill subarrays
		for (int i = 0; i < leftSize; i++)
			leftArray[i] = array[leftPoint + i];
		for (int i = 0; i < rightSize; i++)
			rightArray[i] = array[midPoint + i];

		// assign sentinel values
		leftArray[leftSize] = Integer.MAX_VALUE;
		rightArray[rightSize] = Integer.MAX_VALUE;

		// merge
		int i = 0, j = 0;
		for (int k = leftPoint; k < rightPoint; k++) {
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i += 1;
			} else {
				array[k] = rightArray[j];
				j += 1;
			}
		}
	}

	private static int[] mergeSort(int[] array, int left, int right) {
		if (left < right) {
			int middle = (int) Math.floor((left + right) / 2);
			mergeSort(array, left, middle);
			mergeSort(array, middle + 1, right);
			merge(array, left, middle, right);
		}
		return array;
	}
}
