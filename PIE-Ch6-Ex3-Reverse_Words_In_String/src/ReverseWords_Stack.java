import java.util.Stack;

public class ReverseWords_Stack {
	public static String reverseWords(String s) {
		Stack<String> stack = new Stack<String>();
		for(int i=0, j=0; i< s.length(); i++) {
			if(s.charAt(i)==' ') {
				stack.push(s.substring(j, i) + " ");
				j=i+1;
			}
			else if(i == s.length()-1)
				stack.push(s.substring(j, i+1) + " ");
		}
		StringBuffer ret = new StringBuffer();
		while(!stack.empty())
			ret.append(stack.pop());
		return ret.toString();
	}
}
