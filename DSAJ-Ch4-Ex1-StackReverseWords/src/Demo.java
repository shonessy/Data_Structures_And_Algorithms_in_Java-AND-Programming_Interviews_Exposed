
public class Demo {

	public static void main(String[] args) {
		String word = "Ana Bekuta";
		System.out.println("Originalna rec: " + word);
		StackX stack = new StackX(50);
		for(char x: word.toCharArray())
			stack.push(x);
		StringBuffer sb = new StringBuffer();
		while(!stack.isEmpty())
			sb.append(stack.pop());
		System.out.println("Inverovana rec: " + sb.toString());

	}

}
