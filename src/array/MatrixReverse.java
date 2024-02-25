package array;

import java.util.LinkedList;

public class MatrixReverse {
	
	static void reverse(int[][] ar) {
		
		for (int i = 0; i < ar[0].length; i++) {
			
			int l = 0, h = ar[i].length-1, temp = 0;
			
			while(l < h) {
				temp = ar[i][l];
				ar[i][l] = ar[i][h];
				ar[i][h] = temp;
				l++;
				h--;				
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int[][] ar = { {1, 2, 3, 4},
					   {5, 6, 7, 8},
					   {9, 10, 11, 12},
					   {13, 14, 15, 16}
		 			 };
		
		reverse(ar);
		
		for (int i = 0; i < ar[0].length; i++) {
			for(int j = 0; j < ar[0].length; j++) {
				System.out.print(ar[i][j]+ " ");
			}
			System.out.println();
		}
		}
					   
		}
		


