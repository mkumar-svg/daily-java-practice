package daily_java_practice.string.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToIntegerUsingSubtractionRule {
	public static int romanToInt(String s) {
		int result = 0;
		
		Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
		
		for(int i = 0; i < s.length() - 1; i++) {
			int current = romanMap.get(s.charAt(i));
            int next = romanMap.get(s.charAt(i + 1));

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
		}
		
		result += romanMap.get(s.charAt(s.length() - 1));
        return result;
	}
	
	public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println("Integer value: " + romanToInt(s));
    }
}
