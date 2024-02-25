package recursion;

public class CountDigits {
	/**
	 * N = 12345		--> Add +1 in counter
	 * N = N/10 = 1234  --> Add +1 in counter
	 * N = N/10 = 123   --> Add +1 in counter
	 * N = N/10 = 12    --> Add +1 in counter
	 * N = N/10 = 1     --> Add +1 in counter
	 * 
	 * Counter value is 5. So number of digit is 5
	 * 
	 * formula
	 * countDigits(N) = countDigits(N/10) + 1
	 * 
	 */
	
	static int countDigits(int n) {
		
		if (n == 0) {
			return 0;
		}
		
		return countDigits(n/10) + 1;
	}
	public static void main(String[] args) {
		
		System.out.println(countDigits(12345));
		
	}

}
