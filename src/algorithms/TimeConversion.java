package algorithms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat leadingZeroFormatter = new DecimalFormat("00");
		// String time = in.next();
		String time = "07:05:45AM"; // Testing without Scanner

		String amOrPm = time.substring(8); // is time AM or PM?
		String seconds = time.substring(6, 8); // grab seconds
		String minutes = time.substring(3, 5); // grab minutes
		int hours = Integer.parseInt(time.substring(0, 2)); // grab hours and parse to integer
		
		if (amOrPm.equalsIgnoreCase("AM")) {
			System.out.println(leadingZeroFormatter.format(hours) + ":" + minutes + ":" + seconds);
		} else { // time is PM
			System.out.println((hours + 12) + ":" + minutes + ":" + seconds);
		}
	}
}
