package daily_java_practice.string.medium;

public class RecursiveAtoiParser {
	private static final int INT_MIN = -2147483648;
	private static final int INT_MAX = 2147483647;
	
	public static int myAtoi(String s) {
		int i = 0;
		
		while(i < s.length() && s.charAt(i) == ' ') {
			i++;
		}
		
		int sign = 1;
		if(i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
			sign = (s.charAt(i) == '-') ? -1 : 1;
			i++;
		}
		
		return parseRecursively(s, i, 0L, sign);
	}
	
	private static int parseRecursively(String s, int index, long number, int sign) {

        if (index >= s.length() || !Character.isDigit(s.charAt(index))) {
            return (int) (sign * number);
        }

        number = number * 10 + (s.charAt(index) - '0');

        if (sign * number <= INT_MIN) return INT_MIN;
        if (sign * number >= INT_MAX) return INT_MAX;

        return parseRecursively(s, index + 1, number, sign);
    }
	
	public static void main(String[] args) {
        String s = "   -12345";
        System.out.println(myAtoi(s)); 
    }
}
