
public class DoublyEndedLinkedList {
	public Link first;
	public Link last;
	
	public DoublyEndedLinkedList() {
		this.first = null;
		this.last = null;
	}
	
	public void insertFirst(int e) {
		Link newLink = new Link(e);
		if(this.isEmpty()) {
			this.first = newLink;
			this.last = newLink;
			return;
		}	
		newLink.next = this.first;
		this.first = newLink;
	}
	
	public void insertLast(int e) {
		Link newLink = new Link(e);
		if(this.isEmpty()) {
			this.first = newLink;
			this.last = newLink;
			return;
		}		
		this.last.next = newLink;
		this.last = newLink;		
	}
	
	public int deleteFirst() {
		int ret = this.first.getData();
		this.first = this.first.next;
		return ret;
	}
	
	public boolean isEmpty() {
		return this.first == null;
	}
	
	
	public void add(DoublyEndedLinkedList xLink, DoublyEndedLinkedList yLink) {
		Link currentX = xLink.first;
		Link currentY = yLink.first;
		int cin = 0;
		
		while(currentX != null || currentY != null) {
			int x = (currentX != null) ? currentX.getData() : 0;
			int y = (currentY != null) ? currentY.getData() : 0;
			int sum = x + y + cin;
			if(sum > 9) {
				cin = sum / 10;
				sum %= 10;
			}
			else
				cin = 0;
			this.insertLast(sum);
			
			currentX = (currentX != null) ? currentX.next : null;
			currentY = (currentY != null) ? currentY.next : null;
		}
		if(cin > 0)
			this.insertLast(cin);
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
