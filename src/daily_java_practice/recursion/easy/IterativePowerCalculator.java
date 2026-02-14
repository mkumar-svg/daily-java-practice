package daily_java_practice.recursion.easy;

public class IterativePowerCalculator {
	public static double calculatePower(double x, int n) {
		if(n == 0) {
			return 1.0;
		}
		
		if(x == 1.0) {
			return 1.0;
		}
		
		long exponent = n;
		
		if(exponent < 0) {
			x = 1/x;
			exponent = -exponent;
		}
		
		double result = 1.0;
		
		for(int i = 0; i < exponent; i++) {
			result *= x;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
        // Output: 1024.0000
        System.out.printf("%.4f\n", calculatePower(2.0000, 10));

        // Output: 0.2500
        System.out.printf("%.4f\n", calculatePower(2.0000, -2));
    }
}
