package _18AddTwoNumbers;

public class Node {
	int val;
	Node next;
	public Node(int val) {
		this.val = val;
	}
	
	public static Node creatNode(int[] array) {
		Node dummy = new Node(-1);
		Node curr = dummy;
		for(int i : array) {
			Node newNode = new Node(i);
			curr.next = newNode;
			curr = curr.next;
		}
		return dummy.next;
	}
	
	public String toString() {
		Node curr = this;
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while(curr != null) {
			sb.append(curr.val + "");
			if(curr.next != null) {
				sb.append(" -> ");
			}
			curr = curr.next;
		}
		sb.append("]");
		return sb.toString();
	}
	
}
