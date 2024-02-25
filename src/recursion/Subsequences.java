package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Subsequences {
	
	static ArrayList<String> sList = new ArrayList<String>();
	
	static List gssIteration(String s) {
		
		List<String> ssList = new ArrayList<String>();
		Set<String> ssSet = new HashSet<String>();
		
		int sLength = s.length();
	    
		//Time complexity : O( (2^n) * n)
		for (int i = 0; i < (1 << sLength); i++) { //2^n times
			StringBuffer ss = new StringBuffer();
			
			for (int j = 0; j < sLength; j++) { //n times
				
				if((i & (1 << j)) > 0) {
					ss.append(s.charAt(j));
				}
			}
			ssList.add(ss.toString());
		}
		
		return ssList;
	}
    
	
	static void gssRecursion(String s, String ans) {
		
		
		if (s.length() == 0) {			
			sList.add(ans);		
			return;
		}
		gssRecursion(s.substring(1), ans+s.charAt(0));
		gssRecursion(s.substring(1), ans);
		
		
	}
	
	static void gss(String s, String ans) {
		
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		gss(s.substring(1), ans+s.charAt(0));
		gss(s.substring(1), ans);
	}
	
	public static void main(String[] args) {
	
		String s = "aac";
		
		Subsequences sObj = new Subsequences();
		List<String> ssList = gssIteration(s);
		sObj.gssRecursion(s, "");
		
		//gss(s,"");
		//for (String ss : sList) {
			//System.out.println(ss);
		//}
	}
	
    }
