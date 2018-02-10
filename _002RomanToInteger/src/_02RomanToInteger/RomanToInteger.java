package _02RomanToInteger;

public class RomanToInteger {
	public int romanToInt(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int val = getValue(s.charAt(i));
			if (val != -1) {
				sum += val;
			} else {
				return -1;
			}
		}

		return sum - getSubValue(s);
	}

	private int getSubValue(String s) {
		int subtract = 0;
		if (s.indexOf("IV") != -1) {
			subtract += 2;
		}
		if (s.indexOf("IX") != -1) {
			subtract += 2;
		}
		if (s.indexOf("XL") != -1) {
			subtract += 20;
		}
		if (s.indexOf("XC") != -1) {
			subtract += 20;
		}
		if (s.indexOf("CD") != -1) {
			subtract += 200;
		}
		if (s.indexOf("CM") != -1) {
			subtract += 200;
		}
		return subtract;
	}

	private int getValue(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return -1;
		}
	}
}
