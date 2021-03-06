
public class Link {
	public Link next;
	public Link previous;
	private Worker data;
	
	public Link(Worker e) {
		this.next = null;
		this.previous = null;
		this.data = e;
	}
	
	public Worker getData() {
		return this.data;
	}
	
	@Override
	public String toString() {
		return "\tName: " + this.data.getName() + "\tAge: " + this.data.getAge();
	}
}
