package daysofcode;

import java.util.Scanner;

/**
 * The height of a binary search tree is the number of edges between the tree's
 * root and its furthest leaf. You are given a pointer, root, pointing to the
 * root of a binary search tree. Complete the getHeight function provided in
 * your editor so that it returns the height of the binary search tree.
 * 
 * @author J.T. Earl
 *
 */
class Node2 {
	Node2 left, right;
	int data;

	Node2(int data) {
		this.data = data;
		left = right = null;
	}
}

class BinarySearchTree {
	/**
	 * build this method, the rest is premade by Hacker Rank
	 * 
	 * @param root
	 * @return
	 */
	public static int getHeight(Node2 root) {
		// Write your code here
		if (root.right != null || root.left != null) {
			return 1 + Math.max(getHeight(root), getHeight(root));
		} else {
			return 0;
		}
	}

	public static Node2 insert(Node2 root, int data) {
		if (root == null) {
			return new Node2(data);
		} else {
			Node2 cur;
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
		Node2 root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
	}
}
