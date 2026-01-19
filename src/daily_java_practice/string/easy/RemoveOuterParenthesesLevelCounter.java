package daily_java_practice.string.easy;

public class RemoveOuterParenthesesLevelCounter {
	public static String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();
        int level = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (level > 0) {
                    result.append(ch);
                }
                level++;
            } else { 
                level--;
                if (level > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "(()())(())";

        System.out.println("The result is: " + removeOuterParentheses(s));
    }
}
