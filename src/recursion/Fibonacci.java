package recursion;

public class Fibonacci {
	
	/**
	 * Fibonacci Series : 1 1 2 3 5 8 13 21
	 * 
	 *  CONDITIONs for RECURSION
	 *  ------------------------
	 *  1. Can it be broken down to smaller problem
	 *  
	 *     N th value    = (N-1) th value + (N-2) th value
	 *     8 (6th value) = 5 (5th value)  + 3 (4th value)
	 *     So each value is smaller problem
	 *  
	 *  2. Are the results dependent on each other
	 *     
	 *     N th value depends on (N-1) and (N-2) value 
	 *  
	 *  3. Does it have base condition   
	 *  
	 *     2nd and 1st values are fixed. It not required (N-1) and (N-2) value
	 *     
	 *  Write the solutions as Recurrence Relation
	 *  
	 *       fibo(n) = fibo(n-1) + fibo(n-2)
	 *       
	 *                       f(5)
	 *                   /           \
	 *                  /             \
	 *               f(4)            f(3)
	 *               / \              / \
	 *              /   \            /   \
	 *           f(3)  f(2) <--leaf  f(2)  f(1) <--leaf   
	 *            /\ 
	 *           /  \ 
	 *        f(2)  f(1) <-- leaf 
	 *        
	 *        Leafs are always the BASE Condition
	 */
	
	static int fibo(int n) {
		
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibo(n-1) + fibo(n-2);
	}
	
	public static void main(String[] args) {
		
		int n = 8;
		System.out.println(fibo(n));
	}

}
