package daily_java_practice.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class BruteForceParenthesisGenerator {
	private static boolean isValid(String s) {
		int balance = 0;
		
		for(char c : s.toCharArray()) {
			if(c == '(') {
				balance++;
			} else {
				balance--;
			}
			
			if(balance < 0) {
				return false;
			}
		}
		
		return balance == 0;
	}
	
	private static void generateAll(String current, int n, List<String> result) {
		if(current.length() == 2*n) {
			if(isValid(current)) {
				result.add(current);
			}
			return;
		}
		
		generateAll(current + "(", n, result);
		generateAll(current + ")", n, result);
	}
	
	public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateAll("", n, result);
        return result;
    }
	
	public static void main(String[] args) {
        List<String> result = generateParenthesis(3);

        for (String s : result) {
            System.out.println(s);
        }
    }
}
