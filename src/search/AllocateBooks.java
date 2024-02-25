package search;

public class AllocateBooks {
	
	static boolean isPossibleSolution(int[] books, int studentsCount, int m) {
		
		int students = 1;
		int studentPageCount = 0;
		
		for (int i = 0; i < books.length; i++) {
			
			if(books[i] > m) {
				return false;
			}
			
			if ((studentPageCount + books[i]) <= m) {
				studentPageCount = studentPageCount + books[i];
			} else {
				students++;
				if (students > studentsCount) {
					return false;
				}
				studentPageCount = books[i];
			}
		}
		
		return true;
		
	}
	
	static int maxPage(int[] books, int studentsCount) {
		
		if (studentsCount > books.length) {
			return -1;
		}
		
		int l = books[0], h = 0, m = 0;
		
		for (int i = 0; i < books.length; i++) {
			if(books[i] < l) {
				l = books[i];
			}
			
			h = h + books[i];
		}
		
		int res = -1;
		while (l <= h) {
			
			m = (l + h) / 2;
			
			if(isPossibleSolution(books, studentsCount, m) == true) {
				res = m;
				h = m - 1;
			} else {
				l = m + 1;
			}
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		
	}

}
