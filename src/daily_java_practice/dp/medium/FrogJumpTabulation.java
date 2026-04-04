package daily_java_practice.dp.medium;

import java.util.Arrays;

public class FrogJumpTabulation {
	public static int minEnergy(int[] height) {

        if (height == null || height.length == 0) return 0;

        int n = height.length;

        int[] dp = new int[n];

        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;

        for (int ind = 1; ind < n; ind++) {

            int jumpOne = dp[ind - 1] + Math.abs(height[ind] - height[ind - 1]);

            int jumpTwo = Integer.MAX_VALUE;

            if (ind > 1) {
                jumpTwo = dp[ind - 2] + Math.abs(height[ind] - height[ind - 2]);
            }

            dp[ind] = Math.min(jumpOne, jumpTwo);
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {

        int[] height = {30, 10, 60, 10, 60, 50};

        System.out.println(minEnergy(height)); // Expected: 40
    }
}
