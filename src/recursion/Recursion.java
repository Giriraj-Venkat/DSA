package recursion;

public class Recursion {
	
	/**
	 * Recursion
	 * a. Iteration is preferred compared to Recursion
	 *    - Space, Time is better than Recursion in Iteration
	 * 
	 * b. Stack overflow exception will happen in Recursion, 
	 *    if base condition is not defined
	 * 
	 * c. BASE CONDITION is mandatory in RECURSION
	 * 
	 * d. RECURSION ends at BASE CONDITION
	 * 
	 * Pending : Stack frame
	 */
	
	static void fun(int n) {
		System.out.println(n);
		fun(n-1);
	}

	public static void main(String[] args) {
		 fun(3);

	}

}
