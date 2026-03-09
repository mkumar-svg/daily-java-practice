package daily_java_practice.sliding.window.two.pointer.hard;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinctBruteForce {
	public static int lengthOfLongestSubstringKDistinct(String s, int k) {

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {

            Map<Character, Integer> freq = new HashMap<>();

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);

                if (freq.size() > k) {
                    break;
                }

                maxLength = Math.max(maxLength, j - i + 1);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {

        String s = "eceba";
        int k = 2;

        int result = lengthOfLongestSubstringKDistinct(s, k);

        System.out.println("Longest substring length: " + result);
    }
}
