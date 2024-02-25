package recursion;

import java.util.ArrayList;

public class Josephus {
	
	static int jos(int n, int k) {
		
		if (n == 1) {
			return 0;
		}
		
		return (jos(n-1, k) + k) % n;
	}
	
	

	static int jos(ArrayList al, int index, int k) {
		
		if(al.size() == 1) {
			return (int)al.get(0);
		}
		
		index = (index + (k-1)) % al.size();
		
		//System.out.println(al);
		//System.out.println(index);
		
		
		al.remove(index);
		//System.out.println(al);
		return jos(al,index,k);
	}

	static int josIterative(int n, int k) {
		
		int sum = 0;
		
		for (int i = 2; i <= n; i++) {
			sum = (sum + k) % i;
			System.out.print("i = "+i);
			System.out.println("  sum = "+sum);
		}
		
		return sum + 1;
		//return ((n-1)*k) % n;
		
	}
	
	static int josItr(int n, int k) {
		
		int pos = 1;
		
		for(int i = 2; i <= n; i++) {
			pos = (pos + k - 1) % i + 1;
		}
		
		return pos;
	}
	public static void main(String[] args) {
		
		/**
		 * N = Total persons
		 * K = Person to be killed
		 */
		
		System.out.println(jos(1,3));
		System.out.println(josItr(1,3));
		//System.out.println(josIterative(7,2));
		
		/*int n = 77;
		int k = 2;
		ArrayList list = new ArrayList();
		
		for (int i = 0; i < n; i++) {
			list.add(i);
		}		
		System.out.println(jos(list,0,k));*/
		//System.out.println(josG(7,3));
	}

}
