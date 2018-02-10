package _09CountAndSay;

public class Runner {
	public static void main(String[] args) {
		CountAndSay cas = new CountAndSay();
		for(int i = 0; i < 10; i++) {
			System.out.println(cas.countAndSay(i));
		}

	}
}
