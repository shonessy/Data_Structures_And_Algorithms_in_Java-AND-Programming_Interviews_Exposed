
public class Link {
	public Link next;
	private int data;
	
	public Link(int e) {
		this.next = null;
		this.data = e;
	}
	
	public int getData() {
		return this.data;
	}
	
	@Override
	public String toString() {
		return "\tDigit: " + this.data;
	}
}
