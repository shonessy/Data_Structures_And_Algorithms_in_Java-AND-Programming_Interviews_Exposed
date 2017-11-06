
public class DoublyLinkedList {
	private Link first;
	private Link last;
	
	public DoublyLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public void insertFirst(Worker e) {
		Link newLink = new Link(e);
		if(isEmpty()) {
			this.first = newLink;
			this.last = newLink;
			return;
		}
		
		newLink.next = this.first;
		this.first.previous = newLink;
		this.first = newLink;
	}
	
	public void insertLast(Worker e) {
		Link newLink = new Link(e);
		if(isEmpty()) {
			this.first = newLink;
			this.last = newLink;
			return;
		}
		
		this.last.next = newLink;
		newLink.previous = this.last;
		this.last = newLink;
	}
	
	public Worker deleteFirst() {
		if(isEmpty()) {
			System.out.println("Lista je prazna! Ne moze DELETE FIRST");
			return null;
		}
		Worker temp = this.first.getData();
		this.first = this.first.next;
		this.first.previous = null;
		return temp;
	}
	
	public Worker deleteLast() {
		if(isEmpty()) {
			System.out.println("Lista je prazna! Ne moze DELETE LAST");
			return null;
		}
		Worker temp = this.last.getData();
		this.last = this.last.previous;
		this.last.next = null;
		return temp;
	}
	
	
	public boolean isEmpty() {
		return this.first == null;
	}
	
	public void displayList() {
		if(isEmpty()) {
			System.out.println("Lista je prazna!");
			return;
		}
		System.out.println("Clanovi liste: ");
		int i=0;
		Link current = this.first;
		while(current != null) {
			System.out.println( (++i) + ". " + current.getData());
			current = current.next;
		}		
	}
}
