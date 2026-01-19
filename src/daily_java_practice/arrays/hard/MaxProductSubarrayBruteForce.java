package daily_java_practice.arrays.hard;

public class MaxProductSubarrayBruteForce {
	public static int maxProductSubarray(int[] nums) {
		int maxProduct = nums[0];
		
		for(int i = 0; i < nums.length; i++) {
			int product = 1;
			for(int j = i; j < nums.length; j++) {
				product *= nums[j];
				maxProduct = Math.max(maxProduct, product);
			}
		}
		return maxProduct;
	}
	
	public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};

        System.out.println(maxProductSubarray(nums));
    }
}
