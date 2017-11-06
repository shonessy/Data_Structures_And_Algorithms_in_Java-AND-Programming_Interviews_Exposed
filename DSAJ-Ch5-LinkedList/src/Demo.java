
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
		
		System.out.println("Brisem prvog: \n\t" + list.deleteFirst() + "\n");
		list.displayList();
		
		System.out.println();		
		System.out.println("Trazim Anu: \n\t" + list.find("Ana") + "\n");
		System.out.println("Trazim Jovanu: \n\t" + list.find("Jovana") + "\n");
		
		System.out.println();		
		System.out.println("Brisem Anu: \n\t" + list.delete("Ana") + "\n");
		list.displayList();
		
		System.out.println();		
		System.out.println("Brisem Jovanu: \n\t" + list.delete("Jovana") + "\n");
		list.displayList();
	}

}
