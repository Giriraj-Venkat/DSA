package array;

public class TrappingRainWater {
	
	//Time Complexity : O(n*n)
	//Auxiliary Space : O(1)
	static int trapNaive(int[] bars) {
		
		int totalWater = 0;
		
		if (bars.length <= 2) {
			return totalWater;
		}
		System.out.println("Yet to be calculated");
		
		int lhb = 0, rhb = 0;
		
		for (int i = 1; i < bars.length-1; i++) {
			
			lhb = bars[i];
			
			for(int j = 0; j < i; j++) {
				
				if(bars[j] > lhb) {
					lhb = bars[j];
				}
			}
			
			rhb = bars[i];
			
			for (int k = i + 1; k < bars.length; k++) {
				
				if(bars[k] > rhb) {
					rhb = bars[k];
				}
			}
			
			totalWater = totalWater + Math.min(lhb, rhb) - bars[i];
		}
		
		return totalWater;
		
	}
	
	//Time Complexity : O(n)
	//Auxiliary Space : O(n)
	static int trap(int[] bars) {
		
		int totalWater = 0;
		
		int[] lhb = new int[bars.length];
		int[] rhb = new int[bars.length];
		
		lhb[0] = bars[0]; //Left hightest bar for first bar is itself
		rhb[bars.length-1] = bars[bars.length-1]; //Right hightest bar for last bar is itself
		
		//Precalculate the left highest bar for each bars
		for (int i = 1; i < bars.length; i++) {						
			lhb[i] = lhb[i-1] > bars[i] ? lhb[i-1] : bars[i];  							
		}
		
		//Precalculate the right highest bar for each bars
		for (int j = bars.length-2; j >= 0; j--) {
			rhb[j] = rhb[j+1] > bars[j] ? rhb[j+1] : bars[j]; 
		}
		
		//Calculate Total water
		for (int k = 1; k < bars.length-1; k++) {
			totalWater = totalWater + Math.min(lhb[k], rhb[k]) - bars[k]; 
		}
		
		return totalWater;
		
	}
	
	public static void main(String[] args) {
		//int[] bars = {4, 2, 0, 3, 2, 5};
		int[] bars = {3, 2, 3};
		
		System.out.println(trapNaive(bars));
		System.out.println(trap(bars));
	}

}

