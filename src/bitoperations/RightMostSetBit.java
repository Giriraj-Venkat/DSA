package bitoperations;

public class RightMostSetBit {
	
	static int findRMSB_BF(int n) {
		
	
		
		/**
		 *  1 0 1 1 0 0  --> Given value
		 *  
		 *  0 0 0 0 0 1  --> mask. Multiply with n and check if result is non zero. Then we found RMSB
		 *  
		 *  0 0 0 0 1 0  --> mask, left shift by 1. Multipl with n and check result is non zero. Then we found RMSB
		 *  
		 *  The time complexity will O(n)
		 */
		
		int mask = 1;
		int position = 1;
		
		if (n == 0) {
			return -1;
		}
		
		
		
		while ((n & mask) == 0) {
			mask = mask << 1;
			position++;
		}
		return position;
			
	}
	
	static int findRMSB(int n) {
		
		//Efficient approach
		//Observation
		/**
		 *    N     Exponent_form     Binary_Form     No_of_iterations
		 *    
		 *    1		 2 to pow 0       00000001               0
		 *    
		 *    2		 2 to pow 1       00000010               1
		 *    
		 *    4		 2 to pow 2       00000100               2
		 *    
		 *    8		 2 to pow 3       00001000               3
		 *    
		 *    16	 2 to pow 4       00010000               4
		 *    
		 *    32	 2 to pow 5       00100000               5
		 *    
		 *    64	 2 to pow 6       01000000               6
		 *    
		 *    128	 2 to pow 7       10000000               7
		 */
		//Time complexity analysis
		/**
		 *   0 0 1 0 1 0 0 0   --> Given n value. n = 40
		 *   
		 *   To find mask
		 *   0 0 1 0 0 1 1 1   --> n-1. 
		 *                     --> All bits left to set bit are as it is
		 *                     --> All bits right to set bit become 1
		 *                     
		 *   0 0 1 0 0 0 0 0   --> Mask. n & n-1.
		 *                     --> All bits left to set bit are as it is
		 *                     --> All bits right to set bit become 0
		 *                     
		 *   0 0 0 0 1 0 0 0   --> Final value. n XOR mask
		 *                     --> same bits will be 0. Diff bits will be 1
		 *                     
		 *   The above value is 8
		 *   It can be represented as 2 to power 3
		 *   The result is "power value" + 1 = 4
		 *   
		 *   The power value 3 can be found using "Log to the base 2"
		 *   In Java no log to the base 2. Only log to the base 10 is available
		 *   
		 *   Formula --> LOGa b = LOG10 b / LOG10 a
		 *   
		 *   We need LOG2 N = LOG10 N / LOG10 2
		 */
		
		int mask = n & (n-1);
		int finalValue = n ^ mask;
		int position = (int) (Math.log(finalValue) / Math.log(2)); // LOG2 N = LOG10 N / LOG10 2
		
		return position + 1;
		
	}
	
	public static void main(String[] args) {
		
		
		
		int n = 40;
		
		System.out.println(DecimalToBinary.d2b(n));
		
		//Brute force approach
		/*
		 * String b = DecimalToBinary.d2b(n);
		 * 
		 * for (int i = b.length()-1; i >= 0; i--) { //System.out.println(b.charAt(i));
		 * if (b.charAt(i) == '1') { System.out.println(b.length()-i); break; } }
		 */
		
		System.out.println(findRMSB_BF(n));
		
		System.out.println(findRMSB(n));
		
	}

}
