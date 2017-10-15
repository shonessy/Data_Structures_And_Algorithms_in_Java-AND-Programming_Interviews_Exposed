
/**
 * http://introcs.cs.princeton.edu/java/23recursion/Permutations.java.html
 * @author Kucni
 *
 */
public class StringPermutations {
	private static int count = 0;
	
	public static void perm(String s) {
		char text[] = s.toCharArray();
		perm(text, text.length);
	}
	
	private static void perm(char text[], int n) {
		if(n == 1) {
			System.out.println( (++count) + ". " + new String(text));
			return;
		}
		for(int i=0; i<n; i++) {
			swap(text, i, n-1);
			perm(text, n-1);
			swap(text, i, n-1);
		}
	}
	
	private static void swap(char text[], int startIndex, int stopIndex) {
		char temp = text[startIndex];
		text[startIndex]=text[stopIndex];
		text[stopIndex] = temp;
	}
}
