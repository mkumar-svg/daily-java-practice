package daily_java_practice.binary.search.medium;

public class KthMissingNumberBinarySearch {
	public static int findKthMissing(int[] arr, int k) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return k + high + 1;
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 10};
        int k = 4;

        int result = findKthMissing(arr, k);
        System.out.println("The missing number is: " + result);
    }
}
