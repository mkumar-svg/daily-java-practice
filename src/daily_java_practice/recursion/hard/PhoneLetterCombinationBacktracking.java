package daily_java_practice.recursion.hard;

import java.util.ArrayList;
import java.util.List;

public class PhoneLetterCombinationBacktracking {
private static final String[] MAP = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	private static void generateCombinations(String digits, int index, String current, List<String> result) {
		if(index == digits.length()) {
			result.add(current);
			return;
		}
		
		String letters = MAP[digits.charAt(index) - '0'];
		
		for(int i = 0; i < letters.length(); i++) {
			generateCombinations(digits, index + 1, current + letters.charAt(i), result);
		}
	}
	
	public static List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return result;

        generateCombinations(digits, 0, "", result);
        return result;
    }

    public static void main(String[] args) {

        String digits = "23";
        List<String> combinations = letterCombinations(digits);

        for (String s : combinations) {
            System.out.print(s + " ");
        }
    }
}
