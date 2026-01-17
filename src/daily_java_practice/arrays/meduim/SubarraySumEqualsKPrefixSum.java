package daily_java_practice.arrays.meduim;

import java.util.HashMap;

public class SubarraySumEqualsKPrefixSum {
	public static int countSubarraysWithSumK(int[] arr, int k) {

        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();

        int prefixSum = 0;
        int count = 0;

        prefixSumCount.put(0, 1);

        for (int num : arr) {
            prefixSum += num;

            int requiredPrefix = prefixSum - k;

            if (prefixSumCount.containsKey(requiredPrefix)) {
                count += prefixSumCount.get(requiredPrefix);
            }

            prefixSumCount.put(
                prefixSum,
                prefixSumCount.getOrDefault(prefixSum, 0) + 1
            );
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 4};
        int k = 6;

        int result = countSubarraysWithSumK(arr, k);

        System.out.println("The number of subarrays is: " + result);
    }
}
