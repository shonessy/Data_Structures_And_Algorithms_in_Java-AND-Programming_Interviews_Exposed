
public class Node {
	private int data;
	public Node leftChild;
	public Node rightChild;
	
	public Node(int d) {
		this.data = d;
		this.leftChild = null;
		this.rightChild = null;
	}
	
	public int getData() {
		return this.data;
	}

}
