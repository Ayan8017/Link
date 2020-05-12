import java.util.Scanner;

public class p1 {
	
	void input()
	{
		int n=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("a=ADD at end"
				+ "b=ADD at start"
				+ "c=InsertAt index,data"
				+ "d=Delete at index"
				+ "e=show list"
				+ "f=exit");
		SinglyLinked ob = new SinglyLinked();
		while(n==1)
		{
		switch(sc.next().charAt(0))
		{
		case 'a':System.out.println("INPUT:");
				Node node1 = new Node(sc.nextInt());
				ob.appendAtEnd(node1);
				break;
		case 'b'::System.out.println("INPUT:");
		Node node2 = new Node(sc.nextInt());
		ob.appendAtStart(node2);
		break;

		case 'c'::System.out.println("INPUT:");
		int index=sc.nextInt();
		int val=sc.nextInt();
		ob.insertAt(index,val);
		break;
		case 'd'::System.out.println("INPUT:");
		int index=sc.nextInt();
		ob.deleteAt(index);
		break;		
		case 'e':
			ob.printList();
			break;
		case'f': System.exit(0);
		break;
		default:System.out.println("REDO");
		break;
		}
		}
		
	}
	public static void main(String args[]) {

		SinglyLinked ob1 = new SinglyLinked();
		/*
		Node node1 = new Node(2);
		Node node2 = new Node(3);
		Node node3 = new Node(4); 
		ob.appendAtEnd(node1);
		ob.appendAtEnd(node2);
		ob.appendAtStart(4);
		ob.insertAt(2,11);
		ob.printList();
		ob.deleteAt(2);
		System.out.println(" ");
		ob.printList();
		*/
		ob1.input();
	
	}
