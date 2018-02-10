package _011MergeSortedArray;

import java.io.*;
import java.util.*;
import java.math.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

public class Solution {
	public static void main(String[] args) {
		int[] nums1 = new int[] { 5, 6, 9, 11, 12, 13, 14, -1, -1, -1, -1, -1, -1 };
		int[] nums2 = new int[] { 1, 2, 3, 7, 15 };
		System.out.println(printArr(nums1));
		System.out.println(printArr(nums2));
		System.out.println(printArr(merge(nums1, 7, nums2, 5)));

	}

	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		int p1 = m - 1;
		int p2 = n - 1;
		int lastIndex = m + n - 1;
		while (p1 >= 0 && p2 >= 0) {
			if (nums1[p1] > nums2[p2]) {
				nums1[lastIndex--] = nums1[p1--];
			} else {
				nums1[lastIndex--] = nums2[p2--];
			}
		}

		while (p2 >= 0) {
			nums1[lastIndex--] = nums2[p2--];
		}
		return nums1;
	}

	public static String printArr(int[] input) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < input.length; i++) {
			sb.append(input[i]);
			if (i != input.length - 1) {
				sb.append(", ");
			}
		}

		sb.append("]");
		return sb.toString();
	}
}
