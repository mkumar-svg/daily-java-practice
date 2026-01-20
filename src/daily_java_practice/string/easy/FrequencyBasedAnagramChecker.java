package daily_java_practice.string.easy;

public class FrequencyBasedAnagramChecker {
	public static boolean areAnagrams(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] frequency = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            frequency[s1.charAt(i) - 'A']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            frequency[s2.charAt(i) - 'A']--;
        }

        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "INTEGER";
        String s2 = "TEGERNI";

        System.out.println(areAnagrams(s1, s2));
    }
}
