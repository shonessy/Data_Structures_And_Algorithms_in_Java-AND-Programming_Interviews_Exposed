
public class MyStack {
	private Node top;
	private Node bottom;
	private int stackMaxSize;
	private int stackSize;
	
	public MyStack(int stackMaxSize) {
		this.stackMaxSize = stackMaxSize;
		this.top = null;
		this.bottom = null;
	}
	
	public boolean isEmpty() {
		return this.top == null;
	}
	
	public boolean isFull() {
		return stackSize == stackMaxSize;
	}
	
	public void push(int x) {
		Node newTop = new Node(x);
		if(isEmpty())
			this.bottom = newTop;
		newTop.previous = this.top;
		this.top = newTop;
		this.stackSize++;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack je prazan!!!");
			return Integer.MIN_VALUE;
		}		
		int ret = this.top.data;
		this.top = this.top.previous;
		this.stackSize--;
		if(isEmpty())
			this.bottom = null;
		return ret;
	}
	
	public int peek() {
		return this.top.data;
	}
	
	public void displayStack() {
		System.out.print("Stack vrh->dno: \t");
		if(isEmpty()) {
			System.out.println("");
			return;
		}
		Node current = this.top;
		while(current != null) {
			System.out.print(current.data + "\t");
			current = current.previous;
		}
	}
	
}
