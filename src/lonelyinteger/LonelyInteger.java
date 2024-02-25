package lonelyinteger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class LonelyInteger {
	
	static int findLonelyInt(int arr[]) {
		
		/*Arrays.sort(arr); //O(n log n)
		
		for (int i = 0; i < arr.length - 2; i = i + 2) { //O(n)
			
			if(arr[i] != arr[i+1]) {
				return arr[i];
			}
			
		}
		return arr[arr.length-1];*/
		
		//TC = O(n) + O(n log n) = O(n log n)
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		
		for (int element : arr) {
			
			if(set.contains(element)) {
				set.remove(element);
			} else {
				set.add(element);
			}				
		}
		
		int unique = 0;
		for (int ele : set) {
			unique = ele;
		}
		
		return unique;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,1,4,2};
		
		System.out.println(findLonelyInt(arr));
		
		
	}

}
