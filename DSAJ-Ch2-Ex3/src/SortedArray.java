
public class SortedArray implements Array {
	private int array[];
	private int index;
	
	public SortedArray(int max) {
		this.array = new int[50];
		this.index = 0;
	}
	
	@Override
	public void insert(int e) {
		int i=0;
		for(i=0; i<this.index; i++) 
			if(this.array[i]>e) 
				break;

		for(int j=this.index; j>i; j--)
			this.array[j]=this.array[j-1];
		this.array[i]=e;
		this.index++;
	}

	@Override
	public int find(int e) {
		int lowerLimit = 0;
		int upperLimit = this.index-1;
		while(true) {
			if(lowerLimit > upperLimit)
				return -1;
			int currentIndex = (lowerLimit + upperLimit) / 2;
			if(this.array[currentIndex]==e)
				return currentIndex;
			else if(e > this.array[currentIndex])
				lowerLimit = ++currentIndex;
			else
				upperLimit = --currentIndex;
		}
	}

	@Override
	public boolean delete(int e) {
		int index = this.find(e);
		if(index==-1) {
			System.out.println("Nije pronadjen element niza za brisanje");
			return false;
		}
		for(int i= index; i<this.index; i++)
			this.array[i] = this.array[i+1];
		this.index--;
		System.out.println("Obrisan je element niza na poziciji: " + index);
		return true;
	}

	@Override
	public void display() {
		System.out.println("Niz: ");
		for(int i=0; i< this.index; i++)
			System.out.print(this.array[i] + "\t");
		System.out.println("");

	}

}
