package daily_java_practice.sliding.window.two.pointer.hard;

public class NiceSubarraysBruteForce {
	public static int numberOfSubarrays(int[] nums, int k) {

        int count = 0;

        for (int start = 0; start < nums.length; start++) {

            int oddCount = 0;

            for (int end = start; end < nums.length; end++) {

                if (nums[end] % 2 != 0) {
                    oddCount++;
                }

                if (oddCount > k) {
                    break;
                }

                if (oddCount == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 1, 1};
        int k = 3;

        int result = numberOfSubarrays(nums, k);

        System.out.println(result);
    }
}
