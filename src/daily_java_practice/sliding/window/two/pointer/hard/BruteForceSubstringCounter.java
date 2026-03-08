package daily_java_practice.sliding.window.two.pointer.hard;

public class BruteForceSubstringCounter {
	public static int numberOfSubstrings(String s) {

        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {

            int[] freq = new int[3]; 

            for (int j = i; j < n; j++) {

                freq[s.charAt(j) - 'a']++;

                if (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        String s = "abcabc";

        int result = numberOfSubstrings(s);

        System.out.println("Number of valid substrings: " + result);
    }
}
