package q5;

public class node {
	int data;
	node next = null;
	public  node( int data) {
		this.data = data;
		
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public node getNext() {
		return next;
	}
	public void setNext(node next) {
		this.next = next;
	}

}
