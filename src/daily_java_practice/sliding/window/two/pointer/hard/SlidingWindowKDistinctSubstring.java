package daily_java_practice.sliding.window.two.pointer.hard;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindowKDistinctSubstring {
	public static int lengthOfLongestSubstringKDistinct(String s, int k) {

        if (k == 0 || s.length() == 0) return 0;

        Map<Character, Integer> freq = new HashMap<>();

        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);
            freq.put(current, freq.getOrDefault(current, 0) + 1);

            while (freq.size() > k) {
                char leftChar = s.charAt(left);

                freq.put(leftChar, freq.get(leftChar) - 1);

                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }

                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        String s = "eceba";
        int k = 2;

        int result = lengthOfLongestSubstringKDistinct(s, k);
        System.out.println(result);
    }
}
