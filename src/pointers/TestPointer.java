package pointers;

import java.util.HashMap;

public class TestPointer {
	
	public static void main(String[] args) {
		
		
		
		new TestPointer().a();
		
		
	}
	
	public void a() {
		
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		
		map1.put("value", 11);
		
		System.out.println(map1);
		b(map1);
		System.out.println(map1);
		
	}

	public static void b(HashMap<String, Integer> map1) {
		
		map1.put("value", 12);
		
	}
}
