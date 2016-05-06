package daysofcode;

import java.util.*;
import java.io.*;

public class Day8Dictionary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int phonebookSize = in.nextInt();
		Map<String, Integer> phonebook = new HashMap<String, Integer>();
		// Add contacts to phone book
		for (int i = 0; i < phonebookSize; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// push contact to map
			phonebook.put(name, phone);
		}
		while (in.hasNext()) {
			String name = in.next();
			if (phonebook.get(name) == null) {
				System.out.println("Not found");
			} else {
				System.out.println(name + "=" + phonebook.get(name));
			}
		}
		in.close();
	}

}
