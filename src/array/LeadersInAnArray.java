package array;

public class LeadersInAnArray {

	//Time complexity O(n^2)
	static void printLeadersNaive(int[] ar) {
		
		boolean isLeader = true;
		
		for (int i = 0; i < ar.length; i++) {
			isLeader = true;
			
			for(int j = i + 1; j < ar.length; j++) {
				if(ar[j] >= ar[i]) {
					isLeader =  false;
					break;
				}
			}
			
			if(isLeader) {
				System.out.print(ar[i]+ " ");
			}
		}
		
	}
	
	static void printLeaders(int[] ar) {
		int curr_leader = ar[ar.length-1];
		
		System.out.print(curr_leader+ " ");
		for (int i = ar.length-2; i >= 0; i--) {
			
			if (ar[i] > curr_leader) {
				curr_leader = ar[i];
				System.out.print(curr_leader+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		int[] ar = {18, 11, 5, 11, 7, 6, 5};
		//int[] ar = {10, 20, 30};
		//int[] ar = {30, 20, 10};
		
		printLeadersNaive(ar);
	}

}
