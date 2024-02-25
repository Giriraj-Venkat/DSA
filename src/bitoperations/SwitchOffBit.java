package bitoperations;

public class SwitchOffBit {
	
	public static void main(String[] args) {
		
		//Switch Off i th bit
		//Create an int value 1
		//Create offMask
		    //a. Left shift i times b. Negate the value
		//Perform AND operation between n and offMask
		
		int n = 45;
		System.out.println("Before Switch Off "+DecimalToBinary.d2b(n));
		
		int i = 3;
		int offMask = ~(i << i);
		
		n = n & offMask;
		
		System.out.println("Before Switch Off "+DecimalToBinary.d2b(n));
	}

}
