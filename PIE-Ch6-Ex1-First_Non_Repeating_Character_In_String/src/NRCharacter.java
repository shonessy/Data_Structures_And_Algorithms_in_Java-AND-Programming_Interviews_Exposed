
public class NRCharacter {
	private String text;
	
	public NRCharacter(String text) {
		this.text = text;
	}
	
	public char findFirstNonRepeatingCharacter() {
		char allChars[] = new char[128];
		
		for(int i =0; i< text.length(); i++) {
			char index = text.charAt(i);
			allChars[index]++;
		}			
		
		for(int i=0; i<this.text.length(); i++) {
			char c = this.text.charAt(i);
			if(allChars[c]==1) {
				return c;
			}
		}
		return (char) -1;
	}
}
