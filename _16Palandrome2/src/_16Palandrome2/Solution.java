package _16Palandrome2;

public class Solution {
	public static void main(String[] args) {
		System.out.println(validPalindrome("ebcbbececabbacecbbcbe"));
	}

	public static boolean validPalindrome(String s) {
		int p1 = 0, p2 = s.length() - 1;
		boolean deleted = false;
		while (p1 < p2) {
			if (s.charAt(p1) == s.charAt(p2)) {
				p1++;
				p2--;
			} else {
				if (!deleted) {
					return validPalindromHelp(s.substring(p1, p2)) || validPalindromHelp(s.substring(p1 + 1, p2 + 1));
				} else {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean validPalindromHelp(String s) {
		int p1 = 0, p2 = s.length() - 1;
		while (p1 < p2) {
			if (s.charAt(p1) == s.charAt(p2)) {
				p1++;
				p2--;
			} else {
				return false;
			}
		}
		return true;
	}
}
