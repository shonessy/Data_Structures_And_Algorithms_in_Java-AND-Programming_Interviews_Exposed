
public class Demo {

	public static void main(String[] args) {
		System.out.println("Original Stack: ");
		MyStack stack = new MyStack();
		for(int i =0; i< 10; i++)
			stack.push((int)(Math.random()*100));
		stack.displayStack();
		System.out.println();
		
		System.out.println("Sorted Stack: ");
		MyStack sortedStack = sortStack(stack);
		sortedStack.displayStack();
		
		
	}
	
	public static MyStack sortStack(MyStack originalStack) {
		// sadrzi samo sortirane clanove, ukoliko se pojavi neki koji remeti sortiranje - vraca se u originalni stack\
		MyStack sortedStack = new MyStack();
		while(!originalStack.isEmpty()) {			
			int temp = originalStack.pop();
			// izbaci iz sortiranog one koji su veci od temp-a
			while(!sortedStack.isEmpty() && sortedStack.peek() > temp)
				originalStack.push(sortedStack.pop());
			sortedStack.push(temp);

		}
		return sortedStack;
	}

}
