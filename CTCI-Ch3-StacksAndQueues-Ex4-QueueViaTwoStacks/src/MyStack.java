
public class MyStack {
	private Node top;
	
	public MyStack() {
		this.top = null;
	}
	
	public boolean isEmpty() {
		return this.top == null;
	}
	
	
	public void push(int x) {
		Node newTop = new Node(x);
		newTop.previous = this.top;
		this.top = newTop;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack je prazan!!!");
			return Integer.MIN_VALUE;
		}		
		int ret = this.top.data;
		this.top = this.top.previous;
		return ret;
	}
	
	public int peek() {
		return this.top.data;
	}
	
	public void displayStack() {
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
