package worldcodesprint5;

import java.util.ArrayList;

/**
 * Amanda has a string,s , of m lowercase letters that she wants to copy into a
 * new string, p. She can perform the following operations any number of times
 * to construct string p: Append a character to the end of string p at a cost of
 * dollar. Choose any substring of p and append it to the end of p at no charge.
 * Given strings n find and print the minimum cost of copying each s to p on a
 * new line.
 * 
 * @author J.T. Earl
 *
 */

public class StringConstruction {
	public static void main(String[] args) {
		String s = "abcd";
		ArrayList<Character> unique = new ArrayList<Character>();

		// compare and increment count
		for (int i = 0; i < s.length(); i++) {
			if (!(unique.contains(s.charAt(i)))) {
				unique.add(s.charAt(i));
			}
		}

		// output answer
		System.out.println(unique.size());
	}
}
