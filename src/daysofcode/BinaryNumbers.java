package daysofcode;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> binary = new ArrayList<Integer>();
		int convertMe = sc.nextInt();
		toBinary(convertMe, binary);
		getConsecNumbers(binary);
	}

	private static void toBinary(int convert, ArrayList<Integer> binary) {
		while (convert > 0) {
			int remainder = convert % 2;
			convert = convert / 2;
			binary.add(remainder);
		}
	}

	private static void getConsecNumbers(ArrayList<Integer> binary) {
		int consecutiveOnes = 0;
		int temp = 0;
		for (int i = binary.size() - 1; i >= 0; i--) {
			if (binary.get(i) == 1) {
				++temp;
			} else {
				if (temp > consecutiveOnes)
					consecutiveOnes = temp;
				temp = 0;
			}
		}
		if (consecutiveOnes > temp) {
			System.out.println(consecutiveOnes);
		} else {
			System.out.println(temp);
		}
	}

}
