package daily_java_practice.arrays.meduim;

public class MaximumSubarrayCalculator {
	public static int maxSubArray(int[] nums) {
        long maximumSum = Long.MIN_VALUE;
        long currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            if (currentSum > maximumSum) {
                maximumSum = currentSum;
            }

            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return (int) maximumSum;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("The maximum subarray sum is: " + maxSubArray(arr));
    }
}
