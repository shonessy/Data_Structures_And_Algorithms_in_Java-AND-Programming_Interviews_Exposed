import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite recenicu");
		String s =input.nextLine();
		
		System.out.println("\nObrnute reci sa stack-om:\n\t " + ReverseWords_Stack.reverseWords(s));
		
		System.out.println("\nObrnute reci sa bufferom-om:\n\t " + ReverseWords_Buffer.reverseWords(s));
		
		System.out.println("\nObrnute reci sa \'in-place\':\n\t " + ReverseWords_InPlace.reverseWords(s));

		
		input.close();
	}

}
