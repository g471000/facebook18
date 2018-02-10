package _09CountAndSay;

public class CountAndSay {
	public String countAndSay(int n) {
		if (n < 1) {
			return "\"\"";
		}
		return countAndSayHelp("1", n);
	}

	private String countAndSayHelp(String s, int input) {
		if (input <= 1) {
			return "\"" + s + "\"";
		}

		StringBuilder sb = new StringBuilder();
		int count = 1;
		char curr = s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			if (curr == s.charAt(i)) {
				count++;
			} else {
				sb.append(count);
				sb.append(curr);
				curr = s.charAt(i);
				count = 1;
			}
		}
		sb.append(count);
		sb.append(curr);

		return countAndSayHelp(sb.toString(), input - 1);
	}
}
