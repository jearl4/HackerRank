package algorithms;

import java.util.Scanner;

public class Pangrams {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		String input = "We promptly judged antique ivory buckles for the next prize";
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		int j = 0;
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == alphabet.charAt(j)) {
				count++;
			}
		}
		if (count == 26) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
	}
}
