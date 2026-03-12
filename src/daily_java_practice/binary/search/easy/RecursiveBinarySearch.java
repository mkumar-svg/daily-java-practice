package daily_java_practice.binary.search.easy;

public class RecursiveBinarySearch {
	public static int binarySearch(int[] nums, int low, int high, int target) {
        if (low > high) {
            return -1; 
        }

        int mid = low + (high - low) / 2; 

        if (nums[mid] == target) {
            return mid; 
        } 
        else if (target > nums[mid]) {
            return binarySearch(nums, mid + 1, high, target);
        } 
        else {
            return binarySearch(nums, low, mid - 1, target); 
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;

        int index = binarySearch(nums, 0, nums.length - 1, target);

        if (index == -1) {
            System.out.println("Target not found.");
        } else {
            System.out.println("Target found at index: " + index);
        }
    }
}
