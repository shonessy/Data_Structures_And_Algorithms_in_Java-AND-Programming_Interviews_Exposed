import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		long fact = 25;
		System.out.println("Faktorijel od " + fact + " je: " + BinarySearch.fact(fact));
		
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite duzinu niza: ");
		int n= input.nextInt();
		int array[] = new int[n];
		System.out.println("\nUnesite niz: ");
		for(int i=0; i<n; i++){
			System.out.print((i+1) + ". ");
			array[i]=input.nextInt();
		}
		
		System.out.println("\nUneseni niz: ");
		for(int i=0; i < n; i++)
			System.out.print(array[i] + "\t");
		
		Arrays.sort(array);
		System.out.println("\nSortirani niz: ");
		for(int i=0; i < n; i++)
			System.out.print(array[i] + "\t");
		
		System.out.print("\n\nUnesite broj za pretragu: ");
		int m= input.nextInt();
		System.out.print("Pozicija trazennog broja: " + BinarySearch.binarySearch(array, m, 0, array.length-1));
		
		
	}

}
