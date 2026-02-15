package daily_java_practice.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class RecursiveSubsequenceGenerator {
	private static void generateSubsequences(String s, int index, StringBuilder current, List<String> result) {
		if(index == s.length()) {
			result.add(current.toString());
			return;
		}
		
		generateSubsequences(s, index+1, current, result);
		
		current.append(s.charAt(index));
		generateSubsequences(s, index + 1, current, result);
		
		current.deleteCharAt(current.length() - 1);
	}
	
	public static List<String> getSubsequences(String s) {
        List<String> result = new ArrayList<>();
        generateSubsequences(s, 0, new StringBuilder(), result);
        return result;
    }

    public static void main(String[] args) {
        String s = "abc";

        List<String> subsequences = getSubsequences(s);

        for (String subseq : subsequences) {
            System.out.println("\"" + subseq + "\"");
        }
    }
}
