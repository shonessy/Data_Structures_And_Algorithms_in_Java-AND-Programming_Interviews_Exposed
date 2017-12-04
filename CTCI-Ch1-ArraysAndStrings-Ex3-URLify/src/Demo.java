
public class Demo {

	public static void main(String[] args) {
		String s = "Zdravo Nemanja kralju...";
		System.out.println("String for URL-fication: " + s);
		
		char sArray[] = new char[s.length()*3];
		for(int i=0; i<s.length(); i++)
			sArray[i] = s.charAt(i);
		
		int nSpaces = 0;
		for(int i=0; i<s.length(); i++)
			if(sArray[i] == ' ')
				nSpaces++;
		
		int newIndex = s.length() + 2*nSpaces - 1;
		for(int i = s.length() - 1; i>=0; i--) {
			if(sArray[i] != ' ')
				sArray[newIndex--] = sArray[i];
			else {
				sArray[newIndex--] = '0';
				sArray[newIndex--] = '2';
				sArray[newIndex--] = '%';
			}
		}
		
		System.out.print("URL-fied string: ");
		for(int i = 0; i<sArray.length; i++)	
			System.out.print(sArray[i]);
	}

}
