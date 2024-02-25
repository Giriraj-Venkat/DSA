package array;

public class ConsecutiveOnes {
	
	
	//Time Complexity : O(n*n)
	//Auxiliary Space : O(1)
	static int findMaxConsecutiveOnesNaive(int[] ar) {
		
		int count = 0, maxCount = 0;
		
		for(int i = 0; i < ar.length; i++) {
			
			count = 0;
			
			for(int j = i; j < ar.length; j++) {
				
				if(ar[j] == 1) {
					count++;
				} else {										
					break;
				}
				
			}
			
			maxCount = Math.max(maxCount, count);
			
		}
					
		return maxCount;
	}
	
	//Time Complexity : O(n)
	//Auxiliary Space : O(1)
	static int findMaxConsecutiveOnes(int[] ar) {
		
		int count = 0, maxCount = 0;
		
		for(int i = 0; i < ar.length; i++) {
			
			if (ar[i] == 0) {				
				count = 0;
			} else {
				count++;
				maxCount = Math.max(maxCount, count);
			}
		}
		
		
		return maxCount;
	}
	
	public static void main(String[] args) {
		
		int[] ar = {0, 1, 1, 1, 1, 0, 0, 1, 1, 1};
		
		System.out.println(findMaxConsecutiveOnesNaive(ar));
		System.out.println(findMaxConsecutiveOnes(ar));
		
	}

}
