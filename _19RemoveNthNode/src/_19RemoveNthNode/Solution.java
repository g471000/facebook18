package _19RemoveNthNode;

class Solution {
	public static void main(String[] args) {
		System.out.println(removeNthFromEnd(null, 3));
		System.out.println(removeNthFromEnd(new Node(1), 1));
		System.out.println(removeNthFromEnd(Node.creatNode(new int[] { 1, 2, 3 }), 0));
		System.out.println(removeNthFromEnd(Node.creatNode(new int[] { 1, 2, 3 }), 1));
		System.out.println(removeNthFromEnd(Node.creatNode(new int[] { 1, 2, 3 }), 2));
		System.out.println(removeNthFromEnd(Node.creatNode(new int[] { 1, 2, 3 }), 3));
		System.out.println(removeNthFromEnd(Node.creatNode(new int[] { 1, 2, 3 }), 4));
	}

	public static Node removeNthFromEnd(Node head, int n) {
		if (head == null || n < 1) {
			return head;
		}

		Node dummy = new Node(-1);
		dummy.next = head;

		Node slow = dummy;
		Node fast = dummy;
		for (int i = 0; i < n; i++) {
			fast = fast.next;
			if (fast == null) {
				return head;
			}
		}

		while (fast.next != null) {
			slow = slow.next;
			fast = fast.next;
		}

		slow.next = slow.next.next;
		return dummy.next;
	}
}
