//This program is a practice program for linked lists

public class LinkedListDemo<T> {
	public Node<T> head;
	int size = 0;
	
	// Delete List
	public void deleteList(){
		head = null;
	}

	// Add node at the end of the list
	public void addNode(T data) {
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

	// Add node at a specific position
	public void addNode(T data, int pos) {
		if (pos > -1 && pos < size) {
			Node<T> n = new Node<T>(data);
			Node<T> position = null;
			if (pos == 0) {
				n.next = head;
				head = n;
			} else {
				int count = 0;
				position = head;
				while (count < pos) {
					position = position.next;
					count++;
				}
				n.next = position.next;
				position.next = n;
			}
			size++;
		}
	}

	// Remove node from the list according to position
	public void removeNode(int pos) {
		if (pos > -2 && pos < size) {
			if (pos == -1) { // remove last node from the list
				Node<T> n = head;
				int count = 0;
				while (count < size - 1) {
					n = n.next;
					count++;
				}
				n.next = null;

			} else if (pos == 0) { // remove first element
				head = head.next;

			} else { // remove element from position in the list
				Node<T> n = head;
				int count = 0;
				while (count < pos) {
					n = n.next;
					count++;
				}
				n.next = n.next.next;
			}
			size--;
		}
	}

	// Find and remove the node with specified data
	public void findRemoveNode(T data) {
		Node<T> n = new Node<T>(data);
		Node<T> position = null;
		if(head.getData() == n.getData()) {
			head = head.next;
			size--;
		}else if(head.next != null){
			position = head;
			while(position.next != null){
				if(position.next.getData() == n.getData()){
					position.next = position.next.next;
					size--;
					break;
				} 
				position = position.next;
			}
		} 
		
		
	}

	// Return the length of the LinkedList
	public int getListLength() {
		return size;
	}
}

class Node<T> {
	private T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
		this.next = null;
	}

	public T getData() {
		return data;
	}
}
