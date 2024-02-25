package array;

public class MatrixZigZag {
	
	static void printZigZag(int[][] ar) {
		
		for (int i = 0; i < ar.length; i++) {
		
			if(i%2 == 0) {
				
				for(int j = 0; j < ar.length; j++) {
					System.out.print(ar[i][j]+ " ");
				}
				
			} else {
				
				for(int j = ar.length-1; j >= 0; j--) {
					System.out.print(ar[i][j]+ " ");
				}
			}
			System.out.println();
		}
					
	}
	
	public static void main(String[] args) {
		
		int[][] ar = {  {1, 2, 3, 4},
						{5, 6, 7, 8},
						{9, 10, 11, 12},
						{13, 14, 15, 16}
					 };
		
		printZigZag(ar);
		}
		
	}


