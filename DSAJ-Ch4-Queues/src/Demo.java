
public class Demo {

	public static void main(String[] args) {
		 MyQueue queue1 = new QueueWithNitems(5);

		 queue1.insert(54);
		 queue1.insert(92);
		 queue1.insert(70);
		 queue1.insert(16);
		 queue1.insert(41);
		 System.out.println("Size2: " + queue1.size2());
		 
		 queue1.insert(92);
		 System.out.println("Size2: " + queue1.size2());
		 
		 System.out.println("Queue: ");
		 while(!queue1.isEmpty())
			 System.out.print(queue1.remove() + "\t");
		 System.out.println("\nSize2: [0] " + queue1.size2());
		 
		 System.out.println();
		 
		 queue1.insert(54);
		 queue1.insert(92);
		 queue1.insert(70);
		 queue1.insert(16);
		 queue1.insert(41);
		 queue1.remove();
		 queue1.remove();
		 queue1.remove();
		 queue1.insert(100);
		 queue1.insert(200);
		 System.out.println("Size2: " + queue1.size2());
		 
		 System.out.println("Queue: ");
		 while(!queue1.isEmpty())
			 System.out.print(queue1.remove() + "\t");
	}

}
