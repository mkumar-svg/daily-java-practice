package daily_java_practice.binary.search.medium;

public class PeakElementBinarySearch {
	public static int findPeakElement(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                high = mid;        
            } else {
                low = mid + 1;     
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 3, 5, 6, 4};

        int peakIndex = findPeakElement(nums);

        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + nums[peakIndex]);
    }
}
