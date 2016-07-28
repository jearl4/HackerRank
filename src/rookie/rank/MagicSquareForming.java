package rookie.rank;

import java.util.Arrays;

/**
 * Consider a 3x3 matrix, s, of integers in the inclusive range [1, 9]. Any
 * digit, a, can be changed to any other digit, b, in the range [1, 9] at cost
 * |a - b|.
 * 
 * Given matrix s, convert it into a magic square by changing zero, one, or more
 * of the digits in s. You must do this in such a way that the cost is minimal
 * and then print the minimum possible cost on a new line.
 * 
 * Note: The resulting magic square must contain distinct integers in the
 * inclusive range [1, 9].
 * 
 * Brute force approach. Passed all Hacker Rank test cases.
 * 
 * @author J.T. Earl
 *
 */
public class MagicSquareForming {

	public static void main(String[] args) {

		int[] sums = new int[8];

		int[][] inputSquare = { { 3, 9, 2 }, { 3, 5, 7 }, { 8, 1, 5 } };

		// only 8 possible magic square combinations
		int[][] square1 = { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } };
		int[][] square2 = { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } };
		int[][] square3 = { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } };
		int[][] square4 = { { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } };
		int[][] square5 = { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } };
		int[][] square6 = { { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } };
		int[][] square7 = { { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } };
		int[][] square8 = { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } };

		for (int i = 0; i < inputSquare.length; i++) {
			for (int j = 0; j < inputSquare.length; j++) {
				if (inputSquare[i][j] != square1[i][j]) {
					sums[0] += Math.abs(square1[i][j] - inputSquare[i][j]);
				}
				if (inputSquare[i][j] != square2[i][j]) {
					sums[1] += Math.abs(square2[i][j] - inputSquare[i][j]);
				}
				if (inputSquare[i][j] != square3[i][j]) {
					sums[2] += Math.abs(square3[i][j] - inputSquare[i][j]);
				}
				if (inputSquare[i][j] != square4[i][j]) {
					sums[3] += Math.abs(square4[i][j] - inputSquare[i][j]);
				}
				if (inputSquare[i][j] != square5[i][j]) {
					sums[4] += Math.abs(square5[i][j] - inputSquare[i][j]);
				}
				if (inputSquare[i][j] != square6[i][j]) {
					sums[5] += Math.abs(square6[i][j] - inputSquare[i][j]);
				}
				if (inputSquare[i][j] != square7[i][j]) {
					sums[6] += Math.abs(square7[i][j] - inputSquare[i][j]);
				}
				if (inputSquare[i][j] != square8[i][j]) {
					sums[7] += Math.abs(square8[i][j] - inputSquare[i][j]);
				}
			}
		}

		Arrays.sort(sums);
		System.out.println(sums[0]);
	}
}
