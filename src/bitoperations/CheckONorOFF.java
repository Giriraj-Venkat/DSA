package bitoperations;

public class CheckONorOFF {
	
	public static void main(String[] args) {
		
		
		/**
		 *      i
		 *  1 0 1 1 0 0 -- given value
		 *     AND
		 *  0 0 1 0 0 0 -- mask
		 *  
		 *  0 0 1 0 0 0 -- Result
		 *  If result decimal equivalent is 0 then the bit was OFF
		 *  If result decimal equivalent is non zero then the bit was ON
		 */
		
		int n = 45;
		
		int i = 3;
		
		int checkMask = 1 << i;
		
		if ((n & checkMask) == 0) {
			System.out.println("OFF");
		} else {
			System.out.println("ON");
		}
	}

}
