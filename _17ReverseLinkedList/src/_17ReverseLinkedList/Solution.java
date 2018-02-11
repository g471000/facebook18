package _17ReverseLinkedList;

public class Solution {
	public static void main(String[] args) {
		Node test1 = Node.creatNode(new int[] {1, 2, 3, 4, 5});
		System.out.println(test1.toString());
		System.out.println(reverse(test1));
		
		Node test2 = null;
		System.out.println(reverse(test2));
		
		Node test3 = Node.creatNode(new int[] {});
		System.out.println(reverse(test3));
	}
	
	
	public static Node reverse(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		Node curr = head;
		Node prev = null;
		Node temp = null;
		while(curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	
	static class Node {
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
}
