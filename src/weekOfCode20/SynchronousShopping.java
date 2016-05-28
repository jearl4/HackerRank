package weekOfCode20;

/**
 * 
 * @author J.T. Earl
 *
 */

// handles creation of new shops
class Node {
	int numFish;
	int[] typesFish;
	Node next;

	public Node(int numFish, int[] typesFish) {
		this.numFish = numFish;
		this.typesFish = typesFish;
		this.next = null;
	}
}

class SynchronousShopping {

	public static Node insert(Node head, int numFish, int[] typesFish) {
		Node p = new Node(numFish, null);
		if (head == null)
			head = p;
		else if (head.next == null)
			head.next = p;
		else {
			Node start = head;
			while (start.next != null)
				start = start.next;
			start.next = p;

		}
		return head;
	}

}
