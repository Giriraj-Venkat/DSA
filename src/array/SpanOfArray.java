package array;

public class SpanOfArray {
	
	static int spanOfArray(int[] a) {
		
		int min = a[0], max = a[0];
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
		}			
		
		return max - min;
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {6, 99, 10, 25, 18};
		
		System.out.println(spanOfArray(a));
		
	}

}
