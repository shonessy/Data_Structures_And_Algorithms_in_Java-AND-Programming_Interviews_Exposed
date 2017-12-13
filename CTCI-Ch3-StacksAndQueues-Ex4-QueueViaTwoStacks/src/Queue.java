
public class Queue {
	private MyStack stackNewestFirst;
	private MyStack stackOldestFirst;	// podaci
	
	public Queue() {
		this.stackNewestFirst = new MyStack();
		this.stackOldestFirst = new MyStack();
	}
	
	public void add(int x) {
		// privremeni sadrzaj najnovijih podataka koje treba invertovane dodati na kraj queue
		// ali ako se izvrsi vise uzastopnih dodavanja - cuvati ih i ne vrsiti bespotrebna presipanja na kraj queue
		// praznice se tek kada stackOldestFirst bude potpuno prazan
		// tada ce se obrtanjem stackNewestFirst napraviti stackOldestFirst
		this.stackNewestFirst.push(x);
	}
	
	public int remove() {
		if(stackOldestFirst.isEmpty())
			insertFromNewestToOldest();
		int ret = this.stackOldestFirst.pop();
		
		return ret;
	}
	
	public int peek() {
		if(stackOldestFirst.isEmpty())
			insertFromNewestToOldest();
		return this.stackOldestFirst.peek();
	}
	
	private void insertFromNewestToOldest() {
		// obrni
		while(!stackNewestFirst.isEmpty())	
			stackOldestFirst.push(stackNewestFirst.pop());
	}
	
	public void displayQueue() {
		System.out.print("Queue prvi->zadnji: \t");
		MyStack temp = new MyStack();
		while(!stackNewestFirst.isEmpty())
			temp.push(stackNewestFirst.pop());
		this.stackOldestFirst.displayStack();
		temp.displayStack();
		
		// vrati
		while(!temp.isEmpty())
			stackNewestFirst.push(temp.pop());
		
		
	}

}
