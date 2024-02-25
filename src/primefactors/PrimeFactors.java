package primefactors;

import java.util.Scanner;

public class PrimeFactors {
	
	//n = 40 => 2 * 2 * 2 * 5 are Prime factors
	
	// Observation 1
	// all factors of given number, if we reorder it will be same number of prime numbers
	// 2 * 20 => 2 * 2 * 2 * 5
	// 4 * 10 => 2 * 2 * 2 * 5
	// 5 * 8  => 5 * 2 * 2 * 2
	
	// Observation 2
	// If one prime number divides n as much as possible, then that numbers multiple cannot divide the new n
	// n = 900
	// 1st prime divisor is 2
	// n = 900 / 2 = 450
	// n = 450 / 2 = 225
	// Now the multiples of cannot divide the updates n. i.e 4 cannot divide 225
	
	// Time Complexity
	// If n = prime number then loop will take n times
	// Time Complexity is O(n) in Worst case
	static void primeFactorsBF(int n) {
		
		int i = 2;
		
		while (n > 1) {
		
		while (n%i == 0) {
			System.out.println(i);
			n = n/i;
		}
		i++;
		
		}
		
	}
	
	
	// The first factor can be found before root(n)
	// Time complexity is O(root(n)log n)
	static void primeFactors(int n) {
		
		int i = 2;
		
		while (i * i <= n) { //This condition is equalt to a * a <= n
			                 //root(n)
		
		while (n%i == 0) { // log(n)
			System.out.println(i);
			n = n/i;
		}
		i++;
		
		}
		
		if (n > 1) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		primeFactors(n);
		
	}

}
