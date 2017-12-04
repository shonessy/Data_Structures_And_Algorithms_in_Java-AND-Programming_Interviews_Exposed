
public class Demo {

	// nije case-sensitive, ignorisu se non-leter karakteri
	public static void main(String[] args) {
		String s = "Tact Coa";
		System.out.println("String za provjeru: " + s);
		System.out.println("Da li je permutacija: " + isPalidromePermutation(s));
		
		System.out.println();
		
		s = "Coca Cola";
		System.out.println("String za provjeru: " + s);
		System.out.println("Da li je permutacija: " + isPalidromePermutation(s));
		
		
	}
	
	private static boolean isPalidromePermutation(String s) {
		s = s.toLowerCase();
		int charCounts[] = new int[128];
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') 
				charCounts[(int)s.charAt(i)]++;
		}
		
		int nOdds = 0;
		for(int i=0; i<charCounts.length; i++) {
			if(charCounts[i]%2 !=0) {
				nOdds++;
				if(nOdds > 1) {
					return false;
				}
			}
		}
		return true;
	}

}
