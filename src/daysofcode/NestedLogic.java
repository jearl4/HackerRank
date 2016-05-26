package daysofcode;

import java.util.Scanner;

public class NestedLogic {
	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		int dayReturned = 2;// in.nextInt();
		int monthReturned = 6;// in.nextInt();
		int yearReturned = 2014;// in.nextInt();
		int dayExpected = 5;// in.nextInt();
		int monthExpected = 7;// in.nextInt();
		int yearExpected = 2014;// in.nextInt();
		// in.close();

		int dayFine = 0;
		int monthFine = 0;
		int yearFine = 0;

		int totalReturned = dayReturned + monthReturned + yearReturned;
		int totalExpected = dayExpected + monthExpected + yearExpected;

		if (totalReturned == totalExpected || totalReturned < totalExpected) {
			System.out.println(0);
			return;
		} else if (yearReturned != yearExpected) {
			yearFine = 10000;
		} else if (monthReturned != monthExpected) {
			monthFine = (monthReturned - monthExpected) * 500;
		} else if (dayReturned != dayExpected) {
			dayFine = (dayReturned - dayExpected) * 15;
		}
		System.out.println(dayFine + monthFine + yearFine);
	}
}
