
public class Demo {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.insertFirst(new Worker("Marko", 21));
		list.insertFirst(new Worker("Ana", 17));
		list.insertFirst(new Worker("Jelena", 43));
		list.insertLast(new Worker("Iva", 15));
		list.insertLast(new Worker("Srdja", 28));
		
		list.displayList();
		
		System.out.println();
		
		list.deleteFirst();
		list.displayList();
		
		System.out.println();

		list.deleteLast();
		list.displayList();

	}

}
