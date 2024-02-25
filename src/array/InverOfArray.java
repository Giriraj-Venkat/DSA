package array;

public class InverOfArray {
	
	static int[] inverse(int[] a) {
		
		int[] b = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			int v = a[i];
			b[v] = i;
		}
		
		return b;
	}
	
	public static void main(String[] args) {
		
		int[] a = {2, 3, 1, 0, 4};
		
		int[] b = inverse(a);
		
		for (int i : b) {
			System.out.print(i+ " ");
		}
		
	}

}
