package weekOfCode21;

import java.util.Scanner;

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
