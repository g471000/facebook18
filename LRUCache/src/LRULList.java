
public class LRULList {
	Node head;
	Node tail;
	public LRULList() {
		head = new Node(-1);
		tail = new Node(-1);
		head.next = tail;
		tail.prev = head;
	}
	
	public boolean isEmpty() {
		return head.next == tail && tail.prev == head;
	}
	
	public void insertEnd(int val) {
		Node newNode = new Node(val);
		newNode.prev = tail.prev;
		newNode.prev.next = newNode;
		newNode.next = tail;
		tail.prev = newNode;
	}
	
	public void remove(int val) {
		Node curr = head.next;
		while(curr.val != val) {
			curr = curr.next;
		}
		curr.prev.next = curr.next;
		curr.next.prev = curr.prev;
	}
	
	public int removeFront() {
		if(isEmpty()) {
			return -1;
		}
		Node node = head.next;
		head.next = head.next.next;
		head.next.prev = head;
		return node.val;
	}
}
