package recursion;

public class SubsetSum {
	
	
	static int countSubsets(int[] ar, int sum, int i) {
		
		if (sum == 0) {
			return 1;
		} else if (sum < 0) {
			return 0;
		} else if (i == ar.length) {
			return 0;
		}
		
		return countSubsets(ar, sum - ar[i], i+1) + countSubsets(ar, sum, i+1);
		
		/*if (sum == 0) {
		  return 1;
		} else if (sum < 0) {
			return 0;
		} else if (i < 0) {
			return 0;
		}
		
		return countSubsets(ar, sum - ar[i], i-1) + countSubsets(ar, sum, i-1);*/
		
		
		
	}
	public static void main(String[] args) {
		
		int sum  = 25;
		int[] ar = {10, 20, 15, 5, 25};
		
		System.out.println(countSubsets(ar, sum, ar.length-1));
		
	}

}
