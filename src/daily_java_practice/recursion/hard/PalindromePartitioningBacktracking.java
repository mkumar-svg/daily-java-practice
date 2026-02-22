package daily_java_practice.recursion.hard;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioningBacktracking {
	public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }
	
	private static void backtrack(int start, String s, List<String> current, List<List<String>> result) {
		if(start == s.length()) {
			result.add(new ArrayList<>(current));
			return;
		}
		
		for(int end = start; end < s.length(); end++) {
			if(isPalindrome(s, start, end)) {
				current.add(s.substring(start, end + 1));
				backtrack(end+1, s, current, result);
				current.remove(current.size() - 1);
			}
		}
	}
	
	private static boolean isPalindrome(String s, int left, int right) {
		while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
	}
	
	public static void main(String[] args) {

        String s = "aabaa";

        List<List<String>> partitions = partition(s);

        System.out.println(partitions);
    }
}
