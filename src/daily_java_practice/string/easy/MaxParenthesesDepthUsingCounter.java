package daily_java_practice.string.easy;

public class MaxParenthesesDepthUsingCounter {
	public static int maxDepth(String s) {
		int currentDepth = 0;
        int maxDepth = 0;
		
		for(char ch : s.toCharArray()) {
			if(ch == '(') {
				currentDepth++;
				maxDepth = Math.max(maxDepth, currentDepth);
			} else if(ch == ')') {
				currentDepth--;
			}
		}
		return maxDepth;
	}
	
	public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int result = maxDepth(s);
        System.out.println("Max Depth: " + result);
    }
}
