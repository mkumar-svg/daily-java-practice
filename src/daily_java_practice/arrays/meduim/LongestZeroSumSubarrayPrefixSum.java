package daily_java_practice.arrays.meduim;

import java.util.HashMap;
import java.util.Map;

public class LongestZeroSumSubarrayPrefixSum {
	public static int findLongestZeroSumSubarrayLength(int[] arr) {
		int maxLength = 0;
		int prefixSum = 0;
		
		Map<Integer, Integer> prefixIndexMap = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			prefixSum += arr[i];
			
			if(prefixSum == 0) {
				maxLength = i+1;
			} else if(prefixIndexMap.containsKey(prefixSum)) {
				maxLength = Math.max(maxLength, i-prefixIndexMap.get(prefixSum));
			} else {
				prefixIndexMap.put(prefixSum, i);
			}
		}
		return maxLength;
	}
	
	public static void main(String[] args) {
        int[] arr = {9, -3, 3, -1, 6, -5};

        int longestLength =
                findLongestZeroSumSubarrayLength(arr);

        System.out.println("Length of longest zero-sum subarray: "
                + longestLength);
    }
}
