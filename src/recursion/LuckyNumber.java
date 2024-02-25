package recursion;

public class LuckyNumber {
	
	
	static boolean isLuckyNumberIter(int n, int counter) {
		
		
		while (n > counter) {
			
			if (n%counter == 0) {
				return false;
			}
			n = n-(n/counter);
			counter++;
			
		}
		
		if(n%counter != 0) {
			return true;
		}
		
		return false;
	}
	
	static boolean isLuckyNumber(int n, int counter) {
		
		
		if (n < counter) {
			return true;
		}
		if (n%counter == 0) {
			return false;			
		}
		
		return isLuckyNumber(n-(n/counter), counter+1);
	}
	
	public static void main(String[] args) {
		
		int n = 13;
		int counter = 2;
		System.out.println(isLuckyNumberIter(n, counter));
		System.out.println(isLuckyNumberIter(n, counter));
		
	}

}
