package recursion;

public class SumOfDigits {
	
	/**
	 * Recurrence Relation
	 * 
	 * sumOfDigits(N) = sumOfDigits(N/10) + (N%10)
	 * 
	 */
	
	static int sumOfDigits(int n) {
		
		if (n == 0) {
			return 0;
		}
		
		return sumOfDigits(n/10) + (n%10);
	}

	
	public static void main(String[] args) {
		
		int n = 5251;
		System.out.println(sumOfDigits(n));
		
		
		
	}
}
