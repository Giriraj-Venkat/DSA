package reversingbits;

import java.io.InputStream;
import java.util.Scanner;

public class ReverseBinary {
	
	static int reverse(int n) {
		
		int f = 31, l = 0;
		int rev = 0;
		
		while (f > l) {
			
			if((n & (1 << f)) != 0) {
				rev = rev | (1 << l);
			}
			if((n & (1 << l)) != 0) {
				rev = rev | (1 << f);
			}
			
			f--;
			l++;
		}
		
		
		return rev;
	}
	
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		int n = scan.nextInt();
		
		System.out.println(DecimalToBinary.d2b(n));
		
		int rev = reverse(n);
		
		System.out.println(rev);
		//How to convert negative decimal to Binary
		System.out.println(DecimalToBinary.d2b(rev));
	}

}
