package daily_java_practice.recursion.easy;

public class RecursiveSubsequenceSumCounter {
	private static int countSubsequences(int index, int remainingSum, int[] nums) {
		if(remainingSum == 0) {
			return 1;
		}
		
		if (remainingSum < 0 || index == nums.length) {
            return 0;
        }
		
		int include = countSubsequences(index+1, remainingSum - nums[index], nums);
		int exclude = countSubsequences(index+1, remainingSum, nums);
		
		return include + exclude;
	}
	
	public static int countSubsequenceWithTargetSum(int[] nums, int target) {
        return countSubsequences(0, target, nums);
    }
	
	public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int target = 5;

        int result = countSubsequenceWithTargetSum(nums, target);

        System.out.println("Number of subsequences with target sum " + target + ": " + result);
    }
}
