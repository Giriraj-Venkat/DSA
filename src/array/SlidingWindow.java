package array;

public class SlidingWindow {
	
	static int getMaxSum(int[] ar, int k) {
		
		int sum = 0, maxSum = Integer.MIN_VALUE;
		
		for(int i = 0; i < ar.length-k; i++) {
			
			sum = 0;
			for (int j = i; j < i + k; j++) {
				sum = sum + ar[j];
			}
			
			maxSum = sum > maxSum ? sum : maxSum;
		}
		
		return maxSum;
	}
	
	
	static int getMax(int[] ar, int k)  {
		
		int wSum = 0, mSum = Integer.MIN_VALUE;
		
		for (int i = 0; i < k; i++) {
			wSum = wSum + ar[i];
		}
		
		mSum = wSum > mSum ? wSum : mSum;
		
		for (int j = k; j < ar.length; j++) {
			
			wSum = wSum - ar[j-k] + ar[j];
			mSum = wSum > mSum ? wSum : mSum;
		}
		
		return mSum;
	}
	
	public static void main(String[] args) {
		
		int[] ar = {2, 9, 31, -4, 21, 7};
		int k = 1;
		
		System.out.println(getMaxSum(ar, k));
		System.out.println(getMax(ar, k));
	}

}
