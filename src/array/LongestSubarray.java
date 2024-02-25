package array;

public class LongestSubarray {
	
	
	//Time Complexity : O(n*n)
	//Auxiliary Space : O(1)
	static int getLongest(int[] ar) {
		
		int count = 0, maxCount = 0;
		
		for(int i = 0; i < ar.length; i++) {
			
			count = 1;
			
			for (int j = i+1; j < ar.length; j++) {
				
				if ((ar[j]%2 == 0 && ar[j-1]%2 != 0)
						|| (ar[j]%2 != 0 && ar[j-1]%2 == 0)) {
					count++;
				} else {
					break;
				}
			}
			
			maxCount = count > maxCount ? count : maxCount;
		}
		
		
		
		return maxCount;
	}
	
	static int getLongestOddEven(int[] ar) {
		
		int count = 1, maxCount = 1;
		
		for(int i = 1; i < ar.length; i++) {
			
			
			if ((ar[i]%2 == 0 && ar[i-1]%2 != 0) || (ar[i]%2 != 0 && ar[i-1]%2 == 0)) {
				count++;
				maxCount = count > maxCount ? count : maxCount;
			} else {
				count = 1;
			}
		}
		
		return maxCount;
	}
	
	public static void main(String[] args) {
		
		int[] ar = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.println(getLongest(ar));
		System.out.println(getLongestOddEven(ar));
		
	}

}
