package _013AddBinary;

public class Solution {
	public static void main(String[] args) {
		String a = "1010111";
		String b = "111111";
		System.out.println(addBinary(a, b));

		a = "";
		b = "111111";
		System.out.println(addBinary(a, b));

		a = "1111111";
		b = "1111111";
		System.out.println(addBinary(a, b));
	}

	public static String addBinary(String a, String b) {
		int p1 = a.length() - 1;
		int p2 = b.length() - 1;
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		while (p1 >= 0 || p2 >= 0) {
			int val1 = p1 >= 0 ? (a.charAt(p1--) - '0') : 0;
			int val2 = p2 >= 0 ? (b.charAt(p2--) - '0') : 0;
			int sum = val1 + val2 + carry;
			carry = sum / 2;
			sb.insert(0, (sum % 2));
		}

		if (carry == 1) {
			sb.insert(0, "1");
		}
		return sb.toString();
	}
}
