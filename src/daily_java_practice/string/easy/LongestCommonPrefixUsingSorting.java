package daily_java_practice.string.easy;

import java.util.Arrays;

public class LongestCommonPrefixUsingSorting {
	public static String findLongestCommonPrefix(String[] words) {

        if (words == null || words.length == 0) {
            return "";
        }

        Arrays.sort(words);

        String first = words[0];
        String last = words[words.length - 1];

        StringBuilder prefix = new StringBuilder();

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            }
            prefix.append(first.charAt(i));
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        String[] input = {"interview", "internet", "internal", "interval"};
        System.out.println(
            "Longest Common Prefix: " + findLongestCommonPrefix(input)
        );
    }
}
