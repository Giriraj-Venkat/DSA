package search;

public class WoodCutting {
	
	static int findWoodCount(int[] ht, int m) {
		
		int wc = 0;
		
		for (int i = 0; i < ht.length; i++) {
			if(ht[i] > m) {
				wc = wc + (ht[i] - m);
			}
		}
		
		return wc;
	}
	
	static int matchingHeight(int[] ht, int b) {
		
		int max = 0;
		
		for (int i = 0; i < ht.length; i++) {
			if(ht[i] > max) {
				max = ht[i];
			}
		}
		
		//System.out.println(max);
		
		int l = 0, m = 0, h = max;
		
		while (l <= h) {
			
			m = (l + h) / 2;
			
			int wc = findWoodCount(ht, m);
			
			if (wc == b || l == m) {
				return m;
			} else if (wc > b) {
				l = m;
			} else {
				h = m;
			}
			
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		int[] ht = {20, 15, 10, 17};
		
		System.out.println(matchingHeight(ht, 7));
		
	}

}
