public class SinglyLinked {

	Node head;
	
	
	
	 void appendAtStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.link = null;
		node.link = head;
		head = node;
	}
	
	void insertAt(int index,int data)
		{
			Node node = new Node();
			node.data = data;
			node.link = null;
			
			if(index==0)
			{
				appendAtStart(data);
			}
			else{
			Node n = head;
			for(int i=0;i<index-1;i++)
			{
				n = n.link;
			}
			node.link = n.link;
			n.link = node;
			}
		}
	
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
	
	 void deleteAt(int index)
	{
		if(index==0)
		{
			head = head.link;
		}
		else
		{
			Node n = head;
			Node n1 = null;
			for(int i=0;i<index-1;i++)
			{
				n = n.link;
			}
			n1 = n.link;
			n.link = n1.link;
			//System.out.println("n1 " + n1.data);
			n1 = null;
		}
	}
	
	
	void printList() {
		Node ptr = head;
		
		while (ptr != null) {
			System.out.print(ptr.data + " | ");
			ptr = ptr.link;
		}
	}
	

}