package recursion;

import java.io.InputStream;
import java.util.Scanner;

public class Palindrome {
	
	static boolean checkPalindrome(String s, int forwardIndex, int backwardIndex) {
		
		if(s.charAt(forwardIndex) != s.charAt(backwardIndex)) {
			return false;			
		}
		if (backwardIndex <= forwardIndex) {
			return true;
		}
		return checkPalindrome(s, forwardIndex+1, backwardIndex-1);
							
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		System.out.println(checkPalindrome(s, 0, s.length()-1));
		
	}

}
