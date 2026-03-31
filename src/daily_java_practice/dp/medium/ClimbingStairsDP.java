package daily_java_practice.dp.medium;

import java.util.Arrays;

public class ClimbingStairsDP {
	public static int climbingStairsDP(int n) {
		int[] dp = new int[n+1];
		Arrays.fill(dp, -1);
		
		dp[0] = 1;
		if(n > 0) {
			dp[1] = 1;
		}
		
		for(int i = 2; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		return dp[n];
	}
	
	public static void main(String[] args) {
		int n = 3;
		System.out.println(climbingStairsDP(n));
	}
}
