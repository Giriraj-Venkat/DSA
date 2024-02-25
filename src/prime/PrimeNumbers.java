package prime;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeNumbers {
	
	// Divisible by 1 and number itself
	// 1 is not prime number
	// 
	
	static boolean isPrime(int n) {
		
		//This is linear complexity O(n)
		/*for (int i = 2; i < n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;*/
		
		//This is linear complexity O(n)
		/*for (int i = 2; i <= n/2; i++) {			
			if(n%i == 0) {
				return false;
			}
		}
		return true;*/
		
		
		//This is O(root(n))
		//for (int i = 2; i*i <= n; i++) {	//Equalant of below line (i*i <=n) => (i < root(n))
		for (int i = 2; i <= Math.sqrt(n); i++) {			
			if(n%i == 0) {
				return false;
			}
		}
		return true;
		
		//Number divisible by 2 is not prime
		//Number divisible by 3 is not prime
		
	}

	static void printPrime(int n) {
		
		for (int i = 2; i <= n; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	//sieve of eratosthenes approach
	static void sievePrintPrime(int n) {
		
		boolean[] prime = new boolean[n+1];
		
		//As per "Leonhard Euler" the below is prime profression
		//n/2 + n/3 + n/5 + n/7  => n(1/2 + 1/3 + 1/5 + 1/7)
		//Time complexity is log(log(n))
		//So time complexity of this program is "O[n log(log(n))]"
		
		//Mark all non prime numbers to TRUE
		//for (int i = 2; i <= n; i++) {
		  for (int i = 2; i <= Math.sqrt(n); i++) {
		
			if (prime[i] == false) {
				//This is mark multiples of i to TRUE
				//for (int j = i*2; j <= n; j= j + i) {
				for (int j = i*i; j <= n; j= j + i) {
					prime[j] = true;
				}
			}
		}
		
		//Print only prime numbers
		for (int i = 2; i <= n; i++) {
			if(prime[i] == false) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
	
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			//printPrime(n);
			//System.out.println(isPrime(n));
			sievePrintPrime(n);
			
	}

}
