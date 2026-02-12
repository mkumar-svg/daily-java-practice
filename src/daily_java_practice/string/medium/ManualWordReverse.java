package daily_java_practice.string.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManualWordReverse {
	public static String reverseWords(String s) {
		List<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch != ' ') {
                currentWord.append(ch);
            }
            else if (currentWord.length() > 0) {
                words.add(currentWord.toString());
                currentWord.setLength(0);
            }
        }

        if (currentWord.length() > 0) {
            words.add(currentWord.toString());
        }

        Collections.reverse(words);

        return String.join(" ", words);
	}
	
	public static void main(String[] args) {
        String input = " amazing coding skills ";
        System.out.println(reverseWords(input));
    }
}
