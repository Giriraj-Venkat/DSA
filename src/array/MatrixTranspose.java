package array;

public class MatrixTranspose {
	
	
	//O(n*n)
	static int[][] transpose(int[][] ar) {
		
		int[][] res = new int[ar.length][ar.length];
		
		
		for (int i = 0; i < ar[0].length; i++) {
			
			for (int j = 0; j < ar.length; j++) {
				res[j][i] = ar[i][j];
			}
		}
		
		return res;
	}
	
	static void transposeMatrix(int[][] matrix) {
		
		int temp = 0;
		
		for (int i = 0; i < matrix[0].length-1; i++) {
			
			for(int j = i + 1; j < matrix[0].length; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		
		int[][] res = { {1, 2, 3, 4},
					   {5, 6, 7, 8},
					   {9, 10, 11, 12},
					   {13, 14, 15, 16}
					 };
		
		//int[][] res = transpose(ar);
		
		transposeMatrix(res);
		
		for (int i = 0; i < res.length; i++) {
			for(int j = 0; j < res.length; j++) {
				System.out.print(res[i][j]+ " ");
			}
			System.out.println();
		}
		}
	
		
		
		
		
	}


