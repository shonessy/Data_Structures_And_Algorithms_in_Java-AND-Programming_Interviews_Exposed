import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		SetOfStacks stacks = new SetOfStacks(3);
		stacks.push(1);
		stacks.push(2);
		stacks.push(3);
		
		stacks.push(4);
		stacks.push(5);
		stacks.push(6);
		
		stacks.push(7);
		stacks.push(8);
		
		stacks.displaySetOfStacks();
		System.out.println("-----------------------------");
		
		System.out.println("Pop: " + stacks.pop());
		stacks.displaySetOfStacks();
		System.out.println("-----------------------------");
		
		System.out.println("PopAT 2: " + stacks.popAt(2));
		stacks.displaySetOfStacks();
		System.out.println("-----------------------------");
		
		System.out.println("Pop: " + stacks.pop());
		stacks.displaySetOfStacks();
		System.out.println("-----------------------------");
		
		System.out.println("Pop: " + stacks.pop());
		stacks.displaySetOfStacks();
		System.out.println("-----------------------------");
			
		
	}

}
