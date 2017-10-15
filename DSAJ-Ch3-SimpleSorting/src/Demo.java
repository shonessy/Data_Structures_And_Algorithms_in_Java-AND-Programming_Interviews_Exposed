import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int array[] = new int[4_000];
		fillArray(array);
		
//		System.out.println("Nesortirani niz: ");		
//		printArray(array);
		
		System.out.println("\n****************************\n");
		
		// ----------------------------------------------------------//
		// bubble sort
		int bubbleArray[] = copyArray(array);
		System.out.println("Bubble Sort: ");
		long time =BubbleSort.bubbleSort(bubbleArray);
//		System.out.println("\nSortirani niz: ");
//		printArray(bubbleArray);
		System.out.println("Vrijeme sortiranja: " + time + "[ms]");
		// ----------------------------------------------------------//
		
		System.out.println("\n****************************\n");
		
		// ----------------------------------------------------------//
		//selection sort
		int selectionArray[] = copyArray(array);
		System.out.println("Selection Sort: ");
		time =SelectionSort.selectionSrot(selectionArray);
//		System.out.println("\nSortirani niz: ");
//		printArray(selectionArray);
		System.out.println("Vrijeme sortiranja: " + time + "[ms]");
		// ----------------------------------------------------------//
		
		System.out.println("\n****************************\n");
		
		// ----------------------------------------------------------//
		//selection sort Recursively
		int selectionRecursivArray[] = copyArray(array);
		System.out.println("Recursive Selection Sort: ");
		time =SelectionSort.selectionSrotRecursively(selectionRecursivArray);
//		System.out.println("\nSortirani niz: ");
//		printArray(selectionArray);
		System.out.println("Vrijeme sortiranja: " + time + "[ms]");
		// ----------------------------------------------------------//
		
		System.out.println("\n****************************\n");
		
		// ----------------------------------------------------------//
		//insertion sort
		int insertionArray[] = copyArray(array);
		System.out.println("Insertion Sort: ");
		time =InsertionSort.insertionSort(insertionArray);
//		System.out.println("\nSortirani niz: ");
//		printArray(insertionArray);
		System.out.println("Vrijeme sortiranja: " + time + "[ms]");
		// ----------------------------------------------------------//
		
		System.out.println("\n****************************\n");
		
		// ----------------------------------------------------------//
		//test
		System.out.println("BubbleSort == SelectionSort: " + Arrays.equals(bubbleArray,selectionArray));
		System.out.println("BubbleSort == SelectionRecursiveSort: " + Arrays.equals(selectionArray, selectionRecursivArray));
		System.out.println("BubbleSort == InsertionSort: " + Arrays.equals(bubbleArray, insertionArray));		
		System.out.println("SelectionSort == InsertionSort: " + Arrays.equals(selectionArray, insertionArray));		
		// ----------------------------------------------------------//
		
	}
	
	private static void printArray(int array[]) {
		for(int i=0; i<array.length; i++)
			System.out.print(array[i] + "\t");
		System.out.println();
	}
	
	private static void fillArray(int array[]) {
		for(int i=0; i< array.length; i++)
			array[i]=(int)Math.ceil(Math.random()*array.length*100);
	}
	
	private static int[] copyArray(int from[]) {
		int to[] = new int[from.length];
		for(int i=0; i<from.length; i++)
			to[i]=from[i];
		return to;
	}

}
