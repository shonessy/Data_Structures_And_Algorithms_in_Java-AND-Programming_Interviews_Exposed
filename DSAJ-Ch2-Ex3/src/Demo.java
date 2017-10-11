
public class Demo {
	public static void main(String[] args) {
		Array array = new HighArray(50);
		array.insert(54);
		array.insert(28);
		array.insert(44);
		array.insert(148);
		array.insert(12);
		
		array.display();
		System.out.println();
		
		System.out.println("Trazim 141:  " + array.find(141) );
		System.out.println("Trazim 148:  " + array.find(148) );
		System.out.println();
		
		System.out.println("Brisem 141:  ");
		array.delete(141);
		array.display();
		System.out.println();
		
		System.out.println("Brisem 44:  ");
		array.delete(44);
		array.display();
		System.out.println();
		
		System.out.println("\n************************************************\n");
		
		array = null;
		array= new SortedArray(50);
		array.insert(28);
		array.insert(44);
		array.insert(148);
		array.insert(54);
		array.insert(12);
		
		array.display();
		System.out.println();
		
		System.out.println("Trazim 141:  " + array.find(141) );
		System.out.println("Brisem 141:  ");
		array.delete(141);
		array.display();
		System.out.println();
		
		System.out.println("Brisem 44:  ");
		array.delete(44);
		array.display();
		System.out.println();
	}

}
