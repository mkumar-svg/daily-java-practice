package daily_java_practice.sliding.window.two.pointer.hard;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumPrefixSum {
	public static int countSubarraysWithSum(int[] nums, int goal) {

        Map<Integer, Integer> prefixSumCount = new HashMap<>();

        int sum = 0;
        int count = 0;

        prefixSumCount.put(0, 1);

        for (int num : nums) {

            sum += num;

            if (prefixSumCount.containsKey(sum - goal)) {
                count += prefixSumCount.get(sum - goal);
            }

            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;

        int result = countSubarraysWithSum(nums, goal);

        System.out.println(result);
    }
}
