
public class StackX {
	private int stack[];
	private int currentPosition;
	
	public StackX(int maxSize) {
		this.currentPosition = -1;
		this.stack = new int[maxSize];
	}
	
	public void push(int a) {
		this.stack[++currentPosition] = a;
	}
	
	public int pop() {
		return stack[currentPosition--];
	}
	
	public int peek() {
		return stack[currentPosition];
	}
	
	public boolean isEmpty() {
		return currentPosition == -1;
	}
	
	public boolean isFull() {
		return currentPosition == (stack.length-1);
	}

}
