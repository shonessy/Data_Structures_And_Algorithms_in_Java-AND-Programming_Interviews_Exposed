
public class BinarySearch {
	
	public static int binarySearch(int array[], int targer, int startIndex, int stopIndex) {
		if(startIndex>stopIndex)
			return -1;
		int middleIndex = (startIndex + stopIndex)/2;
		if(array[middleIndex]==targer)
			return middleIndex;
		else if(array[middleIndex]>targer)
			return binarySearch(array, targer, startIndex, middleIndex-1);
		else
			return binarySearch(array, targer, middleIndex+1, stopIndex);
	}
	
	public static long fact(long n) {
		if(n<=1)
			return 1;
		return n*fact(n-1);
	}
}
