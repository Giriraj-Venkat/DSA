package doublylinkedlist;



class Node {
	
	int data;
	Node prev;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}

}

class DoublyLinkedList {
	
	Node head;
	Node tail;
	
	void add(int element) {
		
		Node temp = new Node(element);
		if (head == null) {
			head = temp;
			tail = temp;
		} else {
			tail.next = temp;
			temp.prev = tail;
			tail = temp;
		}
	}
	
	void print() {
		Node curr = this.head;
		
		while(curr != null) {
			System.out.print(curr.data+ " ");
			curr = curr.next;
		}
	}
}
