
public class InsertionSort {
	
	public static long insertionSort(int array[]) {
		long startTime = System.nanoTime();
		// MOJ
//		for(int i=1; i<array.length; i++) {
//			int temp = array[i];
//			int j=i-1;			
//			while(j>=0 && array[j] >= temp) {
//				array[j+1] = array[j];
//				j--;
//			}		
//			if(i!=j)
//				array[j+1] = temp;
//		}
		
		// KNJIGA
		for(int i=1; i<array.length; i++) {
			int temp = array[i];
			int j=i;			
			while(j>0 && temp <= array[j-1]) {
				array[j] = array[j-1];
				j--;
			}		
			if(i!=j)
				array[j] = temp;
		}
		long stopTime = System.nanoTime();
		return (stopTime - startTime)/1000000;
	}

}
