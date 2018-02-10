public class Node {
	int val;
	Node next;
	Node prev;

	public Node(int val) {
		this.val = val;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node curr = this;
		sb.append("[");
		while (curr != null) {
			if (curr.val != -1) {
				sb.append(curr.val);
				if (curr.next != null && curr.next.val != -1) {
					sb.append(" -> ");
				}
			}
			curr = curr.next;
		}
		sb.append("]");
		return sb.toString();
	}
}
