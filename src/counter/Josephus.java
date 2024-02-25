package counter;

public class Josephus {
	
	public static int josephus(int n, int k) {
	    int survivor = 0; // Initialize the survivor's position as 0.

	    for (int i = 2; i <= n; i++) {
	        survivor = (survivor + k) % i;
	        System.out.print(i);
	        System.out.print("  "+k);
	        
	        System.out.println("   "+survivor);
	    }

	    // The result is 1-based, so we add 1 to survivor to get the position.
	    return survivor + 1;
	}

	public static void main(String[] args) {
	    int n = 7; // Number of people
	    int k = 3; // Counting interval

	    int position = josephus(n, k);
	    System.out.println("The last person standing is at position: " + position);
	}

}
