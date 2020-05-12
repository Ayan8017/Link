 public class Node {
	int data;
	Node link;
	
	Node(){
		this.data=0;
		this.link=null;
	}
	
	Node(int data) {
		this.data = data;
		this.link = null;
	}
	Node(int n,Node x){
		this.link=x;
		this.data=n;
	}
	
	
}
