
public class Demo {

	public static void main(String[] args) {
		String s = "aabcccccaaa";
		System.out.println("String for Compression: " + s);
		System.out.println("Compressed String: " + compress(s));
	}
	
	private static String compress(String s) {
		StringBuilder sb = new StringBuilder();
		int k = 1;
		for(int i = 0; i < s.length(); i++) {
			if(i<s.length()-1 && s.charAt(i) == s.charAt(i+1))
				k++;
			else {
				sb.append(s.charAt(i));
				sb.append(k);
				k = 1;
			}
		}
		return sb.length() > s.length() ? sb.toString() : s;
	}

}
