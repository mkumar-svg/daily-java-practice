package daily_java_practice.binary.search.medium;

import java.util.Arrays;

public class MinimumDaysForBouquetsBinarySearch {
	private static boolean canMakeBouquets(int[] bloomDays, int day, int m, int k) {
        int consecutive = 0;
        int bouquetCount = 0;

        for (int bloom : bloomDays) {
            if (bloom <= day) {
                consecutive++;
                if (consecutive == k) {
                    bouquetCount++;
                    consecutive = 0;
                }
            } else {
                consecutive = 0;
            }
        }

        return bouquetCount >= m;
    }

    public static int findMinimumDays(int[] bloomDays, int m, int k) {
        if ((long) m * k > bloomDays.length) return -1;

        int minDay = Arrays.stream(bloomDays).min().getAsInt();
        int maxDay = Arrays.stream(bloomDays).max().getAsInt();

        int low = minDay, high = maxDay;
        int answer = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canMakeBouquets(bloomDays, mid, m, k)) {
                answer = mid;
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] bloomDays = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2, k = 3;

        int result = findMinimumDays(bloomDays, m, k);

        if (result == -1) {
            System.out.println("Not possible to make required bouquets.");
        } else {
            System.out.println("Minimum day to make bouquets: " + result);
        }
    }
}
