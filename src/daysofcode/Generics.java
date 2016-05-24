package daysofcode;

/**
 * Write a single generic function named printArray; this function must take an
 * array of generic elements as a parameter (the exception to this is C++, which
 * takes a vector). The locked Solution class in your editor tests your
 * function.
 * 
 * Note: You must use generics to solve this challenge. Do not write overloaded
 * functions.
 * 
 * 
 * @author J.T. Earl
 *
 */

public class Generics {
	public static <T> void printArray(T[] array){
		for (T element : array) {
			System.out.println(element);
		}
	}
	/**
	 * premade HackerRank method
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Integer[] intArray = { 1, 2, 3 };
		String[] stringArray = { "Hello", "World" };

		printArray(intArray);
		printArray(stringArray);

		if (Solution.class.getDeclaredMethods().length > 2) {
			System.out.println("You should only have 1 method named printArray.");
		}
	}
}
