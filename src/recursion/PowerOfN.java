package recursion;

public class PowerOfN {
	
	public static long pow(int n, int p) {
		
		if (p == 0) {
			return 1;
		}
		
		return pow(n, p -1) * n;
	}
	
	public static void main(String[] args) {
		
		System.out.println(pow(5, 3));
		
	}

}
