package daily_java_practice.arrays.meduim;

public class NextPermutationOptimal {
	public static void nextPermutation(int[] nums) {

        int index = -1;

        // Step 1: Find the breakpoint
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // Step 2: If no breakpoint, reverse entire array
        if (index == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        // Step 3: Find next greater element and swap
        for (int i = nums.length - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, i, index);
                break;
            }
        }

        // Step 4: Reverse the suffix
        reverse(nums, index + 1, nums.length - 1);
    }

    // Helper method to reverse array section
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // Helper method to swap elements
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        nextPermutation(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
