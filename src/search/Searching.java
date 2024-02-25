package search;

public class Searching {

	/**
	 * Binary Search
	 * 
	 *  The element should be sorted
	 *  
     *  Time complexity = O(log n) i.e every iteration the size is cut down by 2
     *  
     *  If non sorted array go for Linear search
     *  
     *  If sorted array go for Binary search
     *  
     *  Sorting Time complexity is O(n log n)
	 */
	public static int binarySearch(int[] ar, int key) {
		
		int l = 0, h = ar.length-1, mid = 0;
		
		while (l <= h) {
			
			mid = (l+h)/2;
			
			if(key == ar[mid]) {
				return mid;
			} else if (key < ar[mid]) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		
		return -1;
		
	}
	
	static int ceil(int[] a, int key) {
		
		int l = 0, h = a.length-1, mid = 0;
		
		while(l <= h) {
			
			mid = (l + h) / 2;
			
			if(key == a[mid]) {
				return a[mid];
			} else if (key < a[mid]) {
				h = mid -1;
			} else {
				l = mid + 1;
			}
			
		}
		
		if (l < a.length) {
			return a[l];
		} else {
			return -1;
		}
		
	}
	
	static int floor(int[] a, int key) {
		
		int l = 0, h = a.length - 1, mid = 0;
		
		while (l <= h) {
			
			mid = (l + h) / 2;
			
			if (key == a[mid]) {
				return a[mid];
			} else if (key < a[mid]) {
				h = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		
		if (h >= 0) {
			return a[h];
		} else {
			return -1;
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] ar = {3, 5, 6, 8, 13, 15, 16, 19, 21};
		int key = 98;
		
		System.out.println(binarySearch(ar, key));
		System.out.println(ceil(ar, key));
		System.out.println(floor(ar, key));
		
	}

}
