import java.util.Stack;

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
	
	public boolean isPalindromeByReversing() {
		if(this.isEmpty())
			return false;
		
		DoublyEndedLinkedList reversedList = new DoublyEndedLinkedList();
		Link current = this.first;
		while(current != null) {
			reversedList.insertFirst(current.getData());
			current = current.next;
		}
		
		current = this.first;
		Link currentReversed = reversedList.first; 
		while(current != null) {
			if(current.getData() != currentReversed.getData())
				return false;
			current = current.next;
			currentReversed = currentReversed.next;
		}
		return true;		
	}
	
	public boolean isPalindromeByStack() {
		if(this.isEmpty())
			return false;
		
		Stack<Integer> stack = new Stack<>();
		Link slowRunner = this.first;
		Link fastRunner = this.first;
		while(fastRunner != null && fastRunner.next != null) {
			stack.push(slowRunner.getData());			
			slowRunner = slowRunner.next;
			fastRunner = fastRunner.next.next;
		}
		 // ako je neparna duzina - preskoci srednji
		if(fastRunner != null)
			slowRunner = slowRunner.next;
		
		while(slowRunner != null) {
			if(slowRunner.getData() != stack.pop())
				return false;
			slowRunner = slowRunner.next;
		}
		return true;
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
