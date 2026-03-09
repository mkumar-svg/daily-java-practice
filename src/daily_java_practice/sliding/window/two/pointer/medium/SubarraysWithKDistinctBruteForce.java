package daily_java_practice.sliding.window.two.pointer.medium;

import java.util.HashMap;
import java.util.Map;

public class SubarraysWithKDistinctBruteForce {
	public static int subarraysWithKDistinct(int[] nums, int k) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            Map<Integer, Integer> freqMap = new HashMap<>();

            for (int j = i; j < nums.length; j++) {

                freqMap.put(nums[j], freqMap.getOrDefault(nums[j], 0) + 1);

                if (freqMap.size() == k) {
                    count++;
                }

                if (freqMap.size() > k) {
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;

        int result = subarraysWithKDistinct(nums, k);

        System.out.println("Number of subarrays with exactly " + k + " distinct elements: " + result);
    }
}
