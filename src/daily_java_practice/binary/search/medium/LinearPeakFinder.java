package daily_java_practice.binary.search.medium;

public class LinearPeakFinder {
	public static int findPeakElement(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            boolean left = (i == 0) || (nums[i] >= nums[i - 1]);

            boolean right = (i == n - 1) || (nums[i] >= nums[i + 1]);

            if (left && right) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 20, 4, 1, 0};

        int index = findPeakElement(nums);

        System.out.println("Peak at index: " + index + " with value: " + nums[index]);
    }
}
