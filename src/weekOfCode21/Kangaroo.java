package weekOfCode21;

import java.util.Scanner;

/**
 * There are two kangaroos on an x-axis ready to jump in the positive direction
 * (i.e, toward positive infinity). The first kangaroo starts at location x1 and
 * moves at a rate of v1 meters per jump. The second kangaroo starts at location x2
 * and moves at a rate of v2 meters per jump. Given the starting locations and
 * movement rates for each kangaroo, can you determine if they'll ever land at
 * the same location at the same time?
 * 
 * @author J.T. Earl
 *
 */
public class Kangaroo {
	public static void main(String[] args) {
		/*
		 * for Hacker Rank input Scanner in = new Scanner(System.in); int x1 =
		 * in.nextInt(); int v1 = in.nextInt(); int x2 = in.nextInt(); int v2 =
		 * in.nextInt();
		 */
		int x1 = 0;
		int v1 = 2;
		int x2 = 5;
		int v2 = 3;

		calculateJumps(x1, v1, x2, v2);
	}

	public static void calculateJumps(int x1, int v1, int x2, int v2) {
		if (x2 >= x1 && v2 > v1) {
			System.out.println("NO");
		} else if (x1 >= x2 && v1 > v2) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}
