import java.util.ArrayList;

public class SetOfStacks {
	private int stackMaxSize;
	private ArrayList<MyStack> setOfStacks;
	
	public SetOfStacks(int stackMaxSize) {
		this.stackMaxSize = stackMaxSize;
		this.setOfStacks = new ArrayList<>();
		this.setOfStacks.add(new MyStack(stackMaxSize));
	}
	
	public void push(int x) {
		if( setOfStacks.get(setOfStacks.size() - 1).isFull() )
			this.setOfStacks.add(new MyStack(stackMaxSize));
		setOfStacks.get(setOfStacks.size() - 1).push(x);
	}
	
	public int pop() {
		if( setOfStacks.get(setOfStacks.size() - 1).isEmpty() )
			setOfStacks.remove(setOfStacks.size() - 1);
		int ret = setOfStacks.get(setOfStacks.size() - 1).pop();
		
		if( setOfStacks.get(setOfStacks.size() - 1).isEmpty() )
			setOfStacks.remove(setOfStacks.size() - 1);
		
		return ret;
	}
	
	public int popAt(int index) {
		if( setOfStacks.get(index - 1).isEmpty() )
			setOfStacks.remove(index - 1);
		int ret = setOfStacks.get(index - 1).pop();
		
		if( setOfStacks.get(index - 1).isEmpty() )
			setOfStacks.remove(setOfStacks.size() - 1);
		
		return ret;
	}
	
	public void displaySetOfStacks() {
		for(int i = setOfStacks.size() - 1; i >= 0; i--) {
			System.out.print( (i+1) + ".\t");
			setOfStacks.get(i).displayStack();
			System.out.println();
		}
	}

}
