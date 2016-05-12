package algorithms;

import java.util.Scanner;
/**
 * Print a staircase of height NN that consists of # symbols and spaces. 
 * For example for N=6, here's a staircase of that height:
 *      #
 *     ##
 *    ###
 *   ####
 *  #####
 * ######
 *
 * @author J.T. Earl
 *
 */
public class Staircase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		sc.close();
		// int size = 6; // For debugging without scanner

		for (int i = 0; i < size; i++) {
			for (int j = 1; j <= size; j++) {
				if (j >= size - i) {
					System.out.print("#");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
