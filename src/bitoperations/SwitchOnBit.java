package bitoperations;

public class SwitchOnBit {
	
	public static void main(String[] args) {
		
		//Switch ON i-th bit
		//Create an int value of 1
		//Create onMask by Left shift it by i positions
		//Perform OR operation with given value and onMask
		//Observation : In OR operation 0 do not have an impact
		
		int n = 45;
		System.out.println(" Before Switch ON "+DecimalToBinary.d2b(n));
		
		int i = 4;
		int onMask = 1 << i;
		
		n = n | onMask;
		
		System.out.println(" After Switch ON "+DecimalToBinary.d2b(n));				
		
	}

}
