package _15Palandrome1;

public class Solution {
	public static void main(String[] args) {
		System.out.println("" + ": " + isPalindrome(""));
		System.out.println("a." + ": " + isPalindrome(""));
		System.out.println("aA" + ": " + isPalindrome(""));
		System.out.println("A man, a plan, a canal: Panama" + ": " + isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println("A man, a pdlan, a canal: Panama" + ": " + isPalindrome("A man, a pdlan, a canal: Panama"));
	}
	
    public static boolean isPalindrome(String s) {
        if(s == null){
            return false;
        }
        
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int p1 = 0, p2 = s.length() - 1;
        while(p1 < p2){
            if(s.charAt(p1) != s.charAt(p2)){
                return false;
            }
            p1++;
            p2--;
        }
        return true;
    }
}
