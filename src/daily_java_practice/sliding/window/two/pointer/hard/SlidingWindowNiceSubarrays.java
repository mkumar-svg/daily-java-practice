package daily_java_practice.sliding.window.two.pointer.hard;

public class SlidingWindowNiceSubarrays {
	public static int countAtMost(int[] nums, int k) {
        int left = 0;
        int result = 0;

        for (int right = 0; right < nums.length; right++) {

            if (nums[right] % 2 != 0) {
                k--;
            }

            while (k < 0) {
                if (nums[left] % 2 != 0) {
                    k++;
                }
                left++;
            }

            result += (right - left + 1);
        }

        return result;
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        return countAtMost(nums, k) - countAtMost(nums, k - 1);
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;

        int result = numberOfSubarrays(nums, k);
        System.out.println(result);
    }
}
