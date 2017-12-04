
public class Demo {
	public static void main(String args[]) {
		System.out.println("Originalna Matrica: ");
		int n = 4;
		int matrix[][] = createMatrix(n);
		displayMatrix(matrix);
		
		System.out.println();
		System.out.println("Rotirana Matrica: ");
		
		rotateMatrix(matrix);
		displayMatrix(matrix);
		
	}
	
	public static int[][] createMatrix(int n) {
		int ret[][] = new int[n][n];
		for(int i= 0; i< n; i++)
			for(int j= 0; j< n; j++)
				ret[i][j] = (int)(Math.random()*100 + Math.random()*100);
		return ret;
	}
	
	public static void displayMatrix(int matrix[][]) {
		for(int i= 0; i< matrix.length; i++) {
			for(int j= 0; j< matrix.length; j++)
				System.out.print(matrix[i][j] + "\t");
			System.out.println();
		}
	}
	
	public static void rotateMatrix(int matrix[][]) {
		int top;
		for(int i= 0; i< matrix.length/2; i++) {
			int last = matrix.length - 1 - i;
			for(int j= i; j< last; j++) {
				top = matrix[i][j];
				int offset = j - i;
				
				matrix[i][j] = matrix[last - offset][i];
				matrix[last - offset][i] = matrix[last][last - offset];
				matrix[last][last - offset] = matrix[j][last];
				matrix[j][last] = top;
			}
		}
	}
}
