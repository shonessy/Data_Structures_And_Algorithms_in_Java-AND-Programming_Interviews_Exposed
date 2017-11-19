import java.util.Hashtable;
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
	
	public void insertFirst(Link newLink) {
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
	
	public void insertLast(Link newLink) {
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
	
	public Link getLoopStartPointByHashing() {
		if(this.isEmpty())
			return null;
		Link current = this.first;
		Hashtable<Link, Integer> hashTable = new Hashtable<>();
		while(current != null) {
			if(hashTable.containsKey(current))
				return current;
			hashTable.put(current, current.getData());
			current = current.next;
		}
		return null;
	}
	
	public boolean isLoopCircularByFlowRunnerFastRunner() {
		if(this.isEmpty())
			return false;
		Link slowRunner = this.first;
		Link fastRunner = this.first.next;
		while(fastRunner != null && fastRunner.next != null) {
			// nije ciklicna
			if(fastRunner == null)
				break;
			if(fastRunner == slowRunner || fastRunner.next == slowRunner)
				return true;
			slowRunner = slowRunner.next;
			fastRunner = fastRunner.next.next;
		}
		return false;
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
