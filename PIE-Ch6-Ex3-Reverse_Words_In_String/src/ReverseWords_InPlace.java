
public class ReverseWords_InPlace {
	private static StringBuffer text;
	
	public static String reverseWords(String s) {
		text = new StringBuffer(s);
		reverseText(0, text.length()-1);
		reverseWords();
		return text.toString();
	}	
	
	private static void reverseText(int start, int stop) {		
		while(start < stop) {
			swap(start, stop);
			start++;
			stop--;
		}
	}
	
	private static void swap(int start, int stop) {
		char temp = text.charAt(start);
		text.setCharAt(start, text.charAt(stop));
		text.setCharAt(stop, temp);
	}
	
	private static void reverseWords() {
		for(int i=0, j=0; i< text.length(); i++)
			if(text.charAt(i)==' ') {
				reverseText(j, i-1);
				j=i+1;
			}
			else if(i == text.length()-1)
				reverseText(j, i);
	}
}
