package daily_java_practice.recursion.easy;

public class SubsequenceSumRecursive {
	public static boolean checkSubsequenceSum(int[] arr, int target) {
        return solve(0, arr.length, arr, target);
    }

    private static boolean solve(int index, int n, int[] arr, int remainingSum) {
        
        if (remainingSum == 0) {
            return true;
        }

        if (remainingSum < 0) {
            return false;
        }

        if (index == n) {
            return false;
        }

        return solve(index + 1, n, arr, remainingSum - arr[index]) ||
               solve(index + 1, n, arr, remainingSum);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int target = 5;

        System.out.println(checkSubsequenceSum(nums, target));  
    }
}
