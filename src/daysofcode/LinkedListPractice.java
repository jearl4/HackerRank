package daysofcode;

import java.io.*;
import java.util.*;

/**
 * Task: Complete the insert function in your editor so that it creates a new
 * Node (pass as the Node constructor argument) and inserts it at the tail of
 * the linked list referenced by the parameter. Once the new node is added,
 * return the reference to the node.
 * 
 * @author J.T. Earl
 *
 */

class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}

}

class LinkedListPractice {
	// Create this method, everything above was given by Hacker Rank
	public static Node insert(Node head, int data) {
		Node newNode = new Node(data);
		if (head == null) {
			return newNode;
		} else if (head.next == null) {
			head.next = newNode;
		} else {
			insert(head.next, data);
		}
		
		return head;
	}

	// everything below was given by Hacker Rank
	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int T = sc.nextInt();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);

	}
}
