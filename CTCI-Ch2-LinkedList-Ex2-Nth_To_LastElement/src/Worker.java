
public class Worker {
	private String name;
	private int age;
	
	public Worker(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age;
	}

}
