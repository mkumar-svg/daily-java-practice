package daily_java_practice.sliding.window.two.pointer.medium;

public class LongestOnesBruteForce {
	public static int longestOnes(int[] nums, int k) {
		int maxLen = 0;
		for(int i = 0; i < nums.length; i++) {
			int zeros = 0;
			for(int j = i; j < nums.length; j++) {
				if(nums[j] == 0) {
					zeros++;
				}
				
				if (zeros > k) {
                    break;
                }

                maxLen = Math.max(maxLen, j - i + 1);
			}
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
