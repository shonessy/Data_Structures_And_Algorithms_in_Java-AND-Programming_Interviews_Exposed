
public class Demo {

	public static void main(String[] args) {
//		AnimaQueue animalQueue = new AnimaQueue();
		AnimaQueueWithTimeStamp animalQueue = new AnimaQueueWithTimeStamp();
		animalQueue.enqueue(new Dog("Pas-Dzeki"));
		animalQueue.enqueue(new Dog("Pas-Rici"));
		animalQueue.enqueue(new Cat("Macka-Maca"));
		animalQueue.enqueue(new Dog("Pas-Barni"));
		animalQueue.enqueue(new Cat("Macka-Kiti"));
		animalQueue.enqueue(new Cat("Macka-Mica"));
		
		
//		animalQueue.displayAnimalQueue();
		animalQueue.displayDogQueue();
		animalQueue.displayCatQueue();
		
		System.out.println("Usvajanje Bilo koga: " + animalQueue.dequeueAny().name);
		System.out.println("Usvajanje Psa: " + animalQueue.dequeueDog().name);
		System.out.println("Usvajanje Macke: " + animalQueue.dequeueCat().name);
		
//		animalQueue.displayAnimalQueue();
		animalQueue.displayDogQueue();
		animalQueue.displayCatQueue();
	}

}
