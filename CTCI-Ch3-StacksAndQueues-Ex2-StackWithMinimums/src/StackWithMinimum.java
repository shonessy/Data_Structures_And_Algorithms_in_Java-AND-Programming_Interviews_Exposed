
public class StackWithMinimum extends MyStack {
	private MyStack minimums;
	
	public StackWithMinimum() {
		this.minimums = new MyStack();
	}
	
	public int min() {
		if(this.minimums.isEmpty()) {
			System.out.println("Nema minimuma");
			return Integer.MIN_VALUE;
		}
		return this.minimums.peek();
	}
	
	@Override
	public void push(int x) {
		if (isEmpty() || x < this.minimums.peek())
			this.minimums.push(x);
		super.push(x);
	}
	
	@Override
	public int pop() {
		int ret = super.pop();
		if(ret == this.minimums.peek())
			this.minimums.pop();
		return ret;
	}
	

}
