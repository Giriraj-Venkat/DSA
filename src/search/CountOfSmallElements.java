package search;

public class CountOfSmallElements {
	
	static int countSmallAndEqualElements(int[] a, int key) {
		
		int l = 0, m = 0, h = a.length - 1;
		
		while (l <= h) {
			
			m = (l + h) / 2;
			
			if(key == a[m]) {
				//To chck duplicate
				while(((m+1) < a.length) && (key == a[m+1])) {
					m++;
				}
				
				break;
				
			} else if (key < a[m]) {
				  h = m -1;
			} else {
				  l = m + 1;
			}
		}
		
		//In case key not found
		if (key < a[m]) {
			return m;
		} else {
			return m + 1;
		}
	}
	
	public static void main(String[] args) {
		//int[] a = {2, 6, 12, 18, 21, 26, 33, 44};
		//int[] a = {2, 6, 12, 18, 21, 26, 26, 26};
		int[] a = {2, 6, 12, 18, 21, 26, 33, 44};
		
		System.out.println(countSmallAndEqualElements(a, 25));
	}
	
	
}
