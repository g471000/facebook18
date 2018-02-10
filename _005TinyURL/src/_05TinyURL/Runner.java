package _05TinyURL;

public class Runner {
	public static void main(String[] args) {
		TinyURL tiny = new TinyURL();
		String s = tiny.encode("https://leetcode.com/problems/design-tinyurl");
		System.out.println(s);
		System.out.println(tiny.decode(s));
		String s2 = tiny.encode("https://leetcode.com/problems/design-tinyurl");
		System.out.println(s2);
		System.out.println(tiny.decode(s2));
	}
}
