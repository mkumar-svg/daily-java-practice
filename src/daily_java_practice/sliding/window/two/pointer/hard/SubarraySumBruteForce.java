package daily_java_practice.sliding.window.two.pointer.hard;

public class SubarraySumBruteForce {
	public static int countSubarraysWithSum(int[] nums, int goal) {
        int count = 0;

        for (int start = 0; start < nums.length; start++) {
            int sum = 0;

            for (int end = start; end < nums.length; end++) {
                sum += nums[end];

                if (sum == goal) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        System.out.println(countSubarraysWithSum(nums, goal));
    }
}
