package recursion;

import java.util.Arrays;

public class RopeCutting {
	
	static int maxPieces(int n, int a, int b, int c) {
		
		if (n == 0) {
			return 0;
		}
		
		if(n < 0) {
			return -1;
		}
		
		int temp1 = maxPieces(n-a, a, b, c);
		int temp2 = maxPieces(n-b, a, b, c);
		int temp3 = maxPieces(n-c, a, b, c);
		
		int maxPiece =  Math.max(Math.max(temp1, temp2), temp3);
		
		if (maxPiece == -1) {
			System.out.println("Inside");
			return -1;
		}
		
		return maxPiece + 1;
	}

       public static void main(String[] args) {
        int ropeLength = 15;
        int[] cuts = { 5, 7, 8 }; // Given lengths at which rope can be cut

        int maxPieces = maxPieces(ropeLength, cuts[0], cuts[1], cuts[2]);

        System.out.println("Maximum pieces obtainable: " + maxPieces);
    }
}

