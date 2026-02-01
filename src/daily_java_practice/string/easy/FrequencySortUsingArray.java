package daily_java_practice.string.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FrequencySortUsingArray {
	
	static class Pair {
		int freq;
		char ch;
		
		Pair(int freq, char ch) {
			this.freq = freq;
			this.ch = ch;
		}
	}
	
	public static List<Character> frequencySort(String s) {
		Pair[] freq = new Pair[26];
		
		for(int i = 0; i < 26; i++) {
			freq[i] = new Pair(0, (char)(i + 'a'));
		}
		
		for(char ch : s.toCharArray()) {
			freq[ch - 'a'].freq++;
		}
		
		Arrays.sort(freq, (p1, p2) -> {
			if(p1.freq != p2.freq) {
				return p2.freq - p1.freq;
			} else {
				return p1.ch - p2.ch;
			}
		});
		
		List<Character> result = new ArrayList<>();
		for(Pair p : freq) {
			if(p.freq > 0) {
				result.add(p.ch);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

}
