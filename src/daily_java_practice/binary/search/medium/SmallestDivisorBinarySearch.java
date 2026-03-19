package daily_java_practice.binary.search.medium;

import java.util.Arrays;

public class SmallestDivisorBinarySearch {
	private static int sumByDivisor(int[] arr, int divisor) {
        int sum = 0;
        for (int num : arr) {
            sum += (num + divisor - 1) / divisor;
        }
        return sum;
    }

    public static int findSmallestDivisor(int[] arr, int limit) {
        if (arr.length > limit) return -1;

        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (sumByDivisor(arr, mid) <= limit) {
                high = mid - 1; 
            } else {
                low = mid + 1;  
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int limit = 8;

        int result = findSmallestDivisor(arr, limit);
        System.out.println("The minimum divisor is: " + result);
    }
}
