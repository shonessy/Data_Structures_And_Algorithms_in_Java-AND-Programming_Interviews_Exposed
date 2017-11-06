
public class DoublyEndedLinkedList {
	public Link first;
	public Link last;
	
	public DoublyEndedLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public void insertFirst(Worker e) {
		Link newLink = new Link(e);
		newLink.next = this.first;
		this.first = newLink;
		if(this.first.next == null)
			this.last = this.first;
	}
	
	public void insertLast(Worker e) {
		Link newLink = new Link(e);
		this.last.next = newLink;
		this.last = newLink;
		if(this.first == null)
			this.first = this.last;		
	}
	
	public Worker deleteFirst() {
		Worker ret = this.first.getData();
		this.first = this.first.next;
		return ret;
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
