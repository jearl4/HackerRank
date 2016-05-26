package daysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * A level-order traversal, also known as a breadth-first search, visits each
 * level of a tree's nodes from left to right, top to bottom. You are given a
 * pointer, root, pointing to the root of a binary search tree. Complete the
 * levelOrder function provided in your editor so that it prints the level-order
 * traversal of the binary search tree.
 * 
 * @author J.T. Earl
 *
 */

class Node3 {
	Node3 left, right;
	int data;

	Node3(int data) {
		this.data = data;
		left = right = null;
	}
}

class BSTLevelOrderTraversal {
	// finish this method, the rest is premade Hacker Rank code
	static void levelOrder(Node3 root) {
		Queue<Node3> queue = new LinkedList<Node3>();
		if (root != null) {
			queue.add(root);
		}
		visit(queue);
		System.out.println();
	}

	// another class to be completed not provided by Hacker Rank
	public static void visit(Queue<Node3> queue) {
		int startingQueueSize = queue.size();

		for (int i = 0; i < startingQueueSize; i++) {
			Node3 node = queue.remove();
			System.out.print(node.data + " ");
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}

		if (queue.size() > 0) {
			visit(queue);
		}
	}

	public static Node3 insert(Node3 root, int data) {
		if (root == null) {
			return new Node3(data);
		} else {
			Node3 cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node3 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
}