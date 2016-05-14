package algorithms;

import java.util.Scanner;

public class Hourglass2DArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[6][6];
		for (int arr_i = 0; arr_i < 6; arr_i++) {
			for (int arr_j = 0; arr_j < 6; arr_j++) {
				arr[arr_i][arr_j] = in.nextInt();
			}
		}
		calculateSum(arr);
	}

	/**
	 * loop through hour glass sums and out put the largest sum
	 * 
	 * @param array
	 */
	private static void calculateSum(int[][] array) {
		int sum = Integer.MIN_VALUE;
		int tempSum = Integer.MAX_VALUE;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				tempSum = array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j] + array[i + 2][j]
						+ array[i + 2][j + 1] + array[i + 2][j + 2];
				if (tempSum > sum) {
					sum = tempSum;
				}
			}
		}

		System.out.println(sum);
	}
}
