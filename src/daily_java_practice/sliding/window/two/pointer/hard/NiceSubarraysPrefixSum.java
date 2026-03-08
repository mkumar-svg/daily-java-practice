package daily_java_practice.sliding.window.two.pointer.hard;

import java.util.HashMap;
import java.util.Map;

public class NiceSubarraysPrefixSum {
	public static int countNiceSubarrays(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1);

        int oddCount = 0;
        int result = 0;

        for (int num : nums) {

            if (num % 2 == 1) {
                oddCount++;
            }

            result += freq.getOrDefault(oddCount - k, 0);

            freq.put(oddCount, freq.getOrDefault(oddCount, 0) + 1);
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;

        int result = countNiceSubarrays(nums, k);
        System.out.println(result);
    }
}
