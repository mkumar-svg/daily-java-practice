package daily_java_practice.string.medium;

import java.util.HashMap;
import java.util.Map;

public class BruteForceBeautySumCalculator {
	public static int calculateBeautySum(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int totalBeauty = 0;

        for (int start = 0; start < n; start++) {

            Map<Character, Integer> frequencyMap = new HashMap<>();

            for (int end = start; end < n; end++) {

                char currentChar = s.charAt(end);
                frequencyMap.put(currentChar,
                        frequencyMap.getOrDefault(currentChar, 0) + 1);

                int maxFreq = Integer.MIN_VALUE;
                int minFreq = Integer.MAX_VALUE;

                for (int freq : frequencyMap.values()) {
                    maxFreq = Math.max(maxFreq, freq);
                    minFreq = Math.min(minFreq, freq);
                }

                totalBeauty += (maxFreq - minFreq);
            }
        }

        return totalBeauty;
    }

    public static void main(String[] args) {
        String s = "xyx";
        System.out.println("Beauty Sum: " + calculateBeautySum(s));
    }
}
