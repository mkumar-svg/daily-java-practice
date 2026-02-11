package daily_java_practice.string.medium;

public class LongestPalindromicSubstring {
	// Expand center → O(n²)
	public static String longestPalindrome(String s) {
		if(s == null || s.length() < 1) {
			return "";
		}
		
		int start = 0, end = 0;
		
		for(int i = 0; i < s.length(); i++) {
			int oddLen = expandFromCenter(s, i, i);
			int evenLen = expandFromCenter(s, i, i+1);
			
			int maxLen = Math.max(oddLen, evenLen);
			
			if(maxLen > end - start) {
				start = i - (maxLen - 1)/2;
				end = i + maxLen/2;
			}
		}
		
		return s.substring(start, end+1);
	}
	
	private static int expandFromCenter(String s, int left, int right) {
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		} 
		
		return right - left - 1;
	}
	
	public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
