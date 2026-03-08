package daily_java_practice.sliding.window.two.pointer.hard;

public class LongestRepeatingCharacterReplacementBruteForce {
	public static int characterReplacement(String s, int k) {
		int maxLength = 0;
		
		for(int start = 0; start < s.length(); start++) {
			int[] freq = new int[26];
			int maxFreq = 0;
			
			for(int end = start; end < s.length(); end++) {
				char currentChar = s.charAt(end);
				freq[currentChar - 'A']++;
				maxFreq = Math.max(maxFreq, freq[currentChar - 'A']);
				int windowSize = end - start + 1;
				
				int replacements = windowSize - maxFreq;
				if (replacements <= k) {
                    maxLength = Math.max(maxLength, windowSize);
                }
			}
		}
		
		return maxLength;
	}
	
	public static void main(String[] args) {

        String s = "AABABBA";
        int k = 1;

        int result = characterReplacement(s, k);

        System.out.println("Longest Length: " + result);
    }
}
