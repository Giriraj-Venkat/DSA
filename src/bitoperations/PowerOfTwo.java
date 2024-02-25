package bitoperations;

import java.util.Scanner;

public class PowerOfTwo {
	
	static void isPowerOfTwo(int n) {
		
		int count = 0;
		while ((n > 0) && (count <= 1)) {
			
			n = n & (n-1);
			count++;
		}
		
		if (count == 1) {
			System.out.println("Power Of two ==> Yes");
		} else {
			System.out.println("Power Of two ==> No");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		isPowerOfTwo(n);
	}

}
