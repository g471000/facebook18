package _18AddTwoNumbers;

public class Solution {
	public static void main(String[] args) {
		Node n1 = null;
		Node n2 = Node.creatNode(new int[] {1, 5, 4});
		Node n3 = Node.creatNode(new int[] {3, 6, 3});
		Node n4 = Node.creatNode(new int[] {3, 5, 9, 9});
		System.out.println(addTwoNumbers(n1, n2));
		System.out.println(addTwoNumbers(n2, n1));
		System.out.println(addTwoNumbers(n2, n3));
		System.out.println(addTwoNumbers(n3, n4));
	}

	public static Node addTwoNumbers(Node l1, Node l2) {
		if(l1 == null) {
			return l2;
		}
		
		if(l2 == null) {
			return l1;
		}
		
		Node dummy = new Node(-1);
		Node curr = dummy;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int val1 = l1 != null ? l1.val : 0;
			int val2 = l2 != null ? l2.val : 0;
			int sum = val1 + val2 + carry;
			carry = sum / 10;
			curr.next = new Node(sum % 10);
			l1 = l1 != null ? l1.next : l1;
			l2 = l2 != null ? l2.next : l2;
			curr = curr.next;
		}

		if (carry != 0) {
			curr.next = new Node(carry);
		}
		return dummy.next;
	}
}
