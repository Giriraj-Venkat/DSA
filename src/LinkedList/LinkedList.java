package LinkedList;


public class LinkedList {

	Node head;
	
	void printLinkedList() {
		Node curr = this.head;
		
		while(curr != null) {
			System.out.print(curr.data+ " ");
			curr = curr.next;
		}
	}
	
	void add(int e) {
		
		Node temp = new Node(e);
		
		if (head == null) {
			head = temp;
		} else {
			
			Node curr = head;
			
			while(curr.next != null) {
				curr = curr.next;
			}
			
			curr.next = temp;
		}
	}
	
	void addFirst(int e) {
		
		Node temp = new Node(e);
		
		if (head == null) {
			head = temp;
		} else {
			
			temp.next = head;
			head = temp;
		}
	}
	
	void removeLast() {
		
		if (head == null) {
			
		} else if(head.next == null) {
			head = null;
		} else if(head.next != null) {
			Node curr = head;
			
			while(curr.next.next != null) {
				curr = curr.next;				
			}
			
			curr.next = null;
		}
		
	}
	
	void addAll(int[] ar) {
		
		for (int ele : ar) {
			add(ele);
		}
	}
	
	void add(int index, int e) throws IndexOutOfBoundsException {
		
		
		try {
			if (index == 0) {
				addFirst(e);
			} else {
				
				Node temp = new Node(e);
				int	count = 0;
				
				Node curr = this.head;
				while (count < index-1) {
					curr = curr.next;
					count++;
				}
				
				temp.next = curr.next;
				curr.next = temp;
			}
		} catch (NullPointerException exception) {
			throw new IndexOutOfBoundsException();
		}
	
	}
	
	int indexOf(int element) {
	
		Node curr = head;
		int count = 0;
		
		while(curr != null) {
			if (curr.data == element) {
				return count;
			}
			curr = curr.next;
			count++;
		}
		return -1;
	}
	
	void removeFirst() {
		
		if (head == null) {
			
		} else if (head.next == null) {
			head = null;
		} else if (head.next != null) {
			Node curr = head;
			head = curr.next;
		}
	}
}

class Node {
	
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
	
}

