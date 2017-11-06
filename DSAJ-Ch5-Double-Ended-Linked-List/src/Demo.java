
public class Demo {

	public static void main(String[] args) {
		DoublyEndedLinkedList list = new DoublyEndedLinkedList();
		list.insertFirst(new Worker("Marko", 21));
		list.insertFirst(new Worker("Ana", 17));
		list.insertFirst(new Worker("Jelena", 43));
		list.insertFirst(new Worker("Iva", 15));
		list.insertFirst(new Worker("Srdja", 28));
		
		list.displayList();
		
		System.out.println();
		
		list.insertLast(new Worker("Andjelija", 27));
		list.displayList();
		
		System.out.println();
		
		list.deleteFirst();
		list.displayList();
		
		System.out.println();

	}

}
