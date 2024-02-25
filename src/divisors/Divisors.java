package divisors;

import java.util.Scanner;

public class Divisors {
	
	//Brute Force Approach
	static void printDivisorsBF(int n) {
		
		for (int i = 1; i <= n; i++) { // n + 1 times
			if (n%i == 0) { //n times
				System.out.println(i);
			}
		}
		//Time complexity 
		//2n+1 = O(n)
		// Size of input increase and time also increase linearly
		
	}
	
	// Efficient Approach
	//n = 40
	/*
	 * Factors
	 * a * b = n
	 * 1 * 40
	 * 2 * 20
	 * 4 * 10
	 * 5 * 8
	 * Observations
	 * 1. Divisors can be made into pairs
	 * 2. a <= b then a * a <= n (if n is 25 a <= b)
	 *    a^2 <= n
	 *    a <= root(n) so first divisor i.e a is always <= root(n) or before root(n)
	 *    so we can iterate for loop till root(n) to find first divisor
	 * 3. Second divisor b = n/a
	 */
	
		static void printDivisors(int n) {
			
			// This prints not in ascending order
			/*for (int i = 1; i*i <= n; i++) { 
				//for (int i = 1; i <= Math.sqrt(n); i++) {
				if (n%i == 0) { //n times
					System.out.println(i);
					
					if (i != n/i) { // This condition is for not printing divisors twice
						System.out.println(n/i);	
					}
					
				}
			}*/ 
			//Time complexity O(root(n))
			
			// Print in Ascending order
			int i = 0;
			for (i = 1; i*i <= n; i++) { //root(n) times
				//for (int i = 1; i <= Math.sqrt(n); i++) {
				if (n%i == 0) { //n times
					System.out.println(i);				
					}
					
				}
			for ( ; i >= 1; i--) { //root(n) times
				if (n%i == 0 & i != n/i) { //n times
					System.out.println(n/i);				
					}
			}
			// 2*root(n) times
			//Time complexity O(root(n)) 
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		printDivisorsBF(n);

	}

}
