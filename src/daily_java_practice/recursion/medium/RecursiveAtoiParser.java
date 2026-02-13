package daily_java_practice.recursion.medium;

public class RecursiveAtoiParser {
	private static final int INT_MIN = Integer.MIN_VALUE;
	private static final int INT_MAX = Integer.MAX_VALUE;
	
	public static int myAtoi(String s) {
		if(s == null || s.length() == 0) {
			return 0;
		}
		
		int index = 0;
		int n = s.length();
		
		while(index < n && s.charAt(index) == ' ') {
			index++;
		}
		
		int sign = 1;
		if(index < n && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
			sign = (s.charAt(index) == '-') ? -1 : 1;
			index++;
		}
		
		return parseRecursively(s, index, 0L, sign);
	}
	
	private static int parseRecursively(String s, int index, long number, int sign) {
		if(index >= s.length() || !Character.isDigit(s.charAt(index))) {
			return (int) (sign * number);
		}
		
		number = number * 10 + (s.charAt(index) - '0');
		
		long signedValue = sign * number;
		
		if(signedValue <= INT_MIN) {
			return INT_MIN;
		}
		
		if(signedValue >= INT_MAX) {
			return INT_MAX;
		}
		
		return parseRecursively(s, index + 1, number, sign);
	}
	
	public static void main(String[] args) {
        String s = "   -12345";
        System.out.println(myAtoi(s));  
    }
}
