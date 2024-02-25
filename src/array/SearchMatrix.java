package array;

public class SearchMatrix {
	
	static boolean isPresent(int[][] ar, int target) {
		
		int i = ar.length-1, j = 0;
		
		while (i >= 0 && j < ar[0].length) {
			if (target == ar[i][j]) {
				return true;
			} else if(target > ar[i][j]) {
				j++;
			} else if (target < ar[i][j]) {
				i--;
			}
		}
			
		
			return false;
	}
	
	public static void main(String[] args) {
		int[][] ar = {
					{1, 4, 7, 11, 15},
					{2, 5, 8, 12, 19},
					{3, 6, 9, 16, 22},
					{10, 13, 14, 17, 24}
				 };
		
		System.out.println(isPresent(ar, 22));
		}
	}

