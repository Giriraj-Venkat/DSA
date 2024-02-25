package recursion;

public class SumOfArray {
	
	/**
	 * Sum Of Array
	 * 
	 * sum(a[]) = sum(a[0], a[1]... a[n-2]) + a[n]
	 * 
	 */
	
	static int sum(int arr[], int index) {
		
		//Last index to First index
		
		if (index < 0) {
			return 0;
		}
				
		return sum(arr,index-1) + arr[index];
		
		//First index to Last index
		
		/*if (index >= arr.length) {
			return 0;
		}
		
		return sum(arr, index + 1) + arr[index];*/
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4};
		
		//System.out.println(sum(arr,arr.length-1));
		System.out.println(sum(arr,0));
		
	}

}
