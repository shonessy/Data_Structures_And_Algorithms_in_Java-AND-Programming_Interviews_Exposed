
public class DoublyEndedLinkedList {
	public Link first;
	public Link last;
	
	public DoublyEndedLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public void insertFirst(Worker e) {
		Link newLink = new Link(e);
		if(this.isEmpty()) {
			this.first = newLink;
			this.last = newLink;
			return;
		}	
		newLink.next = this.first;
		this.first = newLink;
	}
	
	public void insertLast(Worker e) {
		Link newLink = new Link(e);
		if(this.isEmpty()) {
			this.first = newLink;
			this.last = newLink;
			return;
		}		
		this.last.next = newLink;
		this.last = newLink;		
	}
	
	public Worker deleteFirst() {
		Worker ret = this.first.getData();
		this.first = this.first.next;
		return ret;
	}
	
	public boolean isEmpty() {
		return this.first == null;
	}
	
	public void partition(int targetAge) {
		DoublyEndedLinkedList left = new DoublyEndedLinkedList();
		DoublyEndedLinkedList right = new DoublyEndedLinkedList();
		if(this.isEmpty())
			return;
		Link current = this.first;
		while(current != null) {
			if(current.getData().getAge() < targetAge)
				left.insertLast(current.getData());
			else
				right.insertLast(current.getData());
			current = current.next;
			
		}
		if(left.isEmpty()) {
			this.first = right.first;
			return;
		}
		left.last.next = right.first;
		left.last = right.last;
		this.first = left.first;		
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
