package daily_java_practice.sliding.window.two.pointer.hard;

public class SlidingWindowSubstringCounter {
	public static int countSubstringsWithABC(String s) {

        int[] freq = new int[3];   
        int left = 0;
        int result = 0;
        int n = s.length();

        for (int right = 0; right < n; right++) {

            freq[s.charAt(right) - 'a']++;

            while (freq[0] > 0 && freq[1] > 0 && freq[2] > 0) {

                result += (n - right);

                freq[s.charAt(left) - 'a']--;
                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "abcabc";
        int result = countSubstringsWithABC(s);

        System.out.println("Total substrings containing a, b, and c: " + result);
    }
}
