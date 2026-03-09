package daily_java_practice.sliding.window.two.pointer.medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithKDistinctSlidingWindow {
	public static int countAtMostKDistinct(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            if (freq.get(nums[right]) == 1) {
                k--;
            }

            while (k < 0) {
                freq.put(nums[left], freq.get(nums[left]) - 1);

                if (freq.get(nums[left]) == 0) {
                    k++;
                }

                left++;
            }

            count += (right - left + 1);
        }

        return count;
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
        return countAtMostKDistinct(nums, k) - countAtMostKDistinct(nums, k - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;

        int result = subarraysWithKDistinct(nums, k);
        System.out.println(result);
    }
}
