
public class SortedList {
	private Link first;
	
	public SortedList() {
		this.first = null;
	}
	
	public void insert(Worker e) {
//		if(isEmpty()) {
//			this.first = new Link(e);
//			return;
//		}
		Link previous = null;
		Link current = first;
		while(current != null &&  e.getAge() > current.getData().getAge() ) {
			previous = current;
			current = current.next;
		}
		Link newLink =  new Link(e);
		if(previous == null) 
			first = newLink;
		else 
			previous.next = newLink;
		newLink.next = current;
	}
	
	public Worker remove() {
		Worker ret = this.first.getData();
		this.first = first.next;
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
