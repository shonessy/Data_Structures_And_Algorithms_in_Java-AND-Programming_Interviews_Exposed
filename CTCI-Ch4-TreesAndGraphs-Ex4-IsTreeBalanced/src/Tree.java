import java.util.Stack;

public class Tree {
	public Node root;
	
	public Tree() {
		this.root = null;
	}
	
	public void insert(int key) {
		if(this.isEmpty()) {
			this.root = new Node(key);
			return;
		}
		Node current = this.root;
		while(true) {
			if( key >= current.getData() ) {
				if(current.rightChild == null) {
					current.rightChild = new Node(key);
					return;
				}
				current = current.rightChild;
			}
			else {
				if(current.leftChild == null) {
					current.leftChild = new Node(key);
					return;
				}
				current = current.leftChild;
			}
		} //while
	}
	
	public static Tree createMinimalHeightTreeFromSortedArray(int sortedArray[]) {
		Tree retTree = new Tree();
		retTree.root = insertMiddleArrayElement(0, sortedArray.length-1, sortedArray);
		return retTree;
		
	}
	
	private static Node insertMiddleArrayElement(int startIndex, int endIndex, int sortedArray[]) {
		if(endIndex < startIndex)
			return null;
		int middleIndex = (startIndex + endIndex) / 2;
		Node current = new Node(sortedArray[middleIndex]);
		
		// insert left child
		current.leftChild = insertMiddleArrayElement(startIndex, middleIndex - 1, sortedArray);
		
		// insert right child
		current.rightChild = insertMiddleArrayElement(middleIndex + 1, endIndex, sortedArray);
		
		// return current
		return current;
	}
	
	// O(N * log(N))
	public boolean isTreeBalanced() {
		if(isEmpty())
			return false;
		return isTreeBalanced(root);
	}
	
	private boolean isTreeBalanced(Node currentNode) {
		// exit strategy - ako je null, "ostatak" je izbalansiran
		if(currentNode == null)
			return true;
		
		int heightDiff = getHeight(currentNode.leftChild) - getHeight(currentNode.rightChild);
		if( Math.abs(heightDiff) > 1 )
			return false;
		
		// recursion
		return isTreeBalanced(currentNode.leftChild) && isTreeBalanced(currentNode.rightChild);
	}
	
	private int getHeight(Node currentNode) {
		if(currentNode == null)
			return 0;
		return Math.max(getHeight(currentNode.leftChild), getHeight(currentNode.rightChild)) + 1;
			
	}
	
	// O(N)
	public boolean isTreeBalancedImproved() {
		return checkHeight(root) != Integer.MIN_VALUE;
	}
	
	private int checkHeight(Node currentNode) {
		// exit strategy
		if(currentNode == null)
			return 0;
		
		int leftNodeHeight = checkHeight(currentNode.leftChild);
		if(leftNodeHeight == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		int rightChildHeiht = checkHeight(currentNode.rightChild);
		if(rightChildHeiht == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;
		
		if(Math.abs(leftNodeHeight - rightChildHeiht) > 1)
			return Integer.MIN_VALUE;
		
		return Math.max(leftNodeHeight, rightChildHeiht) + 1;
	}
		
	public boolean isEmpty() {
		return this.root == null;
	}
	
	public void displayTree()
	{
		Stack<Node> globalStack = new Stack<Node>();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println(
		".......................................................");
		while(isRowEmpty==false)
		{
			Stack<Node> localStack = new Stack<Node>();
			isRowEmpty = true;
			
			for(int j = 0; j < nBlanks; j++)
				System.out.print(" ");
			
			while(globalStack.isEmpty() == false)
			{
				Node temp = globalStack.pop();
				if(temp != null)
				{
					System.out.print(temp.getData());
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					
					if(temp.leftChild != null ||
							temp.rightChild != null)
						isRowEmpty = false;
				}
				else
				{
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for(int j = 0; j < nBlanks*2 - 2; j++)
					System.out.print(" ");
			} //end while globalStack not empty
			System.out.println();
			nBlanks /= 2;
			while(localStack.isEmpty() == false)
				globalStack.push( localStack.pop() );
		} //end while isRowEmpty is false
		System.out.println(
		".......................................................");
	} //end displayTree()
}
