package search;

public class BitonicArray {
	
	static int ascendingBinarySearch(int[] a, int key, int range) {
		
		int l = 0, m = 0, h = range;
		
		while (l <= h) {
			
			m = (l + h) / 2;
			
			if(a[m] == key) {
				return m;
			} else if (key > a[m]) {
				l = m + 1;
			} else {
				h = m - 1;
			}
						
		}
		
		return -1;
	}
	
	static int decendingBinarySearch(int[] a, int key, int range) {
		
		int l = range, m = 0, h = a.length - 1;
		
		while(l <= h) {
			
			m = (l + h) / 2;
			
			if(a[m] == key) {
				return m;
			} else if (key > a[m]) {
				h = m - 1;
			} else {
				l = m + 1;
			}
		}
		
		return -1;
	}
	
	static int findBitonicPoint(int[] a) {
		
		int l = 0, m = 0, h = a.length - 1;
		
		while (l <= h) {
			
			m = (l + h) / 2;
			
			if ((a[m] > a[m-1]) && a[m] > a[m+1]) {
				return m;
			} else if ((a[m] > a[m-1]) && a[m] < a[m+1]) {
				l = m;
			} else {
				h = m;
			}
			
		}
		
		
		return -1;
	}
	
	static int searchBitonic(int[] a, int key, int bIndex) {
		
		if (key == a[bIndex]) {
			return bIndex;
		} else if (key > a[bIndex]) { //The element cannot be greater than bIndex
			return -1;                //This means element not found in array 
		}
		
		int res1 = ascendingBinarySearch(a, key, bIndex -1);
		if (res1 >= 0) {
			return res1;
		} 
		
		int res2 = decendingBinarySearch(a, key, bIndex + 1);
		if (res2 >= 0) {
			return res2;
		}
		
		
		
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] a = {5, 7, 9, 10, 3, 2 , 1};
		
		int bIndex = findBitonicPoint(a);
		
		int key = 2;
		
		System.out.println(searchBitonic(a, key, bIndex));
		
		//int[] b = {5, 7, 9, 10, 12, 19};
		//System.out.println(ascendingBinarySearch(b, 12));
		
		//int[] c = {19, 17, 14, 10, 3, 2, 1};
		//System.out.println(decendingBinarySearch(c, 10));
		
	}

}
