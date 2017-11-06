
public class Link  {
	public Link next;
	private Worker data;

	
	public Link(Worker e) {
		this.data = e;
		this.next = null;
	}
	
	public Worker getWorker() {
		return data;
	}
	
	public void setWorker(Worker e) {
		this.data = e;
	}
	
	@Override
	public String toString() {
		return data.toString();
	}

}
