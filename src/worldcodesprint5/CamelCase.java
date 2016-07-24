package worldcodesprint5;

/**
 * Alice wrote a sequence of words in CamelCase as a string of letters, , having
 * the following properties: It is a concatenation of one or more words
 * consisting of English letters. Allletters in the first word are lowercase.
 * For each of the subsequent words, the first letter is uppercase and rest of
 * the letters are lowercase. Given s, print the number of words in s on a new
 * line.
 * 
 * Hacker Rank challenge takes system input not a static string. Passes all test
 * cases.
 * 
 * @author J.T. Earl
 *
 */

public class CamelCase {
	public static void main(String[] args) {
		String s = "saveChangesInTheEditor";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}
		System.out.println(count + 1);
	}
}
