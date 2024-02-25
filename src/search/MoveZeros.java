package search;

public class MoveZeros {
	
	static void moveZerosRight(int[] ar) {
		
		int z = 0, nz = 0, temp;
		
		while (nz < ar.length) {
			
			if (ar[nz] != 0) {
				temp = ar[nz];
				ar[nz] = ar[z];
				ar[z] = temp;
				nz++;
				z++;
			} else {
				nz++;
			}
		}
		
		for (int i : ar) {
			System.out.print(i+ " ");
		}
		
		
	}
	
	static void moveZerosLeft(int[] ar) {
		
		int z = 0, nz = 0, temp;
				
		while (nz < ar.length) {
			
			if (ar[nz] == 0) {
				temp = ar[nz];
				ar[nz] = ar[z];
				ar[z] = temp;
				nz++;
				z++;
			} else {
				nz++;
			}
		}
		
		for (int i : ar) {
			System.out.print(i+ " ");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int[] ar = {0, 10, 22, 8, 0, 5, 0};
		
		moveZerosLeft(ar);
		
	}

}
