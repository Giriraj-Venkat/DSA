package divisors;

import java.util.Scanner;

public class Test {
	
	static void printPrimeFactors(int n) {
		

		int i =2;
		while(i < Math.sqrt(n)) {			
			while(n%i == 0) {
				System.out.println(i);
				n=n/i;
			}
			i++;
		}
		
		if(n>1) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		printPrimeFactors(n);
		scan.close();
	}

}
