
public class Demo {
	public static void main(String args[]) {
		String s1 = "palee";
		String s2 = "pale";
		
		System.out.println("S1: " + s1);
		System.out.println("S2: " + s2);
		
		System.out.println();
		
		System.out.println("One edit away: " + areOneEditAway(s1, s2));
	}
	
	private static boolean areOneEditAway(String a, String b) {
		if(a.equals(b))
			return true;
		if(Math.abs(a.length() - b.length())>1)
			return false;
		
		String longerString = a.length() >= b.length() ? a : b;
		String shorterString = a.length() < b.length() ? a : b;
		int letters[] = new int[128];
		for(int i = 0; i < longerString.length(); i++) {
			letters[(int)longerString.charAt(i)]++;
			if(i < shorterString.length())
				letters[(int)shorterString.charAt(i)]--;
		}
		
//		for(int i = 0; i < a.length(); i++)
//			letters[(int)a.charAt(i)]++;
//		for(int i = 0; i < b.length(); i++)
//			letters[(int)b.charAt(i)]--;
		
		int x = 0;
		for(int i = 0; i < letters.length; i++)
			if(letters[i] != 0)
				x++;
		
		if(a.length() == b.length() && x<=2)
			return true;
		return x<=1;
	}
}
