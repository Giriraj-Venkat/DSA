package array;

public class MaxSubArray {
	
	//Time Complexity : O(n * n)
	//Auxiliary Space : O(1)
	static int getMaxSum(int[] ar) {
		
		int sum = 0, maxSum = 0;
		
		for (int i = 0; i < ar.length; i++) {
			
			sum = 0;
			for (int j = i; j < ar.length; j++) {
				sum = sum + ar[j];
				maxSum = sum > maxSum ? sum : maxSum;
			}
		}
		
		return maxSum;
		
	}
		
	static int getMaxSumSubArray(int[] ar) {
		
		int sum = ar[0], maxSum = ar[0];
		
		for (int i = 1; i < ar.length; i++) {
			
			if (sum >= 0) {
				sum = sum + ar[i];
				maxSum = sum > maxSum ? sum : maxSum;
			} else {
				sum = ar[i];
			}
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		
		int[] ar = {-1, 3, 4, -5};
		
		System.out.println(getMaxSum(ar));
		System.out.println(getMaxSumSubArray(ar));
		
	}

}
