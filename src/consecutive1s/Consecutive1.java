package consecutive1s;

import java.util.Scanner;


 

public class Consecutive1 {
	
	static void countConsecutive1(int n) {
		
		/**
		 *  1 1 0 0 1 0 1 --> n = 101. Given value
		 *  
		 *  1 0 0 1 0 1 0 --> n << 1
		 *  
		 *  1 0 0 0 0 0 0 --> n & (n<<1). 
		 *  				  If there are consecutive 1 the value will be non zero
		 *   				  Repeat this steps till value becomes zero.
		 *   				  The count is consecutive 1 count
		 *   
		 *   
		 *   TC = O(log n) . Because converting n into binary, so it is log n
		 *   
		 *   Iterating bits of a number the worst case TC is O(log n)
		 */
		
		System.out.println("Time complexity O(log n) "+(Math.log(n) / Math.log(2)));
		int count = 0;
		
			while ((n > 0)) {
				n = n & (n << 1);
				count++;
			}
		
	System.out.println(count);	
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(DecimalToBinary.d2b(n));
		countConsecutive1(n);
	}

}
