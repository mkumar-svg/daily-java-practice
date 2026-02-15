package daily_java_practice.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class BacktrackingParenthesisGenerator {
	public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack("", 0, 0, n, result);
        return result;
    }
	
	private static void backtrack(String current, int open, int close, int n, List<String> result) {
        
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            backtrack(current + "(", open + 1, close, n, result);
        }

        if (close < open) {
            backtrack(current + ")", open, close + 1, n, result);
        }
    }
	
	public static void main(String[] args) {
        List<String> result = generateParenthesis(3);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
