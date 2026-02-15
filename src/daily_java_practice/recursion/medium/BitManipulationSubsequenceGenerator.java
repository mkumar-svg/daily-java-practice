package daily_java_practice.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class BitManipulationSubsequenceGenerator {
	public static List<String> getSubsequences(String s) {
		int n = s.length();		
		int total = 1 << n;
		
		List<String> subsequences = new ArrayList<>();
		
		for(int mask = 0; mask < total; mask++) {
			StringBuilder subseq = new StringBuilder();
			
			for(int i = 0; i < n; i++) {
				if((mask & (1 << i)) != 0) {
					subseq.append(s.charAt(i));
				}
			}
			
			subsequences.add(subseq.toString());
		}
		
		return subsequences;
	}
	
	public static void main(String[] args) {
        String s = "abc";

        List<String> subsequences = getSubsequences(s);

        for (String subseq : subsequences) {
            System.out.println("\"" + subseq + "\"");
        }
    }
}
