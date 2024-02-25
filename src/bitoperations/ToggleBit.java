package bitoperations;

public class ToggleBit {
	
	public static void main(String[] args) {
		
		//XOR Truth Table
		/**
		 *  A  B   Result
		 *  0  0     0
		 *  0  1     1
		 *  1  0     1
		 *  1  1     0
		 */
		//Toggle i th bit
		//Create a value of 1
		//Create toggleMask by Left shifting i times
		//Perform XOR operation between n and toggleMask
		
		/**
		 *     i
		 * 1 0 1 1 0 0  -- given value
		 *     XOR
		 * 0 0 1 0 0 0  -- toggleMask
		 * 1 0 0 1 0 0  -- result    
		 */
		
		int n = 45;
		System.out.println("Before Switch Off "+DecimalToBinary.d2b(n));
		
		int i = 3;
		int toggleMask = 1 << i;
		
		n = n ^ toggleMask;
		System.out.println("Before Switch Off "+DecimalToBinary.d2b(n));
		
		
	}

}
