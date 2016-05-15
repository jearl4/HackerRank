package daysofcode;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * To solve this challenge, we must first take each character in s, enqueue it
 * in a queue, and also push that same character onto a stack. Once that's done,
 * we must dequeue the first character from the queue and pop the top character
 * off the stack, then compare the two characters to see if they are the same;
 * as long as the characters match, we continue dequeueing, popping, and
 * comparing each character until our containers are empty (a non-match means s
 * isn't a palindrome).
 * 
 * 
 * @author J.T. Earl
 *
 */

public class QueuesAndStacks {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Palindrome p = new Palindrome();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare
		// them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length / 2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		// Finally, print whether string s is palindrome or not.
		System.out.println("The word, " + input + ", is " + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
	}
}

class Palindrome {
	private LinkedList<Character> queue = new LinkedList<>();
	private LinkedList<Character> stack = new LinkedList<>();
	char stackCharacter;
	char queueCharacter;
	
	public void pushCharacter(char ch){
		stack.push(ch);
	}
	public void enqueueCharacter(char ch){
		queue.addLast(ch);
	}
	
	public char popCharacter(){
		stackCharacter = stack.pop();
		return stackCharacter;
	}
	
	public char dequeueCharacter(){
		queueCharacter = queue.remove(0);
		return queueCharacter;
	}
}
