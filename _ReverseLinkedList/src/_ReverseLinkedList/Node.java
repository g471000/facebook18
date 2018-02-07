package _ReverseLinkedList;

public class Node {
	int val;
	Node next;

	public Node(int val) {
		this.val = val;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node curr = this;
		sb.append("[");
		while(curr != null) {
			sb.append(curr.val);
			curr = curr.next;
			if(curr != null) {
				sb.append(" -> ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
