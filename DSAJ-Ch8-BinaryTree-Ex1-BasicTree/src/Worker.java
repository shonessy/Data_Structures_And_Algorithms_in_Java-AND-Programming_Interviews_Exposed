
public class Worker implements Comparable<Worker> {
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
	
	public boolean equals(Worker x) {
		return this.name.equals(x.name) && this.age == x.age;
	}
	
	@Override
	public String toString() {
		return name + "-" + age;
	}

	@Override
	public int compareTo(Worker targetWorker) {
		if(this.age > targetWorker.age)
			return 1;
		else if(this.age < targetWorker.age)
			return -1;
		return 0;
	}

}
