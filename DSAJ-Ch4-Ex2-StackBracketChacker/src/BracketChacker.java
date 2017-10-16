
public class BracketChacker {
	private static StackX stack;
	private static String expresion;
	
	private static void factory(String expresionS) {
		stack = new StackX(expresionS.length());
		expresion = expresionS;
	}
	
	public static boolean checkBrackets(String expresion) {
		factory(expresion);
		for(char c: expresion.toCharArray()) {
			if(c == '{' || c == '[' || c=='(')
				stack.push(c);
			else if(c == '}' || c == ']' || c==')')
				if(!checkBracket(c))
					return false;
		}
		return true;
	}
	
	private static boolean checkBracket(char c) {
		switch (c) {
		case '}':
			return stack.pop() == '{';
		case ']':
			return stack.pop() == '[';
		case ')':
			return stack.pop() == '(';
		}
		return false;
	}
}
