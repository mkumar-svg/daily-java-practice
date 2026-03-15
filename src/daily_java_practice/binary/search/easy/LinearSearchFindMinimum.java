package daily_java_practice.binary.search.easy;

public class LinearSearchFindMinimum {
	public static int findMin(int[] nums) {

        int minVal = Integer.MAX_VALUE;

        for (int num : nums) {
            minVal = Math.min(minVal, num);
        }

        return minVal;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        int result = findMin(nums);

        System.out.println("Minimum element is " + result);
    }
}
