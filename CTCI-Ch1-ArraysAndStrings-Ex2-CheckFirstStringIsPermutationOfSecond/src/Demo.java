import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		String s1 = "anka";
		String s2 = "kana";
		String s3 = "jakov";
		
		System.out.println("First Approach: ");
		System.out.printf("%s - %s => %b\n", s1, s2, arePermutationsFirstApproach(s1, s2));
		System.out.printf("%s - %s => %b\n", s2, s3, arePermutationsFirstApproach(s2, s3));
		System.out.printf("%s - %s => %b\n", s1, s3, arePermutationsFirstApproach(s1, s3));
		System.out.printf("%s - %s => %b\n", s2, s1, arePermutationsFirstApproach(s2, s1));
		
		System.out.println();
		
		System.out.println("Second Approach: ");
		System.out.printf("%s - %s => %b\n", s1, s2, arePermutationsSecondApproach(s1, s2));
		System.out.printf("%s - %s => %b\n", s2, s3, arePermutationsSecondApproach(s2, s3));
		System.out.printf("%s - %s => %b\n", s1, s3, arePermutationsSecondApproach(s1, s3));
		System.out.printf("%s - %s => %b\n", s2, s1, arePermutationsSecondApproach(s2, s1));
	}
	
	private static String sort(String s) {
		char sArray[] = s.toCharArray();
		Arrays.sort(sArray);
		// ne moze return sArray.toString(), ne znam bas zasto !!!
		return new String(sArray);
	}
	
	private static boolean arePermutationsFirstApproach(String a, String b) {
		if(a.length() != b.length())
			return false;
		return sort(a).equals(sort(b));
	}
	
	private static boolean arePermutationsSecondApproach(String a, String b) {
		if(a.length() != b.length())
			return false;
		
		int indexes[] = new int[128]; 	// assuming ACII 
		for(int i=0; i< a.length(); i++)
			indexes[(int) a.charAt(i)]++;
		
		for(int i=0; i< b.length(); i++) {
			indexes[(int) b.charAt(i)]--;
			if(indexes[(int) a.charAt(i)] < 0)
				return false;
		}
		
		return true;
	}

}
