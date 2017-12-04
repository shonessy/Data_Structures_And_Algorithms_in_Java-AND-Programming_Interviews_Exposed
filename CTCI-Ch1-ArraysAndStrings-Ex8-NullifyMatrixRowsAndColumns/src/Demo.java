
public class Demo {

	public static void main(String[] args) {
		System.out.println("Matrica");
		int m = 4;
		int n = 5;
		int matrix[][] = createMatrix(m, n);
		displayMatrix(matrix);
		System.out.println();

		System.out.println("Postavljam nule: ");
		matrix[2][4] = 0;
		matrix[1][1] = 0;
		displayMatrix(matrix);
		System.out.println();
		
		System.out.println("Nulifikacija redova i kolona: ");
		matrix = setZeros(matrix);
		displayMatrix(matrix);
		System.out.println();		

	}
	
	public static int[][] setZeros(int matrix[][]) {
		boolean rowsWithZeros[] = new boolean[matrix.length];
		boolean columnsWithZeros[] = new boolean[matrix[0].length];
		for(int i= 0; i< matrix.length; i++)
			for(int j = 0; j< matrix[0].length; j++)
				if(matrix[i][j]==0) {
					rowsWithZeros[i] = true;
					columnsWithZeros[j] = true;
				}
		
		for(int i = 0; i< rowsWithZeros.length; i++)
			if(rowsWithZeros[i])
				matrix = nullifyRow(matrix, i);
		
		for(int i = 0; i< columnsWithZeros.length; i++)
			if(columnsWithZeros[i])
				matrix = nullifyColumn(matrix, i);
		
		return matrix;
	}
	
	/**
	 * Nije zavrseno
	 * @param matrix
	 * @return
	 */
	public static int[][] setZerosAdvance(int matrix[][]){
		return matrix;
	}
	
	public static int[][] createMatrix(int m, int n) {
		int ret[][] = new int[m][n];
		for(int i= 0; i< m; i++)
			for(int j= 0; j< n; j++)
				ret[i][j] = (int)(Math.random()*100 + Math.random()*10);
		return ret;
	}
	
	public static void displayMatrix(int matrix[][]) {
		for(int i= 0; i< matrix.length; i++) {
			for(int j= 0; j< matrix[0].length; j++)
				System.out.print(matrix[i][j] + "\t");
			System.out.println();
		}
	}
	
	public static int[][] nullifyRow(int matrix[][], int row) {
		for(int i = 0; i < matrix[0].length; i++)
			matrix[row][i] = 0;
		return matrix;
	}
	
	public static int[][] nullifyColumn(int matrix[][], int column) {
		for(int i = 0; i < matrix.length; i++)
			matrix[i][column] = 0;
		return matrix;
	}

}
