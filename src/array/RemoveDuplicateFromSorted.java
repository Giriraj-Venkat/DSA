package array;

import java.util.Iterator;

public class RemoveDuplicateFromSorted {
	
	static void removeDuplicate(int[] ar) {
		
		int[] uniqueAr = new int[ar.length];
		int rd = 0;
		uniqueAr[rd] = ar[0];
		
		for (int i = 1; i < ar.length; i ++) {
			
			if (uniqueAr[rd] != ar[i]) {
				rd++;
				uniqueAr[rd] = ar[i];
			}
		}
	
		for (int i : uniqueAr) {
			//System.out.print(i+ " ");
		}
		
		rd = 0;
		for (int i = 1; i < ar.length; i++) {
			if (ar[rd] != ar[i]) {
				rd++;
				ar[rd] = ar[i];
			}
		}
		
		for (int i = 0; i <= rd; i++) {
			System.out.print(ar[i]+ " ");
		}
	}
	
	
	public static void main(String[] args) {
		
		int[] ar = {2, 2, 3, 4, 4};
		
		removeDuplicate(ar);
		
		
		
	}

}
