package algorithms;

import java.util.HashSet;
import java.util.Set;

public class Pangrams {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		String input = "We promptly judged antique ivory buckles for the prize";
		Pangrams p = new Pangrams(input);
		p.isPangram();
	}

	private final Set<Character> lettersNeeded = new HashSet<>();

	public Pangrams(String s) {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			lettersNeeded.add(ch);
		}
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			lettersNeeded.remove(s.charAt(i));
		}
	}

	public void isPangram() {
		if (lettersNeeded.isEmpty()) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}
	}
}
