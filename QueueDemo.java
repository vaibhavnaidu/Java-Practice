// Practice program for Queues

public class QueueDemo<T> {
	int size = 0;
	Node<T> head;
	
	// Delete whole queue
	public void deleteQueue(){
		head = null;
	}
	
	// Enqueue - add element to the end
	public void enqueue(T data){
		Node<T> n = new Node<T>(data);
		Node<T> last = null;
		if (head == null) {
			head = n;
		} else if (head.next == null) {
			head.next = n;
		} else {
			last = head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = n;
		}
		size++;
	}
	
	// Dequeue - remove element from front
	public T dequeue(){
		Node<T> front = head;
		if(head.next != null){
			head = head.next;
		}
		size--;
		return front.getData();
	}
	
	// Peek - get element at the front of the queue without removing it
	public T peek() {
		return head.getData();
	}
	
	// Get length of the Queue
	public int getLength() {
		return size;
	}
	
}
