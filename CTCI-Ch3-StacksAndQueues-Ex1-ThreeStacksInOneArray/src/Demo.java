
public class Demo {

	public static void main(String[] args) {
		FixedSizeMultiStacks stack = new FixedSizeMultiStacks(3, 10);
		stack.push(5, 1);
		stack.push(10, 1);
		stack.push(15, 1);
		stack.push(20, 1);
		
		stack.push(3, 2);
		stack.push(6, 2);
		stack.push(9, 2);
		stack.push(12, 2);
		
		stack.push(7, 3);
		stack.push(14, 3);
		stack.push(21, 3);
		stack.push(28, 3);
		
		System.out.println("Prvi Stack: ");
		stack.displayStack(1);
		System.out.println();
		
		System.out.println("Drugi Stack: ");
		stack.displayStack(2);
		System.out.println();
		
		System.out.println("Treci Stack: ");
		stack.displayStack(3);
		System.out.println();
		
		System.out.println("Peek 1: " + stack.peek(1));
		System.out.println("Peek 2: " + stack.peek(2));
		System.out.println("Peek 3: " + stack.peek(3));
		System.out.println();
		
		System.out.println("Pop 1: " + stack.pop(1));
		System.out.println("Peek 1: " + stack.peek(1));
		stack.displayStack(1);
		System.out.println();
		
		System.out.println("Pop 2: " + stack.pop(2));
		System.out.println("Peek 2: " + stack.peek(2));
		stack.displayStack(2);
		System.out.println();
		
		System.out.println("Pop 3: " + stack.pop(3));
		System.out.println("Peek 3: " + stack.peek(3));
		stack.displayStack(3);
		System.out.println();
		
		
		
	}

}
