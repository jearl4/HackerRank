package algorithms;

/**
 * Implementation of the merge sort in C.L.R.S. book. Takes O(n log n) time and
 * uses divide and conquer to sort an array.
 * 
 * @author J.T. Earl
 *
 */

public class MergeSort {

	public static void main(String[] args) {

	}

	/**
	 * Assumes that subarrays [p..q] and [q+1..r] are in sorted order. p, q, r
	 * are indices into the array such that p <= q < r
	 * 
	 * @param array
	 * @param p
	 * @param q
	 * @param r
	 * @return
	 */
	private static int[] merge(int[] array, int p, int q, int r) {
		int a = q - p + 1;
		int b = r - q;

		int[] leftArray = new int[a + 1];
		int[] rightArray = new int[b + 1];

		for (int i = 0; i < a; i++) {
			leftArray[i] = array[p + i - 1];
		}

		for (int i = 0; i < b; i++) {
			rightArray[i] = array[q + i];
		}
		// assign sentinel values
		leftArray[a + 1] = Integer.MAX_VALUE;
		rightArray[b + 1] = Integer.MAX_VALUE;

		int i = 1, j = 1;
		for (int k = p; k < r; k++) {
			if (leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i += 1;
			} else {
				array[k] = rightArray[j];
				j += 1;
			}
		}
	}
}
