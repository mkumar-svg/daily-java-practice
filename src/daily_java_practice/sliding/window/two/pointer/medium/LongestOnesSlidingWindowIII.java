package daily_java_practice.sliding.window.two.pointer.medium;

public class LongestOnesSlidingWindowIII {
	public static int longestOnes(int[] nums, int k) {

        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] == 0) {
                zeroCount++;
            }

            if (zeroCount > k) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;

        int result = longestOnes(nums, k);
        System.out.println("Longest subarray length: " + result);
    }
}
