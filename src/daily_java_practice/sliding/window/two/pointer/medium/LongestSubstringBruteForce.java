package daily_java_practice.sliding.window.two.pointer.medium;

import java.util.Arrays;

public class LongestSubstringBruteForce {
	public static int longestNonRepeatingSubstring(String s) {
		int n = s.length();
		int maxLen = 0;
		
		for(int i = 0; i < n; i++) {
			int[] hash = new int[256];
			Arrays.fill(hash, 0);
			
			for(int j = i; j < n; j++) {
				if(hash[s.charAt(j)] == 1) {
					break;
				}
				
				hash[s.charAt(j)] = 1;
                int len = j - i + 1;
                maxLen = Math.max(maxLen, len);
			}
		}
		return maxLen;
	}
	
	public static void main(String[] args) {
        String input = "cadbzabcd";

        int length = longestNonRepeatingSubstring(input);

        System.out.println("Length of longest substring without repeating characters: " + length);
    }
}
