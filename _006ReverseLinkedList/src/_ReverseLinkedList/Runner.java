package _ReverseLinkedList;

public class Runner {
	public static void main(String[] args) {
		Node root = new Node(1);
		root.next = new Node(3);
		root.next.next = new Node(5);
		root.next.next.next = new Node(2);
		System.out.println(root);
		System.out.println(reverse(root));
	}

	public static Node reverse(Node root) {
		Node prev = null;
		Node temp = null;
		Node curr = root;
		while (curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
}
