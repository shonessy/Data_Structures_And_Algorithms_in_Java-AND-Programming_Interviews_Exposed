
public class ReverseWords_Buffer {
	public static String reverseWords(String s) {
		StringBuffer sb = new StringBuffer();
		for(int i=s.length()-1, j=s.length(); i>=0; i--)
			if(s.charAt(i)==' ' || i==0) {
				// sb.append(s.substring(i,j) + ' ');
				sb.append(substring(s, i, j) + ' ');
				j=i;
			}
		return sb.toString();
	}
	
	private static String substring(String s, int start, int stop) {
		StringBuffer sb = new StringBuffer();
		for(int i = start; i< stop; i++)
			sb.append(s.charAt(i));
		return sb.toString();
	}
}
