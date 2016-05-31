package algorithms;

import java.util.Scanner;

/**
 * Shashank likes strings in which consecutive characters are different. For
 * example, he likes ABABA, while he doesn't like ABAA. Given a string
 * containing characters and only, he wants to change it into a string he likes.
 * To do this, he is allowed to delete the characters in the string.
 * 
 * Your task is to find the minimum number of required deletions.
 * 
 * Input Format
 * 
 * The first line contains an integer , i.e. the number of test cases. The next
 * lines contain a string each.
 * 
 * Output Format
 * 
 * For each test case, print the minimum number of deletions required.
 * 
 * @author J.T. Earl
 *
 */

public class AlternatingCharacters {

	public static int countDeletions(String s) {
		int count = 0, index = 0;
		for (int i = 1; i < s.length(); i++) {
			System.out.println(s.charAt(i));
			if (s.charAt(i) == s.charAt(index)) {
				count++;
			} else {
				index = i;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		String[] input = new String[testCases];
		for (int i = 0; i < testCases; i++) {
			input[i] = in.nextLine();
		}
		for (int i = 0; i < testCases; i++) {
			System.out.println(countDeletions(input[i]));
		}
	}
}
