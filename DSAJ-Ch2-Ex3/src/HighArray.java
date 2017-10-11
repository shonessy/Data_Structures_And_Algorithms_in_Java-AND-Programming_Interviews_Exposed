
public class HighArray implements Array{
	private int array[];
	private int index;
	
	public HighArray(int max) {
		this.array = new int[max];
		this.index = 0;
	}
	
	public void insert(int e) {
		this.array[this.index++] = e;
	}
	
	public int find(int e) {
		for(int i=0; i<this.array.length; i++)
			if(this.array[i]==e)
				return i;
		return -1;
	}
	
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
	
	public void display() {
		System.out.println("Niz: ");
		for(int i=0; i< this.index; i++)
			System.out.print(this.array[i] + "\t");
		System.out.println("");
	}
}
