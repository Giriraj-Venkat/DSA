package array;

public class CheckIfSorted {
	
	static boolean isSorted(int[] ar) {
		
		for (int i = 1; i < ar.length; i++) {			
			if (ar[i] < ar[i-1]) {
				return false;
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		int[] ar = {1, 5, 17};
		
		System.out.println(isSorted(ar));
		
	}

}
