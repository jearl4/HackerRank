package algorithms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat leadingZeroFormatter = new DecimalFormat("00");
		// String time = in.next();
		// in.close();
		String time = "12:05:45AM"; // Testing without Scanner

		String amOrPm = time.substring(8); // is time AM or PM?
		String seconds = time.substring(6, 8); // grab seconds
		String minutes = time.substring(3, 5); // grab minutes
		int hours = Integer.parseInt(time.substring(0, 2)); // grab hours and parse to integer

		if (hours == 12 && amOrPm.equalsIgnoreCase("AM")) { // special midnight case
			System.out.println("00:" + minutes + ":" + seconds);
		} else if (hours == 12 && amOrPm.equalsIgnoreCase("PM")) {
			System.out.println(hours + ":" + minutes + ":" + seconds);
		} else if (amOrPm.equalsIgnoreCase("AM")) { // time is AM
			System.out.println(leadingZeroFormatter.format(hours) + ":" + minutes + ":" + seconds);
		} else { // Time is PM, add 12 hours
			System.out.println((hours + 12) + ":" + minutes + ":" + seconds);
		}
	}
}
