import java.util.Stack;

public class Tree {
	public Node root;
	
	public Tree() {
		this.root = null;
	}
	
	public Worker find(Worker keyWorker) {
		if(this.isEmpty())
			return null;
		
		Node current = this.root;
		while(current != null) {
			if( keyWorker.compareTo(current.getData()) == 0 )
				return current.getData();
			else if( keyWorker.compareTo(current.getData()) > 0 )
				current = current.rightChild;
			else
				current = current.leftChild;
		}
		return null;
	}
	
	public Worker findMin() {
		if(this.isEmpty())
			return null;
		Node current = this.root;
		Node min = this.root;
		while(current != null) {
			min = current;
			current = current.leftChild;
		}
		return min.getData();
	}
	
	public Worker findMax() {
		if(this.isEmpty())
			return null;
		Node current = this.root;
		Node min = this.root;
		while(current != null) {
			min = current;
			current = current.rightChild;
		}
		return min.getData();
	}
	
	public void insert(Worker keyWorker) {
		if(this.isEmpty()) {
			this.root = new Node(keyWorker);
			return;
		}
		Node current = this.root;
		while(true) {
			if( keyWorker.compareTo(current.getData()) >= 0 ) {
				if(current.rightChild == null) {
					current.rightChild = new Node(keyWorker);
					return;
				}
				current = current.rightChild;
			}
			else {
				if(current.leftChild == null) {
					current.leftChild = new Node(keyWorker);
					return;
				}
				current = current.leftChild;
			}
		} //while
	}
	
	public boolean delete(Worker keyWorker) {
		if(this.isEmpty())
			return false;
		Node current = this.root;
		Node parent = this.root;
		boolean isLeftChild = true;		// predpostavimo, ali nije od znacaja
		while(current != null) {
			if( keyWorker.compareTo(current.getData()) == 0 ) {
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
			else if( keyWorker.compareTo(current.getData()) > 0 ) {
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
