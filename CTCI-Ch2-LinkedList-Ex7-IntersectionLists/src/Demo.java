
public class Demo {

	public static void main(String[] args) {
		DoublyEndedLinkedList tail = new DoublyEndedLinkedList();
		tail.insertLast(1);
		tail.insertLast(17);
		tail.insertLast(28);
		
		System.out.println("Tail:");
		tail.displayList();
		System.out.println();
		
		// first horn
		DoublyEndedLinkedList firstHorn = new DoublyEndedLinkedList();
		firstHorn.insertLast(105);
		firstHorn.insertLast(110);
		firstHorn.insertLast(115);
		firstHorn.insertLast(tail.first);
		
		System.out.println("Horn 1:");
		firstHorn.displayList();
		System.out.println();
		
		// second horn 
		DoublyEndedLinkedList secondHorn = new DoublyEndedLinkedList();
		secondHorn.insertLast(205);
		secondHorn.insertLast(210);
		secondHorn.insertLast(215);
		secondHorn.insertLast(tail.first);
		
		System.out.println("Horn 2:");
		secondHorn.displayList();
		System.out.println();
		
		Link intersecion = DoublyEndedLinkedList.intersection(firstHorn, secondHorn);
		System.out.println("Intersection: " + ((intersecion != null) ? intersecion.getData() : null));
		
		Link intersecionByHashing = DoublyEndedLinkedList.intersectionByHashing(firstHorn, secondHorn);
		System.out.println("Intersection By Hashing: " + ((intersecionByHashing != null) ? intersecionByHashing.getData() : null));
		
		
	}

}
