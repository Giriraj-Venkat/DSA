package array;

public class MininumConsecutiveFlips {
	
	
	//Time Complexity : O(n)
	//Auxiliary Space : O(1)
	static void printMinFlipRange(int[] ar) {
		
		for (int i = 1; i < ar.length; i++) {
			
			if (ar[i] != ar[i-1]) {
				
				if (ar[i] != ar[0]) {
					System.out.print(i+ " - ");
				} else {
					System.out.println(i-1);
				}
			}
		}
		
		//If both bits have same range
		if(ar[0] != ar[ar.length-1]) {
			System.out.println(ar.length-1);
		}
		
	}
	
	public static void main(String[] args) {
		
		int[] ar = {1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0};
		
		printMinFlipRange(ar);
	}

}
