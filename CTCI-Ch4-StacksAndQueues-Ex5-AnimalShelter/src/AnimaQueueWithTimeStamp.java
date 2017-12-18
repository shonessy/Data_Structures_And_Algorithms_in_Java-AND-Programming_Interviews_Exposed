import java.util.LinkedList;

public class AnimaQueueWithTimeStamp {
	private LinkedList<Dog> dogQueue = new LinkedList<>();
	private LinkedList<Cat> catQueue = new LinkedList<>();
	
	public void enqueue(Animal a) {
		if(a instanceof Dog)
			dogQueue.addLast((Dog) a);
		else if (a instanceof Cat)
			catQueue.addLast((Cat) a);
	}
	
	public Animal dequeueAny() {
		if(dogQueue.getFirst().timeOfArival <= catQueue.getFirst().timeOfArival)
			return dogQueue.pollFirst();
		else 
			return catQueue.pollFirst();
	}
	
	public Dog dequeueDog() {
		return dogQueue.pollFirst();
	}
	
	public Cat dequeueCat() {
		return catQueue.pollFirst();
	}
	
	
	public void displayDogQueue() {
		System.out.println("-----------------------------------------");
		System.out.println("Dog Queue: ");
		System.out.print("Prvi -> Zadnji: \t");
		for(int i = 0; i < dogQueue.size(); i++)
			System.out.print(dogQueue.get(i).name + "\t");
		System.out.println("\n-----------------------------------------");
	}
	
	public void displayCatQueue() {
		System.out.println("-----------------------------------------");
		System.out.println("Cat Queue: ");
		System.out.print("Prvi -> Zadnji: \t");
		for(int i = 0; i < catQueue.size(); i++)
			System.out.print(catQueue.get(i).name + "\t");
		System.out.println("\n-----------------------------------------");
	}
	
	
	

}
