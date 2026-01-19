package daily_java_practice.string.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWordsUsingSplit {
	public static String reverseWords(String s) {

        List<String> words = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                word.append(ch);
            } else if (word.length() > 0) {
                words.add(word.toString());
                word.setLength(0);
            }
        }

        if (word.length() > 0) {
            words.add(word.toString());
        }

        Collections.reverse(words);

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String s = " amazing coding skills ";
        System.out.println(reverseWords(s));
    }
}
