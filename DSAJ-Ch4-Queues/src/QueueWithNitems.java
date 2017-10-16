/******************************************/
// remove ne radi dobro sa size2()
/******************************************/
public class QueueWithNitems implements MyQueue {
	private int[] queue;
	private int front;
	private int end;
	private int nItems;
	
	public QueueWithNitems(int maxSize) {
		this.queue = new int[maxSize];
		this.front = 0;
		this.end = -1;
		this.nItems = 0;
	}
	
	public void insert(int e) {
		if(isFull()) {
			System.out.println("Queue je pun !!!");
			return;
		}
		
		if(end == queue.length-1) 
			end = -1;		
		queue[++end] = e;
		nItems++;				
	}

	@Override
	public int remove() {
		if(isEmpty()) {
			System.out.println("Queue je prazan !!!");
			return -1;
		}
		
		int temp = queue[front];
		if(front == queue.length - 1)
			front = -1;
		front++;
		nItems--;
		return temp;		
	}

	@Override
	public int peek() {
		return queue[front];
	}

	@Override
	public boolean isEmpty() {		
		return nItems == 0;
//		return size2() == 0;
	}

	@Override
	public boolean isFull() {
		return nItems == queue.length;
//		return size2() == queue.length;
	}

	@Override
	public int size() {// TODO Auto-generated method stub
		return nItems;
	}
	
	public int size2() {
		if(end == -1)
			return 0;
		if(end >= front)
			return end - front + 1;
		else 
			return end + 1 + (queue.length - 1 - front + 1);
	}
}
