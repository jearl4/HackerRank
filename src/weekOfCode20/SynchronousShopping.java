package weekOfCode20;

/**
 * 
 * @author J.T. Earl
 *
 */

// handles creation of new shops
class WeightedGraph {
	private int[][] edges;
	private Object[] labels;

	public WeightedGraph(int numberOfNodes) {
		edges = new int[numberOfNodes][numberOfNodes];
		labels = new Object[numberOfNodes];
	}

	public int getSize() {
		return labels.length;
	}

	/**
	 * set name of vertex
	 * 
	 * @param vertex
	 * @param label
	 */
	public void setLabel(int vertex, Object label) {
		labels[vertex] = label;
	}

	/**
	 * 
	 * @param vertex
	 * @return name of vertex
	 */
	public Object getLabel(int vertex) {
		return labels[vertex];
	}

	public void addEdge(int source, int target, int weight) {
		edges[source][target] = weight;
	}

	/**
	 * @param source
	 * @param target
	 * @return true if value greater than 0 (edge exists)
	 */
	public boolean isEdge(int source, int target) {
		return edges[source][target] > 0;
	}

	/**
	 * 
	 * @param source
	 * @param target
	 * @return value of edge
	 */
	public int getWeight(int source, int target) {
		return edges[source][target];
	}

	/**
	 * @param vertex
	 * @return array of nodes that are neighbors to vertex param
	 */
	public int[] neighbors(int vertex) {
		int count = 0;
		for (int i = 0; i < edges[vertex].length; i++) {
			if (edges[vertex][i] > 0) {
				count++;
			}
		}
		final int[] neighborNodes = new int[count];
		count = 0;
		for (int i = 0; i < edges[vertex].length; i++) {
			if (this.getWeight(vertex, i) > 0) {
				neighborNodes[count++] = i;
			}
		}
		return neighborNodes;
	}

	/**
	 * prints out vertex name and any neighbors names and locations
	 */
	public void print() {
		for (int i = 0; i < edges.length; i++) {
			System.out.println("\n--NEW VERTEX--");
			System.out.print(labels[i] + " ");
			for (int j = 0; j < edges[i].length; j++) {
				if (edges[i][j] > 0) {
					System.out.println("\t-->" + labels[j] + ": " + edges[i][j] + " ");
				}
			}
		}
	}

}

class SynchronousShopping {
	public static void main(String[] args) {
		final WeightedGraph t = new WeightedGraph(5);
		t.setLabel(0, "v0");
		t.setLabel(1, "v1");
		t.setLabel(2, "v2");
		t.setLabel(3, "v3");
		t.setLabel(4, "v4");
		
		t.addEdge(0, 1, 2);
		t.addEdge(1, 2, 8);
		t.addEdge(1, 3, 15);
		t.addEdge(2, 3, 1);
		t.addEdge(4, 3, 3);
		t.addEdge(4, 2, 7);

		t.print();
	}
}
