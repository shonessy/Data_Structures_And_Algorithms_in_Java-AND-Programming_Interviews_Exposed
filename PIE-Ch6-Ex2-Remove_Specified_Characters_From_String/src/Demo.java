import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite string: ");
		String str = input.nextLine();
		System.out.println("\nUnesite karaktere za izbacivanje: ");
		String rem= input.nextLine();
		
		System.out.println("\nRezultujuci string: " + RemoveCharacters.removeChars(str, rem));
		
		

	}

}
