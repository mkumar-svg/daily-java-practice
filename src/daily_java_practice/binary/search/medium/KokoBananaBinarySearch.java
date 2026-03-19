package daily_java_practice.binary.search.medium;

import java.util.Arrays;

public class KokoBananaBinarySearch {
	private static int calculateTotalHours(int[] piles, int speed) {
        int totalHours = 0;

        for (int bananas : piles) {
            totalHours += (int) Math.ceil((double) bananas / speed);
        }

        return totalHours;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int maxPile = Arrays.stream(piles).max().getAsInt();

        int low = 1, high = maxPile;
        int ans = maxPile;

        while (low <= high) {
            int mid = (low + high) / 2;

            int totalHours = calculateTotalHours(piles, mid);

            if (totalHours <= h) {
                ans = mid;          
                high = mid - 1;    
            } else {
                low = mid + 1;    
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int result = minEatingSpeed(piles, h);
        System.out.println(result);
    }
}
