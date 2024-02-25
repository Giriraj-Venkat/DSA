package recursion;

public class Factorial {
	
	
	/**
	 * 5! = 5 * 4 * 3 * 2 * 1
	 * 
	 * n! = n * (n-1)!
	 * 
	 * This problem can be solved recursively
	 * 
	 * Conditions for Recursion
	 * 
	 * 
	 */
	
	static int fact(int n) {
		
		if (n == 0 || n == 1) {
			return 1;
		}
		
		return n * fact(n-1);
	}
	
	public static void main(String[] args) {
		int n = 3;
		System.out.println(fact(n));
	}

}
