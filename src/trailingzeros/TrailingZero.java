package trailingzeros;

import java.util.Scanner;

public class TrailingZero {
	
	static void trailingzeros(int n) {
		
		int mask = n & (n-1);
		int finalValue = n ^ mask;
		
		System.out.println( (int)(Math.log(finalValue)/Math.log(2)));
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n  = scan.nextInt();
		
		System.out.println(DecimalToBinary.d2b(n));
		trailingzeros(n);
	}

}
