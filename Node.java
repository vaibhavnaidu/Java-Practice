//This program is a practice program for Node creation
//Used by LinkedListDemo.java, QueueDemo.java

public class Node<T> {
	private T data;
	Node<T> next;
	
	Node(T data) {
		this.data = data;
		this.next = null;
	}
	
	public T getData(){
		return this.data;
	}
}