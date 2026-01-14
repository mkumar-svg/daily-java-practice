package daily_java_practice.arrays.meduim;

public class LongestSubarraySumK {
	public static int longestSubarray(int[] arr, int k) {
		int left = 0;
		int sum = 0;
		int maxLen = 0;
		
		for(int right = 0; right < arr.length; right++) {
			sum += arr[right];
			
			while(sum > k && left <= right) {
				sum -= arr[left];
				left++;
			}
			
			if(sum == k) {
				maxLen = Math.max(maxLen, right-left+1);
			}
		}
		return maxLen;
	}
	
	public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};
        int k = 10;

        System.out.println("Longest subarray length: " + longestSubarray(arr, k));
    }
}
