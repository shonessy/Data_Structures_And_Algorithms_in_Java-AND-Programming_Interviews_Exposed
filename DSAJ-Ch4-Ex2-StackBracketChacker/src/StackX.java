
public class StackX {
	private char stack[];
	private int currentPosition;
	
	public StackX(int maxSize) {
		this.currentPosition = -1;
		this.stack = new char[maxSize];
	}
	
	public void push(char a) {
		this.stack[++currentPosition] = a;
	}
	
	public char pop() {
		return stack[currentPosition--];
	}
	
	public char peek() {
		return stack[currentPosition];
	}
	
	public boolean isEmpty() {
		return currentPosition == -1;
	}
	
	public boolean isFull() {
		return currentPosition == (stack.length-1);
	}

}
