package daily_java_practice.arrays.meduim;

import java.util.Arrays;

public class LongestConsecutiveSequenceUsingSorting {
	public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int lastSmaller = Integer.MIN_VALUE;
        int currentCount = 0;
        int longest = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] - 1 == lastSmaller) {
                currentCount++;
                lastSmaller = nums[i];
            } else if (nums[i] != lastSmaller) {
                currentCount = 1;
                lastSmaller = nums[i];
            }

            longest = Math.max(longest, currentCount);
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(nums);

        System.out.println("The longest consecutive sequence length is " + result);
    }
}
