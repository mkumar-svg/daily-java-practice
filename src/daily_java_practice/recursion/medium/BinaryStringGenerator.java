package daily_java_practice.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class BinaryStringGenerator {
	public static void generateBinaryStrings(int n, String current, List<String> result) {
		if(current.length() == n) {
			result.add(current);
			return;
		}
		
		generateBinaryStrings(n, current+"0", result);
		
		if(current.isEmpty() || current.charAt(current.length() - 1) != '1') {
			generateBinaryStrings(n, current+"1", result);
		}
	}
	
	public static void main(String[] args) {
        int n = 3;
        List<String> result = new ArrayList<>();

        generateBinaryStrings(n, "", result);

        for (String s : result) {
            System.out.print(s + " ");
        }
    }
}
