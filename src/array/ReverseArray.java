package array;

public class ReverseArray {
	
	static void reverse(int[] ar) {
		
		int i = 0, j = ar.length-1;
		
		while (i < j) {
			
			int temp = ar[i];
			
			ar[i] = ar[j];
			ar[j] = temp;
			
			i++;
			j--;
			
		}
		
		System.out.println(ar);
	}
	
	static int[] rev(int[] ar) {
		
		int i = 0, j = ar.length-1, temp = 0;
		
		while (i < j) {
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			i++;
			j--;
		}
		
		return ar;
	}
	
	public static void main(String[] args) {
		
		int[] ar = {1, 5, 7, 9, 17, 18};
		rev(ar);
		
		for (int i : ar) {
			System.out.print(i+ " ");
		}
		
		
	}

}
