package search;

public class FIrstLastIndex {
	
	static int[] findFirstLast(int[] a, int key) {
		
		int l = 0, m = 0, h = a.length-1;
		int[] res = {-1, -1};
		
		while (l <= h) {
			
			m = (l + h) / 2;
			
			if (a[m] == key) {
				res[0] = m;
				h = m -1;
			} else if (a[m] < key) {
				l = m + 1;
			} else {
				h = m - 1;
			}
		}
		
		l = 0;
		m = 0;
		h = a.length-1;;
		
		while (l <= h) {
			
			m = (l + h) / 2;
			
			if (a[m] == key) {
				res[1] = m;
				l = m + 1;
			} else if (a[m] < key) {
				l = m + 1;
			} else {
				h = m -1;
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		int[] a = {3, 4, 4, 4, 4, 4, 5};
		int key = 4;
		
		int[] res = findFirstLast(a, key);
		
		System.out.println(res[0] + " "+res[1]);
	}

}
