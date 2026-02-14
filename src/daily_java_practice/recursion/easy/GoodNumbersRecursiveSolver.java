package daily_java_practice.recursion.easy;

public class GoodNumbersRecursiveSolver {
	private static final int MOD = 1_000_000_007;
	
	public static int countGoodNumbers(int index, int n) {
		if(index == n) {
			return 1;
		}
		
		int result = 0;
		
		if(index%2 == 0) {
			for(int i = 0; i < 5; i++) {
				result = (result + countGoodNumbers(index+1, n))%MOD;
			}
		} else {
			for(int i = 0; i < 4; i++) {
				result = (result + countGoodNumbers(index+1, n))%MOD;
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
        int n = 1;  
        System.out.println(countGoodNumbers(0, n));
    }
}
