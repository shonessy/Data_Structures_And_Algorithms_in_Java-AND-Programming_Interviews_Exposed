
public class RemoveCharacters {
	
	public static String removeChars(String str, String remove ) {
		boolean rem[] = new boolean[128];
		for(int i=0; i< remove.length(); i++)
			rem[remove.charAt(i)] = true;
		StringBuffer ret = new StringBuffer();
		for(int i=0; i< str.length(); i++)
			if(!rem[str.charAt(i)])
				ret.append(str.charAt(i));
		return ret.toString();
	}
}
