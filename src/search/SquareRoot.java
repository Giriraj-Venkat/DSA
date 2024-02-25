package search;

public class SquareRoot {
	
	static int sqrtNaive(int n) {
		
		if (n == 1 || n == 0) {
			return n;
		}
		
		int res = 0;
		for (int i = 1; i < n/2; i++) {
			
			if((i * i) == n) {
				return i;
			} else if ((i * i) < n) {
				res = i;
			} else {
				return res;
			}
		}
		
		return res;
	}
	
	
	static int sqrt(int n) {
		
		if (n == 1 || n == 0) {
			return n;
		}
		
		int l = 0, m = 0, res = 0, h = n/2;
		
		while (l <= h) {
			
			m = (l + h) / 2;
			
			if ((m * m) == n) {
				return m;
			} else if ((m * m) < n) {
				l = m + 1;
				res = m; //In the last time when the control came 
				         //this block will have floor value
			} else {
				h = m -1;
			}
		}
				
		return res;
	}
	public static void main(String[] args) {
		
		System.out.println(sqrtNaive(24));
		System.out.println(sqrtNaive(24));
	}

}
