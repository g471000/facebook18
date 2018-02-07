package _05TinyURL;

import java.util.*;

public class TinyURL {
	private HashMap<String, String> strToTiny = new HashMap<>();
	private HashMap<String, String> tinyToStr = new HashMap<>();
	private String sample = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	public String encode(String url) {
		String tiny;
		if (strToTiny.containsKey(url)) {
			tiny = strToTiny.get(url);
		} else {
			tiny = genString();
			while(tinyToStr.containsKey(tiny)) {
				tiny = genString();
			}
			strToTiny.put(url, tiny);
			tinyToStr.put(tiny, url);
		}
		return "http://tinyurl.com/" + tiny;
	}

	public String decode(String url) {
		url = url.replace("http://tinyurl.com/", "");
		return tinyToStr.get(url);
	}

	private String genString() {
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++) {
			int index = rand.nextInt(sample.length());
			sb.append(sample.charAt(index));
		}
		return sb.toString();
	}
}
