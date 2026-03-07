package daily_java_practice.sliding.window.two.pointer.medium;

import java.util.Arrays;

public class SlidingWindowLongestSubstring {
	public static int longestNonRepeatingSubstring(String s) {
		int n = s.length();
		int[] hash = new int[256];
		
		Arrays.fill(hash, -1);
		int left = 0, maxLen = 0;
		
		for(int right = 0; right < n; right++) {
			if(hash[s.charAt(right)] >= left) {
				left = hash[s.charAt(right)] + 1;
			}
			
			maxLen = Math.max(maxLen, right - left + 1);
			
			hash[s.charAt(right)] = right;
		}
		return maxLen;
	}
	
	public static void main(String[] args) {
        String s = "cadbzabcd";

        int result = longestNonRepeatingSubstring(s);

        System.out.println("The maximum length is:");
        System.out.println(result);
    }
}
