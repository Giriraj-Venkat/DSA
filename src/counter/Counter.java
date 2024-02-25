package counter;

import java.util.Scanner;

public class Counter {
	
	// Check if digit exists
	// Remove the last digit
	// Increment counter by 1
	// Repeat step 1 to 3 till digit remains
	static int count(int n) {
		int counter = 0;
		
		while (n > 0) {
			n = n/10;
			counter++;
		}
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(count(n));

	}

}
