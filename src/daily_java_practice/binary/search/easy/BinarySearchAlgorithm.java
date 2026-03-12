package daily_java_practice.binary.search.easy;

public class BinarySearchAlgorithm {
	public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; 

            if (nums[mid] == target) {
                return mid; 
            } else if (nums[mid] < target) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;

        int index = search(nums, target);

        if (index == -1) {
            System.out.println("The target is not present.");
        } else {
            System.out.println("The target is at index: " + index);
        }
    }
}
