
public class Demo {

	public static void main(String[] args) {		
		LinkedList list = new LinkedList();
		list.insertFirst(new Worker("Marko", 21));
		list.insertFirst(new Worker("Ana", 17));
		list.insertFirst(new Worker("Jelena", 43));
		list.insertFirst(new Worker("Iva", 15));
		list.insertFirst(new Worker("Srdja", 28));
		
		list.displayList();
		System.out.println();
		
		// nadji Jelenu		
		Link jelena = list.findLink("Jelena");
		System.out.println("Jelena: " + jelena);
		System.out.println("Brisem Jelenu: " + list.deleteMiddleLink(jelena));
		
		System.out.println();
		list.displayList();
	}

}
