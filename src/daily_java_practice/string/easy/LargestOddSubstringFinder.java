package daily_java_practice.string.easy;

public class LargestOddSubstringFinder {
	public static String findLargestOddSubstring(String s) {

        int lastOddIndex = -1;

        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 == 1) {
                lastOddIndex = i;
                break;
            }
        }

        if (lastOddIndex == -1) {
            return "";
        }

        int start = 0;
        while (start <= lastOddIndex && s.charAt(start) == '0') {
            start++;
        }

        return s.substring(start, lastOddIndex + 1);
    }

    public static void main(String[] args) {
        String num = "504";
        System.out.println("Largest odd number: " + findLargestOddSubstring(num));
    }
}
