package daily_java_practice.dp.medium;

public class FrogJumpSpaceOptimizedDP {
	public static int getMinEnergy(int[] height) {
        if (height == null || height.length == 0) return 0;

        int n = height.length;
        if (n == 1) return 0;

        int prev = 0;   // dp[i-1]
        int prev2 = 0;  // dp[i-2]

        for (int i = 1; i < n; i++) {
            int jumpOne = prev + Math.abs(height[i] - height[i - 1]);

            int jumpTwo = Integer.MAX_VALUE;
            if (i > 1) {
                jumpTwo = prev2 + Math.abs(height[i] - height[i - 2]);
            }

            int current = Math.min(jumpOne, jumpTwo);

            prev2 = prev;
            prev = current;
        }

        return prev;
    }

    public static void main(String[] args) {
        int[] height = {30, 10, 60, 10, 60, 50};

        System.out.println(getMinEnergy(height)); // Expected: 40
    }
}
