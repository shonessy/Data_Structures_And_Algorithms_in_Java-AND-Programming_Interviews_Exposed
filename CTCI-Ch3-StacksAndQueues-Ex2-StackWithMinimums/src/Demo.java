
public class Demo {

	public static void main(String[] args) {
		StackWithMinimum stack = new StackWithMinimum();
		stack.push(15);
		stack.push(25);
		stack.push(7);
		stack.push(41);
		stack.push(2);
		stack.push(21);
		stack.displayStack();
		System.out.println();
		System.out.println("Min: " + stack.min());
		System.out.println();
		
		System.out.println("Pop: " + stack.pop());
		System.out.println("Min: " + stack.min());
		System.out.println();
		
		System.out.println("Pop: " + stack.pop());
		System.out.println("Min: " + stack.min());
		System.out.println();
		
		System.out.println("Pop: " + stack.pop());
		System.out.println("Min: " + stack.min());
		System.out.println();
		
		System.out.println("Pop: " + stack.pop());
		System.out.println("Min: " + stack.min());
		System.out.println();
	}

}
