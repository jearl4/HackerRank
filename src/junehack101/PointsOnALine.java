package junehack101;

import java.util.Scanner;

/**
 * Given n two-dimensional points in space, determine whether they lie on some
 * vertical or horizontal line. If yes, print YES; otherwise, print NO.
 * 
 * @author J.T. Earl
 *
 */
public class PointsOnALine {
	public static void main(String[] args) {
		// hacker rank input

		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		int[] x = new int[tests];
		int[] y = new int[tests];

		for (int i = 0; i < tests; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}

		/*
		 * // test cases without using scanner int[] x = { 1, 0, 0, 0, 0 };
		 * int[] y = { 1, 2, 3, 4, 5 };
		 */

		if (sameElements(x) == true || sameElements(y) == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}

	public static boolean sameElements(int[] array) {
		if (array.length == 0) {
			return true;
		} else {
			int first = array[0];
			for (int element : array) {
				if (element != first) {
					return false;
				}
			}
			return true;
		}
	}
}
