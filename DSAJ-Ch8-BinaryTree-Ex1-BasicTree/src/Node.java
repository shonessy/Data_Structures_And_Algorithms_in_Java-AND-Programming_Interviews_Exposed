
public class Node {
	private Worker data;
	public Node leftChild;
	public Node rightChild;
	
	public Node(Worker d) {
		this.data = d;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	public Worker getData() {
		return this.data;
	}

}
