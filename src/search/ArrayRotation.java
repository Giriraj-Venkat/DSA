package search;

public class ArrayRotation {
	
	static void rotate(int[] ar, int r) {
		
		int i = 0, j = ar.length - r, temp = 0;
		
		while (i < r) {
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			i++;
			j++;
		}
		
		for (int k : ar) {
			System.out.print(k+ " ");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int[] ar = {1, 2, 3, 4, 5};
		
		rotate(ar, 2);
		
	}

}
