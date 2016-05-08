// Task: Calculate the hourglass sum for every hourglass in a 2-D array, then print the maximum hourglass sum.


package daysofcode;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[6][6]; // create 6x6 2-D array
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
		getSum(arr);
	}

	public static void getSum(int[][] array) {
		int[] sum = new int[16]; // holds values of each hour glass sum
		int index = 0; // moves through array of sums
		for (int i = 0; i < 4; i++) { // get hour glass array and add values to sum
			for (int j = 0; j < 4; j++) {
				sum[index] = array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j + 1] + array[i + 2][j]
						+ array[i + 2][j + 1] + array[i + 2][j + 2];
				index++;
			}
		}
		// get highest sum
		Arrays.sort(sum); // n(log(n)) time
		System.out.println(sum[15]);
	}
}
