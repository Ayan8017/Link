public class SinglyLinkedList {

	Node head;
	
	void appendAtEnd(Node node) {
		Node ptr = head;
		
		if (head == null) {
			head = node;
			return;
		}
		
		while (ptr.link != null)
			ptr = ptr.link;
		ptr.link = node;
		
	}
	
	void printList() {
		Node ptr = head;
		
		while (ptr != null) {
			System.out.print(ptr.data + " | ");
			ptr = ptr.link;
		}
	}
	
	public static void main(String args[]) {

		SinglyLinkedList ob = new SinglyLinkedList();
		
		Node node1 = new Node(2);
		Node node2 = new Node(3);
		
		ob.appendAtEnd(node1);
		ob.appendAtEnd(node2);
		
		ob.printList();
		
	}
	
}