package _04ValidParentheses;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		String s1 = "{([[[(())]]])}";
		System.out.println(s1 + ": " + isValid(s1));
		String s2 = "{([[)[(())]]])}";
		System.out.println(s2 + ": " + isValid(s2));
		
		System.out.println(s1 + ": " + isValid2(s1));
		System.out.println(s2 + ": " + isValid2(s2));
	}

	public static boolean isValid2(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(!isRightSide(c)) {
				stack.push(c);
			} else {
				if(stack.isEmpty() || !isSet(stack.peek(), c)) {
					return false;
				} else {
					stack.pop();
				}
			}
		}
		return stack.isEmpty();
	}

	public static boolean isRightSide(char c) {
		return c == ']' || c == ')' || c == '}';
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (!stack.isEmpty() && isSet(stack.peek(), s.charAt(i))) {
				stack.pop();
			} else {
				stack.push(s.charAt(i));
			}
		}
		return stack.isEmpty();
	}

	public static boolean isSet(Character c1, Character c2) {
		if (c1 == '[') {
			return c2 == ']';
		} else if (c1 == '(') {
			return c2 == ')';
		} else if (c1 == '{') {
			return c2 == '}';
		}
		return false;
	}
}
