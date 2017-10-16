
public class Demo {

	public static void main(String[] args) {
		StackX stack = new StackX(10);
		
		while(!stack.isFull()) {
			int rand = (int) (Math.random()*100);
			System.out.println("Ubacujem: " + rand);
			stack.push(rand);
		}
		
		System.out.println();
		
		while(!stack.isEmpty())
			System.out.println("Izbacujem: " + stack.pop());

	}

}
