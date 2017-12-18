
public class Animal {
	public String name;
	public long timeOfArival;
	
	public Animal(String name) {
		this.name = name;
		this.timeOfArival = System.nanoTime();
	}

}
