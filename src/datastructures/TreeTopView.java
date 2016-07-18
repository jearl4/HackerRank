package datastructures;

/**
 * You are given a pointer to the root of a binary tree. Print the top view of
 * the binary tree. You only have to complete the function.
 * 
 * @author J.T. Earl
 *
 */

public class TreeTopView {
	// Node class as defined by Hacker Rank problem
	@SuppressWarnings("unused")
	private class Node {
		int data;
		Node left;
		Node right;
	}

	@SuppressWarnings("unused")
	private void top_view(Node root) {
		if (root == null) {
			return;
		} else {
			topViewLeft(root.left);
			System.out.println(root.data);
			topViewRight(root.right);
		}
	}

	private void topViewLeft(Node root) {
		if (root == null) {
			return;
		} else {
			topViewLeft(root.left);
			System.out.print(root.data + " ");
		}
	}

	private void topViewRight(Node root) {
		if (root == null) {
			return;
		} else {
			System.out.print(" " + root.data);
			topViewRight(root.right);
		}
	}
}
