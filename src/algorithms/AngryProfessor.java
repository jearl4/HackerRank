package algorithms;

import java.util.Scanner;

/**
 * A Discrete Mathematics professor has a class of n students. Frustrated with
 * their lack of discipline, he decides to cancel class if fewer than k students
 * are present when class starts. Given the arrival time of each student,
 * determine if the class is canceled.
 * 
 * @author J.T. Earl
 *
 */
public class AngryProfessor {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numTestCases = in.nextInt();
		for (int i = 0; i < numTestCases; i++) {
			int totalNumberStudents = in.nextInt();
			int cancelationThreshold = in.nextInt();
			int studentArrival[] = new int[totalNumberStudents];
			int presentStudents = 0;
			for (int j = 0; j < totalNumberStudents; j++) {
				studentArrival[j] = in.nextInt();
				if (studentArrival[j] <= 0) {
					presentStudents++;
				}
			}
			if (presentStudents < cancelationThreshold) {
				System.out.println("YES"); // yes class is canceled
			} else {
				System.out.println("NO"); // no class is not canceled
			}
		}
		in.close();
	}
}
