package daily_java_practice.binary.search.medium;

public class RotatedArrayLinearSearch {
	public static int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int index = search(nums, target);

        System.out.println(index);
    }
}
