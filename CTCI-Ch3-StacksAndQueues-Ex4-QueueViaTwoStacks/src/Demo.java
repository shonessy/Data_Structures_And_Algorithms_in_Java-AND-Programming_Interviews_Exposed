
public class Demo {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.add(5);
		queue.add(10);
		queue.add(15);
		queue.add(20);
		
		queue.displayQueue();
		System.out.println("\n");
		
		System.out.println("Remove: " + queue.remove());
		// queue.displayQueue();
		System.out.println("\n");
		
		System.out.println("Remove: " + queue.remove());
		//queue.displayQueue();
		System.out.println("\n");
		
		System.out.println("Add 128 i 129: ");
		queue.add(128);
		queue.add(129);
		queue.displayQueue();
		System.out.println("\n");
		
		System.out.println("Remove: " + queue.remove());
		queue.displayQueue();
		System.out.println("\n");
		
	}

}
