import java.util.Stack;

public class Tree {
	public Node root;
	
	public Tree() {
		this.root = null;
	}
	
	public int find(int key) {
		if(this.isEmpty())
			return -1;
		
		Node current = this.root;
		while(current != null) {
			if( key == current.getData())
				return current.getData();
			else if( key > current.getData() )
				current = current.rightChild;
			else
				current = current.leftChild;
		}
		return -1;
	}
	
	public int findMin() {
		if(this.isEmpty())
			return -1;
		Node current = this.root;
		Node min = this.root;
		while(current != null) {
			min = current;
			current = current.leftChild;
		}
		return min.getData();
	}
	
	public int findMax() {
		if(this.isEmpty())
			return -1;
		Node current = this.root;
		Node min = this.root;
		while(current != null) {
			min = current;
			current = current.rightChild;
		}
		return min.getData();
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
	
	public boolean delete(int key) {
		if(this.isEmpty())
			return false;
		Node current = this.root;
		Node parent = this.root;
		boolean isLeftChild = true;		// predpostavimo, ali nije od znacaja
		while(current != null) {
			if( key == current.getData() ) {
				// ako nema ni lijevi ni desni cajld - najlaksi slucaj
				if(current.leftChild == null && current.rightChild == null) {
					if(isLeftChild)
						parent.leftChild = null;
					else 
						parent.rightChild = null;
					return true;
				}
				// ako ima i lijevi i desni cajld - najtezi slucaj
				if(current.leftChild != null && current.rightChild != null) {
					/////////////////////////////////??????????????????/////////////////////////////////////////////////
				}
				// ako ima samo jedan cajld - srednju slucaj
				else {
					// ako ima lijevi cajld
					if(current.leftChild != null) {
						if(isLeftChild)
							parent.leftChild = current.leftChild;
						else
							parent.rightChild = current.leftChild;
					}
					// ako ima desni cajld
					else {
						if(isLeftChild)
							parent.leftChild = current.rightChild;
						else
							parent.rightChild = current.rightChild;
					}
					return true;
						
				}
			
			}
			else if( key > current.getData() ) {
				parent = current;
				current = current.rightChild;
				isLeftChild = false;
			}
			else {
				parent = current;
				current = current.leftChild;
				isLeftChild = true;
			}
		}
		return false;
	}
	
	public void traverseInOrder() {
		this.traverseInOrder(root);
	}
	
	private void traverseInOrder(Node localRoot) {
		if(localRoot == null)
			return;
		traverseInOrder(localRoot.leftChild);
		System.out.println(localRoot.getData());
		traverseInOrder(localRoot.rightChild);
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
