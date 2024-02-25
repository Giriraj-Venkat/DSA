package search;

public class MergeSortedArrays {
	
	static void findMedian(int[] ar1, int[] ar2) {
		
		int i = 0, j = 0, k = 0;
		float median = 0;
		
		int[] mergedAr = new int[ar1.length + ar2.length];
		
		while ((i < ar1.length) && (j < ar2.length) && (k <= (mergedAr.length/2))) {
			
			if(ar1[i] < ar2[j]) {
				mergedAr[k] = ar1[i];
				i++;
				k++;
			} else {
				mergedAr[k] = ar2[j];
				j++;
				k++;
			}
		}
		
		while(i < ar1.length) {
			mergedAr[k] = ar1[i];
			i++;
			k++;
		}
		
		while(j < ar2.length) {
			mergedAr[k] = ar2[j];
			j++;
			k++;
		}
		
		for (int l : mergedAr) {
			
			System.out.print(l);
			System.out.print(" ");
			
		}
		
		if (mergedAr.length % 2 == 0) {
			int mid = mergedAr.length/2;
			median = (float)(mergedAr[mid] + mergedAr[mid-1])/2;
		} else {
			int mid = mergedAr.length/2;
			median = (float)mergedAr[mid];
		}
		System.out.println(" ");
		System.out.println(median);
	}
	
	
	static float findMedianBinarySearch(int[] ar1, int[] ar2) {
		
		if (ar2.length < ar1.length) {
			return findMedianBinarySearch(ar2, ar1);
		}
		
		int l = 0, h = ar1.length;
		
		while (l <= h) {
			
			int m1 = (l + h) / 2;
			int m2 = ((ar1.length + ar2.length + 1) / 2) - m1;
			
			int l1 = (m1 == 0) ? Integer.MIN_VALUE : ar1[m1-1];
			int r1 = (m1 == ar1.length) ? Integer.MAX_VALUE : ar1[m1];
			int l2 = (m2 == 0) ? Integer.MIN_VALUE : ar2[m2-1];
			int r2 = (m2 == ar2.length) ? Integer.MAX_VALUE : ar2[m2];
			
			if ((l1 <= r2) && (l2 <= r1)) {
				
				if ((ar1.length + ar2.length) % 2 == 0) {									
					return ((float)(Integer.max(l1, l2) + Integer.min(r1, r2)) / 2);
				} else {
					return (float)Integer.max(l1, l2);
				}
				
			} else if (l2 > r1) {
				l = m1;
			} else {
				h = m1;
			}
			
			
		}
		
		return 0.0f;
		
	}
	public static void main(String[] args) {
		
		int[] ar1 = {1, 3, 8, 17};
		int[] ar2 = {5, 6, 7, 19, 21, 25};
		
		findMedian(ar1, ar2);
		
		System.out.println(findMedianBinarySearch(ar1, ar2));
	}

}
