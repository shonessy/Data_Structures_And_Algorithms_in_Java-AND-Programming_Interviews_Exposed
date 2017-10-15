
public class Euclid {
	
	public static int gdc(int a, int b) {
		if(a == 0  || b ==0)
			return -1;
		else if(a==b)
			return a;
		else if(a<b)
			return gdc_i(b, a);
		else
			return gdc_i(a,b);
	}
	
	private static int gdc_i(int a, int b) {
		if(b==0)
			return a;
		else
			return gdc_i(b, a%b);
	}

}
