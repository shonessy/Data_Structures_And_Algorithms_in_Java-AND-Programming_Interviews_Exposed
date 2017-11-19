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
	
	
	public static Link intersection(DoublyEndedLinkedList list1, DoublyEndedLinkedList list2) {
		if(list1.last != list2.last)
			return null;
		
		Link currentList1 = list1.first;
		Link currentList2 = list2.first;
		int list1Length = 0;
		int list2Length = 0;
		while(currentList1 != null || currentList2 != null) {
			if(currentList1 != null)
				list1Length++;
			if(currentList2 != null)
				list2Length++;
			currentList1 = currentList1.next;
			currentList2 = currentList2.next;
		}
				
		currentList1 = list1.first;
		currentList2 = list2.first;
		if(list1Length > list2Length) {
			int i = 0;
			while(i < list1Length - list2Length) {
				currentList1 = currentList1.next;
				i++;
			}
		}
		else if(list2Length > list1Length) {
			int i = 0;
			while(i < list2Length - list1Length) {
				currentList2 = currentList2.next;
				i++;
			}
		}
		
		while(currentList1 != null) {
			if(currentList1 == currentList2)
				return currentList1;
			currentList1 = currentList1.next;
			currentList2 = currentList2.next;
		}
		return null;
	}
	
	public static Link intersectionByHashing(DoublyEndedLinkedList list1, DoublyEndedLinkedList list2) {
		if(list1.isEmpty() || list2.isEmpty())
			return null;
		if(list1.last != list2.last)
			return null;
		
		Hashtable<Link, Integer> list1HashTable = new Hashtable<>();
		// Hashtable<Link, Integer> list2HashTable = new Hashtable<>();
		Link current1 = list1.first;
		while(current1 != null) {
			list1HashTable.put(current1, current1.getData());
			current1 = current1.next;
		}
		
		Link currrent2 = list2.first;
		while(currrent2 != null) {
			if(list1HashTable.containsKey(currrent2))
				return currrent2;
			currrent2 = currrent2.next;
		}
		return null;
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
