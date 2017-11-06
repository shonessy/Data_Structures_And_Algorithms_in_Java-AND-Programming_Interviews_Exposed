
public class Demo {

	public static void main(String[] args) {
		DoublyEndedLinkedList xList = new DoublyEndedLinkedList();
		xList.insertLast(1);
		xList.insertLast(3);
		xList.insertLast(5);
		xList.insertLast(5);
		xList.insertLast(3);
		xList.insertLast(1);
		
		xList.displayList();
		System.out.println();
		
		System.out.println("Palindrom po reverse-u: " + xList.isPalindromeByReversing());
		System.out.println("Palindrom po stack-u: " + xList.isPalindromeByStack());
		
	}

}
