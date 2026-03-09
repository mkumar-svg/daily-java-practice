package daily_java_practice.sliding.window.two.pointer.hard;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstringSlidingWindow {
	public static String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = t.length();
        int minLength = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            if (map.containsKey(ch)) {
                if (map.get(ch) > 0) {
                    count--;
                }
                map.put(ch, map.get(ch) - 1);
            }

            while (count == 0) {

                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0) {
                        count++;
                    }
                }

                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC")); 
        System.out.println(minWindow("a", "a")); 
    }
}
