package factorial;

import java.util.Scanner;

public class Factorial {
	
	//brute force approach
	static int bfFact(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * i; //res *= i;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner l_scanner = new Scanner(System.in);
		int n = l_scanner.nextInt();
		System.out.println(bfFact(n));

	}

}
