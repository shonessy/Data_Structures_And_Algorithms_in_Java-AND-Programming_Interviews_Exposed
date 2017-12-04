import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;

public class Tree {
	public Node root;
	
	public Tree() {
		this.root = null;
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
	
	public Stack<LinkedList<Node>> createLinkedListsOfLevels(Tree tree) {
		if(tree.isEmpty())
			return null;
		Stack<LinkedList<Node>> stack = new Stack<>();
		LinkedList<Node> currentRowLinkeList = new LinkedList<>();
		currentRowLinkeList.add(root);
		stack.push(currentRowLinkeList);
		createLinkedListsOfLevels(stack);
		return stack;		
	}
	
	private void createLinkedListsOfLevels(Stack<LinkedList<Node>> stack) {
//		if(stack.peek().isEmpty())
//			return;
		
		ListIterator<Node> currentRowLinkedListIterator = stack.peek().listIterator();
		LinkedList<Node> nextRowLinkeList = new LinkedList<>();
		Node currentNode;
		while(currentRowLinkedListIterator.hasNext()) {
			currentNode = currentRowLinkedListIterator.next();
			if(currentNode.leftChild != null)
				nextRowLinkeList.add(currentNode.leftChild);
			if(currentNode.rightChild != null)
				nextRowLinkeList.add(currentNode.rightChild);
		}
		
		//exit strategy 
		if(nextRowLinkeList.isEmpty())
			return;
		stack.push(nextRowLinkeList);
		createLinkedListsOfLevels(stack);			
	}
	
	public void displayLinkedListsOfLevels(Stack<LinkedList<Node>> stack) {
		int i = 1;
		Stack<LinkedList<Node>> reversedStack = new Stack<>();
		while(!stack.isEmpty())
			reversedStack.push(stack.pop());
		
		while(!reversedStack.isEmpty()) {
			System.out.println("Row: " + i);
			ListIterator<Node> currentRowLinkedListIterator = reversedStack.pop().listIterator();
			System.out.print("\t");
			while(currentRowLinkedListIterator.hasNext()) 
				System.out.print(currentRowLinkedListIterator.next().getData() + "\t");
			System.out.print("\n");
			i++;
		}
		
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
