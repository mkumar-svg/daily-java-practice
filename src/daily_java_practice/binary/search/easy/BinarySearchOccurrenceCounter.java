package daily_java_practice.binary.search.easy;

public class BinarySearchOccurrenceCounter {
	public static int firstOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int first = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                first = mid;
                high = mid - 1; 
            } 
            else if (arr[mid] < x) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return first;
    }

    public static int lastOccurrence(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int last = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                last = mid;
                low = mid + 1; 
            } 
            else if (arr[mid] < x) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return last;
    }

    public static int countOccurrences(int[] arr, int x) {
        int first = firstOccurrence(arr, x);
        if (first == -1) return 0;

        int last = lastOccurrence(arr, x);
        return last - first + 1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 8, 8, 11, 13};
        int x = 8;

        int result = countOccurrences(arr, x);
        System.out.println("The number of occurrences is: " + result);
    }
}
