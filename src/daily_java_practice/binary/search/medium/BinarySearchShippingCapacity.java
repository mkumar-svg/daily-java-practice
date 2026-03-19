package daily_java_practice.binary.search.medium;

import java.util.Arrays;

public class BinarySearchShippingCapacity {
	private static int calculateDays(int[] weights, int capacity) {
        int days = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                days++;
                currentLoad = w;
            } else {
                currentLoad += w;
            }
        }
        return days;
    }

    public static int findMinimumCapacity(int[] weights, int d) {
        int left = Arrays.stream(weights).max().getAsInt(); 
        int right = Arrays.stream(weights).sum();           

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (calculateDays(weights, mid) <= d) {
                right = mid;   
            } else {
                left = mid + 1; 
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;

        System.out.println(findMinimumCapacity(weights, d));
    }
}
