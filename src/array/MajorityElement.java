package array;

public class MajorityElement {

	//Time Complexity : O(n*n)
	//Auxiliary Space : O(1)
	static int getMajority(int[] ar) {
			
		int count = 1;
		
		for (int i = 0; i < ar.length; i++) {
			
			count = 1;
			
			for(int j = i+1; j < ar.length; j++) {
				
				if(ar[i] == ar[j]) {
					count++;
				}
			}
			
			if (count > ar.length/2) {
				return ar[i];
			}
		}
		
		return -1;
	}
	
	//Time Complexity : O(n)
	//Auxiliary Space : O(1)
	static int getMajorityEle(int[] ar) {
		
		int maj = ar[0], count = 1;
		
		for (int i = 0; i < ar.length; i++) {
			
			if(maj == ar[i]) {
				count++;
			} else {
				count--;
			}
			
			if(count == 0) {
				maj = ar[i];
				count = 1;
			}
		}
	
		return maj;
	}
	
	public static void main(String[] args) {
		
		int[] ar = {5, 9, 9, 9, 5, 5, 9, 9};
		
		System.out.println(getMajority(ar));
		System.out.println(getMajorityEle(ar));
		
	}

}
