
public class Demo {

	public static void main(String[] args) {
		String expresion = "3+2*(8+{45*[159]+(16+2)}-19)+45*8";
		System.out.println("Izraz: " + expresion);
		
		System.out.println("Izraz ispravan: " + BracketChacker.checkBrackets(expresion));
		
		System.out.println();
		
		expresion = "3+2*(8+{45*[159]]+(16+2)}-19)+45*8";
		System.out.println("Izraz: " + expresion);
		
		System.out.println("Izraz ispravan: " + BracketChacker.checkBrackets(expresion));

	}

}
