
public class SelectionSort {
	private static int array[];
	
	public static long selectionSrot(int arrayToSort[]) {
		array = arrayToSort;
		long startTime = System.nanoTime();
		for(int i=0; i<array.length-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<array.length; j++)
				if(array[j]<array[minIndex])
					minIndex = j;
			if(minIndex != i)
				swap(i, minIndex);
		}
		
		long stopTime = System.nanoTime();
		return (stopTime - startTime)/1000000;
	}
	
	public static long selectionSrotRecursively(int arrayToSort[]) {
		array = arrayToSort;
		long startTime = System.nanoTime();
		
		selectionSrotRecursively(0);
		
		long stopTime = System.nanoTime();
		return (stopTime - startTime)/1000000;
	}
	
	private static void selectionSrotRecursively(int startIndex) {
		if(startIndex == array.length-1)
			return;
//		int minIndex = findMinElementIndex(startIndex);
//		if(minIndex!=startIndex)
//			swap(array, startIndex, minIndex);
		int minIndex = startIndex;
		for(int j=startIndex+1; j<array.length; j++)
			if(array[j]<array[minIndex])
				minIndex = j;
		if(minIndex != startIndex)
			swap(startIndex, minIndex);
		selectionSrotRecursively(startIndex+1);
		
	}
	
	private static void swap(int startIndex, int stopIndex) {
		int temp = array[startIndex];
		array[startIndex] = array[stopIndex];
		array[stopIndex] = temp;
	}
	
	private static int findMinElementIndex(int startIndex) {
		int minIndex = startIndex;
		for(int j=startIndex+1; j<array.length; j++)
			if(array[j]<array[minIndex])
				minIndex = j;
		return minIndex;
	}
}
