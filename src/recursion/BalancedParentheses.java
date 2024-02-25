package recursion;

import java.util.Scanner;

public class BalancedParentheses {
	
	static void balParen(char[] ar, int n, int i, int o, int c) {
		
		if (i == ar.length) {
			System.out.println(ar);
		}
		
		if (o < n) {
			ar[i] = '(';
			balParen(ar, n, i+1, o+1, c);
		}
		if (c < o) {
			ar[i] = ')';
			balParen(ar, n, i+1, o, c+1);
		}
		
	}

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		char[] ar = new char[n*2];
		
		balParen(ar, n, 0, 0, 0);
	}
}
