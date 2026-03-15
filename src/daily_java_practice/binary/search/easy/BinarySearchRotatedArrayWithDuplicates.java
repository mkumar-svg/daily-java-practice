package daily_java_practice.binary.search.easy;

public class BinarySearchRotatedArrayWithDuplicates {
	public static boolean search(int[] arr, int target) {

        int low = 0, high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return true;

            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }

            if (arr[low] <= arr[mid]) {

                if (arr[low] <= target && target <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            else {

                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int target = 3;

        boolean result = search(arr, target);

        if (result)
            System.out.println("Target is present in the array.");
        else
            System.out.println("Target is not present.");
    }
}
