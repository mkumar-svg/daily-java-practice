package daily_java_practice.string.medium;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindowKDistinctSubstrings {
	public static int countSubstringsWithExactlyKDistinct(String s, int k) {
		if(s == null || s.isEmpty() || k <= 0) {
			return 0;
		}
		
		return countAtMostKDistinct(s, k) - countAtMostKDistinct(s, k-1);
	}
	
	private static int countAtMostKDistinct(String s, int k) {
		int left = 0;
		int result = 0;
		Map<Character, Integer> freqMap = new HashMap<>();
		
		for(int right = 0; right < s.length(); right++) {
			char rightChar = s.charAt(right);
			freqMap.put(rightChar, freqMap.getOrDefault(rightChar, 0) + 1);
			
			while(freqMap.size() > k) {
				char leftChar = s.charAt(left);
				freqMap.put(leftChar, freqMap.get(leftChar) - 1);
				
				if(freqMap.get(leftChar) == 0) {
					freqMap.remove(leftChar);
				}
				left++;
			}
			
			result += (right - left + 1);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
        String s = "pqpqs";
        int k = 2;

        System.out.println("Count: " + countSubstringsWithExactlyKDistinct(s, k)); 
    }
}
