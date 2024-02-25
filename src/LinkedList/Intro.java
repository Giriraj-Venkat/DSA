package LinkedList;

public class Intro {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		int[] ar = {1, 2, 3, 4, 5};
		
		ll.addAll(ar);
		
		ll.printLinkedList();
		
		System.out.println();
		
		ll.removeFirst();
		ll.printLinkedList();
				
	}

}
