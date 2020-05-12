import java.util.*;
public class pp1{
	
	public static void main(String[] args)
	{
		int n=1,index=0,val=0;
		Scanner sc=new Scanner(System.in);
			SinglyLinked ob = new SinglyLinked();
		while(n==1)
		{
			System.out.println("a=ADD at end"
					+ " b=ADD at start"
					+ " c=InsertAt index,data"
					+ " d=Delete at index"
					+ " e=show list"
					+ " f=exit");
			System.out.println("  ENTER:  ");
		
		switch(sc.next().charAt(0))
		{
		case 'a':System.out.println("INPUT:");
				Node node1 = new Node(sc.nextInt());
				ob.appendAtEnd(node1);
				break;
		case 'b':System.out.println("INPUT:");
		//Node node2 = new Node(sc.nextInt());
		ob.appendAtStart(sc.nextInt());
		break;

		case 'c':System.out.println("INPUT:");
		 index=sc.nextInt();
		 val=sc.nextInt();
		ob.insertAt(index,val);
		break;
		case 'd' :System.out.println("INPUT:");
		index=sc.nextInt();
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
		
			
}




















