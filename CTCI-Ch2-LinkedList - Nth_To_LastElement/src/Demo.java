
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
		System.out.println("Trazim NthToLast(0): ");
		System.out.println("\t" + list.findNthToLast(0));
		
		System.out.println();
		System.out.println("Trazim NthToLast(1): ");
		System.out.println("\t" + list.findNthToLast(1));

		
		System.out.println();
		System.out.println("Trazim NthToLast(3): ");
		System.out.println("\t" + list.findNthToLast(3));
		
		
		System.out.println();
		System.out.println("Trazim NthToLast(10): ");
		System.out.println("\t" + list.findNthToLast(10));
	}

}
