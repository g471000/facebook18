package _012RemoveDuplicates;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Solution {
	public static void main(String[] args) {
		int[] test1 = null;
		int[] test2 = new int[] {};
		int[] test3 = new int[] { 1 };
		System.out.println(printArr(removeDup(test1)));
		System.out.println(printArr(removeDup(test2)));
		System.out.println(printArr(removeDup(test3)));

		int[] test4 = new int[] { 1, 2, 2, 2, 3, 3, 4 };
		int[] test5 = new int[] { 1, 1, 2, 2, 3, 3, 3, 3 };
		int[] test6 = new int[] { 1, 2, 3, 4 };

		System.out.println(printArr(removeDup(test4)));
		System.out.println(printArr(removeDup(test5)));
		System.out.println(printArr(removeDup(test6)));

	}

	public static int[] removeDup(int[] input) {
		if (input == null || input.length < 2) {
			return input;
		}
		int curr = input[0];
		int lastIndex = 0;
		for (int i = 1; i < input.length; i++) {
			if (curr != input[i]) {
				input[lastIndex++] = curr;
				curr = input[i];
			}
		}

		input[lastIndex] = curr;
		return input;
	}

	public static String printArr(int[] input) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		if (input != null) {
			for (int i = 0; i < input.length; i++) {
				sb.append(input[i]);
				if (i != input.length - 1) {
					sb.append(", ");
				}
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
