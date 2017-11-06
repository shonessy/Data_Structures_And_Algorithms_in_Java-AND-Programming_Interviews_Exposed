
public class Demo {

	public static void main(String[] args) {
		DoublyEndedLinkedList xList = new DoublyEndedLinkedList();
		xList.insertFirst(7);
		xList.insertFirst(7);
		xList.insertFirst(7);
		
		DoublyEndedLinkedList yList = new DoublyEndedLinkedList();
		yList.insertFirst(8);
		yList.insertFirst(8);
		yList.insertFirst(8);
		
		System.out.println("Prvi broj naopacke: ");
		xList.displayList();
		System.out.println();
		
		System.out.println("Drugi broj naopacke: ");
		yList.displayList();
		System.out.println();
		
		System.out.println("Zbir naopacke: ");
		DoublyEndedLinkedList sumList = new DoublyEndedLinkedList();
		sumList.add(xList, yList);
		sumList.displayList();
		System.out.println();
		
	}

}
