package array;

public class FrequencyOfElementInSortedArray {
	
	static void frequency(int[] ar) {
		
		int freq = 1, i = 1;
		
		while (i < ar.length) {
			
			while (i < ar.length && (ar[i] == ar[i-1])) {
				freq++;
				i++;
			}
			
			System.out.println(ar[i-1]+" "+freq);
			freq = 1;  //Reset Freq to 1 when ele changes
			i++;
		}
		//If only one ele in array
		//If Last ele occured only once
			i = i == ar.length + 1 ? (i-1) : i;
		  if (ar.length == 1 || (ar[i-1] != ar[i-2])) {
			  System.out.println(ar[i-1]+" "+freq); 
		  }
		 
		
	}
	
	static void freq(int[] ar) {
		
		int freq = 1, i = 0;
		
		while (i < (ar.length - 1)) {
			
			while((i < (ar.length-1)) && (ar[i] == ar[i+1])) {
				freq++;
				i++;
			}
			System.out.println(ar[i] + " "+freq);
			freq = 1;
			i++;
		}
		
		if (ar.length == 1 || (ar[i] != ar[i-1])) {
			System.out.println(ar[i] + " "+freq);
		}
		
	}
	
	public static void main(String[] args) {
		
		//int[] ar = {10, 10, 20, 20, 30, 30, 30, 30, 40};
		int[] ar = {10};
		
		freq(ar);
		
	}

}
