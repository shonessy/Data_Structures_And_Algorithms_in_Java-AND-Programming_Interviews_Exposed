
public class FixedSizeMultiStacks {
	private int numberOfStacks;
	private int stackSize;
	private int values[];
	private int sizes[];
	
	public FixedSizeMultiStacks(int numberOfStacks, int stackSize) {
		this.numberOfStacks = numberOfStacks;
		this.stackSize = stackSize;
		this.values = new int[numberOfStacks * stackSize];
		this.sizes = new int[numberOfStacks];
	}
	
	public boolean isEmpty(int stackNumber) {
		return sizes[stackNumber-1] == 0;
	}
	
	public boolean isFull(int stackNumber) {
		return sizes[stackNumber-1] == stackSize;
	}
	
	public void push(int data, int stackNumber) {
		if(isFull(stackNumber)) {
			System.out.println("Stack " + stackNumber + " je pun!!!!");
			return;
		}
		values[getTopIndex(stackNumber) + 1] = data;
		sizes[stackNumber-1]++;
	}
	
	public int peek(int stackNumber) {
		return values[(stackNumber-1)*stackSize + sizes[stackNumber-1] - 1];
	}
	
	public int pop(int stackNumber) {
		if(isEmpty(stackNumber)) {
			System.out.println("Stack " + stackNumber + " je prazan");
			return -1;
		}
			
		int ret = values[getTopIndex(stackNumber)];
		values[getTopIndex(stackNumber)] = -1;
		sizes[stackNumber-1]--;
		return ret;
	}
	
	private int getTopIndex(int stackNumber) {
		return (stackNumber-1)*stackSize + sizes[stackNumber-1] - 1;
	}
	
	
	
	
	
	public void displayStack(int stackNumber) {
		System.out.print("Vrh->Dno: \t");
		for(int i = sizes[stackNumber-1] - 1; i >= 0; i--)
			System.out.print(values[(stackNumber-1)*stackSize + i] + "\t");
		System.out.println();
	}
}
