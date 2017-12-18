import java.util.Iterator;
import java.util.LinkedList;

public class AnimaQueue {
	private LinkedList<Animal> animalQueue = new LinkedList<>();
	private LinkedList<Dog> dogQueue = new LinkedList<>();
	private LinkedList<Cat> catQueue = new LinkedList<>();
	
	public void enqueue(Animal a) {
		animalQueue.addLast(a);
		if(a instanceof Dog)
			dogQueue.addLast((Dog) a);
		else if (a instanceof Cat)
			catQueue.addLast((Cat) a);
	}
	
	public Animal dequeueAny() {
		Animal ret = animalQueue.pollFirst();
		if(ret instanceof Dog)
			dogQueue.pollFirst();
		else if (ret instanceof Cat)
			catQueue.pollFirst();
		return ret;
	}
	
	public Dog dequeueDog() {
		Dog ret = dogQueue.pollFirst();
		Iterator<Animal> iterator = animalQueue.listIterator();
		while(iterator.hasNext()) {
			if(iterator.next() instanceof Dog) {
				iterator.remove();
				break;
			}
		}

		return ret;
	}
	
	public Cat dequeueCat() {
		Cat ret = catQueue.pollFirst();
		Iterator<Animal> iterator = animalQueue.listIterator();
		while(iterator.hasNext()) {
			if(iterator.next() instanceof Cat) {
				iterator.remove();
				break;
			}
		}
		return ret;
	}
	
	public void displayAnimalQueue() {
		System.out.println("-----------------------------------------");
		System.out.println("Animal Queue: ");
		System.out.print("Prvi -> Zadnji: \t");
		for(int i = 0; i < animalQueue.size(); i++)
			System.out.print(animalQueue.get(i).name + "\t");
		System.out.println("\n-----------------------------------------");
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
