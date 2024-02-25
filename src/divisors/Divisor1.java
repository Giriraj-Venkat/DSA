package divisors;

import java.util.Scanner;

public class Divisor1 {
	
	
	static void printDivisors(int n) {
		
		
		/*
		 * for (int i = 1; i <= n; i++) { if(n%i == 0) { System.out.println(i); } }
		 */
		
		for (int i = 1; i * i <= n; i++) {
			
			if(n%i == 0) {
				System.out.println(i);
				if((n/i) != i) {
					System.out.println(n/i);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printDivisors(n);
		
	}

}
