
public class Demo {

	public static void main(String[] args) {
		SortedList list = new SortedList();
		list.insert(new Worker("Marko", 21));
		list.insert(new Worker("Ana", 17));
		list.insert(new Worker("Jelena", 43));
		list.insert(new Worker("Iva", 15));
		list.insert(new Worker("Srdja", 28));
		
		list.displayList();
		
		System.out.println();
		
		list.remove();
		list.displayList();
		
		System.out.println();

	}

}
