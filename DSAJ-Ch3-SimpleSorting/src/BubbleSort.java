
public class BubbleSort {
	public static long bubbleSort(int array[]) {
		long startTime= System.nanoTime();
		for(int i=array.length-1; i>=1; i--)
			for(int j=0; j<i; j++) 
				if(array[j]>array[j+1])
					swap(array, j, j+1);
		long stopTime= System.nanoTime();
		return (stopTime - startTime)/1000000;
	}
	
	private static void swap(int array[], int startIndex, int stopIndex) {
		int temp = array[startIndex];
		array[startIndex] = array[stopIndex];
		array[stopIndex] = temp;
	}

}
