package daily_java_practice.recursion.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakDP {
	public static boolean wordBreak(String s, List<String> wordDict) {
		Set<String> dict = new HashSet<>(wordDict);
		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;
		
		for(int i = 1; i <= s.length(); i++) {
			for(int j = 0; j < i; j++) {
				if(dp[j] && dict.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[s.length()];
	}
	
	public static void main(String[] args) {

        List<String> dict1 = Arrays.asList("take", "forward", "you", "u");
        System.out.println(wordBreak("takeuforward", dict1)); // true

        List<String> dict2 = Arrays.asList("apple");
        System.out.println(wordBreak("applepineapple", dict2)); // false
    }
}
