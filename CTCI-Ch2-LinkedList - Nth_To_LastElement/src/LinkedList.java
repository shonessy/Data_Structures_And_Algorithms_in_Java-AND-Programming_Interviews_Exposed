
public class LinkedList {
	private Link first;
	
	public LinkedList() {
		this.first = null;
	}
	
	public boolean isEmpty() {
		return this.first == null;
	}
	
	public void insertFirst(Worker e) {
		Link newFirst = new Link(e);
		newFirst.next = first;
		this.first = newFirst;
	}
	
	public Worker deleteFirst() {
		Worker ret = first.getWorker();
		this.first = this.first.next;
		return ret;
	}
	
	public Worker find(String keyName) {
		Link current = this.first;
		while(current != null && !current.getWorker().getName().equals(keyName))
			current = current.next;
		return current != null ? current.getWorker() : null;
	}
	
	public Worker findNthToLast(int n) {
		if(isEmpty())
			return null;
		
		int steps = 0;
		Link candidate = this.first;
		Link current = this.first;
		while(current.next != null) {
			steps++;
			if(steps == n)
				candidate = this.first;
			else if(steps > n)
				candidate = candidate.next;
			current = current.next;
		}
		return (steps < n) ? null : candidate.getWorker();
	}
	
//	// wrapper
//	public Worker findNthToLastRecursively(int n) {
//		if(isEmpty())
//			return null;
//		Link nth = findNthToLastRecursively(this.first, n); 
//		return (nth == null) ? null : nth.getWorker();
//	}
//	
//	private Link findNthToLastRecursively(Link first, int n) {
//				
//	}
//	
	public Worker delete(String keyName) {
		Link previous = null;
		Link current = this.first;
		while(current != null && !current.getWorker().getName().equals(keyName)) {
			previous = current;
			current = current.next;
		}
		if(current == null)
			return null;
		previous.next = current.next;
		return current.getWorker();
	}
	
	public void displayList() {
		System.out.println("Clanovi liste (prvi -> zadnji): ");
		Link current = this.first;
		while(current != null) {
			System.out.println(current);
			current = current.next;
		}
	}

}
