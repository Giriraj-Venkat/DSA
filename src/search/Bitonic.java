package search;

public class Bitonic {
	
	static int findBitonic(int[] a) {
		
		int l = 0, m = 0, h = a.length-1;
		
		while(l <= h) {
			
			m = (l + h) / 2;
			
			if ((a[m] > a[m-1]) && (a[m] > a[m+1])) {
				return m;
			} else if ((a[m] > a[m-1]) && (a[m] < a[m+1])) {
				l = m;
			} else {
				h = m;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] a = {5, 9, 12, 20, 5, 3, 2, 1};
		
		System.out.println(findBitonic(a));
	}

}
