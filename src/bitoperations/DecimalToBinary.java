package bitoperations;

import java.util.Scanner;

public class DecimalToBinary {
	
	static String d2b(int n) {
		
		String b = "";
		while (n >= 1) {
			b = n%2 + b;
			n=n/2;
		}
		
		//System.out.println(b);
		//b2d(b);
		
		return b;
	}
	
	static int b2d(String b) {
		
		int result = 0;
		int powof2 = 1;
		
		for (int i = b.length() -1; i >= 0; i--) {
			
			if(b.charAt(i) == '1') {
				
				result = result + powof2;
				
			}
			powof2 = powof2 * 2;
		}
		System.out.println("Result is "+result);
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		d2b(n);
	}

}
