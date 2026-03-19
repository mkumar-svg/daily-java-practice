package daily_java_practice.binary.search.medium;

import java.util.Arrays;

public class KokoBananaBruteForce {
	public static int calculateTotalHours(int[] piles, int hourlySpeed) {
		int totalHours = 0;
		for(int pile : piles) {
			totalHours += (int)Math.ceil((double) pile / hourlySpeed);
		}
		return totalHours;
	}
	
	public static int minEatingSpeed(int[] piles, int h) {
		int maxVal = Arrays.stream(piles).max().getAsInt();
		
		for(int speed = 1; speed <= maxVal; speed++) {
			int hours = calculateTotalHours(piles, speed);
			if(hours <= h) {
				return speed;
			}
		}
		return maxVal;
	}
	
	public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int result = minEatingSpeed(piles, h);
        System.out.println(result);
    }
}
