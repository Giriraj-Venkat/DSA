package bitoperations;

import java.util.Scanner;

public class CountSetBits {
	
	static void countSetBits(int n) {
		
		//Bruteforce approach
		/**
		 * Time complexity = O(log n)
		 * Here we are converting decimal to binary and looping through 
		 */
		/*String b = DecimalToBinary.d2b(n);
		
		System.out.println(b);
		
		int count = 0;
		
		for (int i = b.length()-1; i >= 0; i--) {
			
			if (b.charAt(i) == '1') {
				count++;
			}
		}
		
		System.out.println("Number of set bits "+count);*/
		
		//Efficient approach
		/**
		 *  1 0 1 0 1 0  --> n = 42. Given value
		 *  1 0 1 0 0 1  --> n-1. All bits right to RMSB is 1 and all bits left to RMSB is as it is.
		 *  
		 *  1 0 1 0 0 0  --> n & n-1. In each iteration one set bit become unset
		 *               --> Repeat the same till all set bits become unset
		 *               --> If all becomes unset then
		 *  Time complexity = O(log n)
		 */
		String b = DecimalToBinary.d2b(n);
		System.out.println(b);
		
		int count = 0;
		while (n > 0) {
			n = n & (n-1);
			count++;
		}
		System.out.println("Number of set bits "+count);
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		countSetBits(n);
		
		
		
		
	}

}
