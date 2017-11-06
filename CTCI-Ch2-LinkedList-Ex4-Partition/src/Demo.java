
public class Demo {

	public static void main(String[] args) {
		DoublyEndedLinkedList list = new DoublyEndedLinkedList();
		list.insertLast(new Worker("Jakov", 77));
		list.insertFirst(new Worker("Marko", 21));
		list.insertFirst(new Worker("Ana", 17));
		list.insertFirst(new Worker("Jelena", 43));
		list.insertFirst(new Worker("Iva", 15));
		list.insertFirst(new Worker("Srdja", 28));
		list.insertLast(new Worker("Andjelija", 27));
		
		list.displayList();
		System.out.println();

		System.out.println("Particija oko age=25");
		list.partition(25);		
		list.displayList();
		System.out.println();
		
		System.out.println("Particija oko age=28");
		list.partition(28);		
		list.displayList();
		System.out.println();
		
		System.out.println("Particija oko age=148");
		list.partition(148);		
		list.displayList();
		System.out.println();
		
		System.out.println("Particija oko age=3");
		list.partition(3);		
		list.displayList();
		System.out.println();
	}

}
