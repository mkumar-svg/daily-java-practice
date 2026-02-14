package daily_java_practice.recursion.easy;

public class ExponentiationBySquaring {
	public static double myPow(double x, int n) {
		long exponent = n;
		
		if(exponent < 0) {
			x = 1/x;
			exponent = -exponent;
		}
		
		return power(x, exponent);
	}
	
	public static double power(double x, long n) {
		if(n == 0) {
			return 1.0;
		}
		
		double half = power(x, n/2);
		
		if(n%2 == 0) {
			return half * half;
		} else {
			return half * half * x;
		}
	}
	
	public static void main(String[] args) {
        double x = 2.0;
        int n = 10;

        double result = myPow(x, n);

        System.out.println(x + "^" + n + " = " + result);
    }
}
