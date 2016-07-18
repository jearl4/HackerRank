package datastructures;

/**
 * You are given a pointer to the root of a binary tree. Print the top view of
 * the binary tree. You only have to complete the function. 
 *    3
   /   \
  5     2
 / \   / \
1   4 6   7
 \       /
  9     8
 * the output would be 1 5 3 2 7 since from the top only these nodes would be visible.
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

	/**
	 * recursive function that handles calls topViewLeft, displays the root,
	 * then calls topViewRight.
	 * 
	 * @param root
	 */
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

	/**
	 * recursive function that moves from the bottom left of the BST up to the
	 * top of the tree. Outputs only the left elements of the tree, the elements
	 * that would be seen from a top down view of the tree.
	 * 
	 * @param root
	 */
	private void topViewLeft(Node root) {
		if (root == null) {
			return;
		} else {
			topViewLeft(root.left);
			System.out.print(root.data + " ");
		}
	}

	/**
	 * recursive function that moves from the bottom right of the BST up to the
	 * top of the tree. Outputs only the right elements of the tree, the
	 * elements that would be seen from a top down view of the tree.
	 * 
	 * @param root
	 */
	private void topViewRight(Node root) {
		if (root == null) {
			return;
		} else {
			System.out.print(" " + root.data);
			topViewRight(root.right);
		}
	}
}
