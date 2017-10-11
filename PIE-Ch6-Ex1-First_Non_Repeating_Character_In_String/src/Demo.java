import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite string: ");
		
		String s = input.nextLine();
		System.out.println();
		
		NRCharacter nrCharacter = new NRCharacter(s);
		
		System.out.println("String: " + s);
		System.out.println("Prvi ne ponovnljeni karakter: " + nrCharacter.findFirstNonRepeatingCharacter());
		

	}

}
