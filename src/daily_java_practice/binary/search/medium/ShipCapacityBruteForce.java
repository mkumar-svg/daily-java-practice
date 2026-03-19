package daily_java_practice.binary.search.medium;

import java.util.Arrays;

public class ShipCapacityBruteForce {
	private static int daysNeeded(int[] weights, int capacity) {
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

    public static int shipWithinDays(int[] weights, int d) {
        int left = Arrays.stream(weights).max().getAsInt(); 
        int right = Arrays.stream(weights).sum();           

        for (int capacity = left; capacity <= right; capacity++) {
            if (daysNeeded(weights, capacity) <= d) {
                return capacity;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;

        int result = shipWithinDays(weights, d);
        System.out.println("Minimum Capacity: " + result);
    }
}
